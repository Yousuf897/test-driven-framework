package tests;

import com.companyname.config.PropertiesLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertiesLoaderTest {

    @Test
    public void testGetProperty() {
       String actualAppName = PropertiesLoader.get("app.name");
       String expectedAppName = "TDD Framework";
       assertEquals(expectedAppName, actualAppName, "The app name should match the value in application properties.");
    }

    @Test
    public void testGetPropertyWithDefaultValue() {
        String nonExistentKey = PropertiesLoader.get("non.existent.key", "Default Value");
        assertEquals("Default Value", nonExistentKey, "Should return Default Value.");
    }

}
