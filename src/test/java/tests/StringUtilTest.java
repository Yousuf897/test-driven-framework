package tests;

import com.companyname.utils.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testUpperCase() {
        String input = "hello";
        String expected = "HELLO";

        String actual = StringUtil.toUpperCase(input);

        Assertions.assertEquals(
                expected,
                actual,
                "The toUpperCase method is not working!"
        );
    }

    @Test
    public void testLowerCase() {
        String input = "HELLO";
        String expected = "hello";

        String actual = StringUtil.toLowerCase(input);

        Assertions.assertEquals(
                expected,
                actual,
                "The toUpperCase method is not working!"
        );
    }

}
