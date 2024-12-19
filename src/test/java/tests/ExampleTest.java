package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest extends BaseTest {

    @Test
    public void testEnableDebugLogging() {

        log("Testing base test...");

        Assertions.assertNotNull(baseUrl, "Base url should not be null.");

        log("Testing for base url is success.");

    }

}
