package shouty;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    public int distanceFrom(Coordinate other) {
        // actually calculate distance between the coordinates.
        return (int) Math.hypot(x - other.x, y - other.y);
    }
}
