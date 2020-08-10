Feature: Hear Shout

  Shouts have a range of approximately 1000m

  Background:
    Given Lucy is at 0, 0

  @Smoke
  Scenario Outline: only hear in-range shouts
    And Sean is at <Seans-location>
    When Sean shouts
    Then Lucy should <should-Lucy-hear> <what-Lucy-hears>
    Examples: some simple examples
      | Seans-location | should-Lucy-hear | what-Lucy-hears |
      | 0, 900 | hear | Sean |
      | 800, 800 | not hear | Sean |

  Scenario: Multiple shouters
    Given people are located at
      | name  | x    | y   |
      | Sean  | 0    | 500 |
      | Oscar | 1100 | 0   |
    When Sean shouts
    And Oscar shouts
    Then Lucy should not hear Oscar
    But Lucy should hear Sean

  Scenario: shouters should not hear their own shouts
    When Lucy shouts
    Then Lucy should not hear Lucy

  @wip
  Scenario: Multiple shouts from one person
    And Sean is at 0, 500
    When Sean shouts
    And Sean shouts
    Then Lucy should hear 2 shouts from Sean