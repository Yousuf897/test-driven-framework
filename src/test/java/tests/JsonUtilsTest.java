package tests;

import com.companyname.utils.JsonUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class JsonUtilsTest {

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println(
                JsonUtils.readJsonFile(
                        "user.json"
                )
        );
    }

}
