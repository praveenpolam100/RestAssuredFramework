package airlines;

import utils.Util;

import java.io.IOException;
import java.util.Map;

public class Base {

    public static Map<String, Object> jsonMap;
    public static Map<String, Object> jsonfiletoMap() throws IOException {

        String env = System.getProperty("environment") == null? "qa":System.getProperty("environment");
        String fileAbsolutePath = System.getProperty("user.dir")+ "/src/test/resources/"+env+"/apiData.json";

        jsonMap = Util.filetoMap(fileAbsolutePath);
        return jsonMap;

    }
}
