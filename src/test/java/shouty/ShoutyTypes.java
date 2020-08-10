package shouty;

import cucumber.api.TypeRegistry;

import java.util.Locale;

public class ShoutyTypes implements cucumber.api.TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
    }

}
