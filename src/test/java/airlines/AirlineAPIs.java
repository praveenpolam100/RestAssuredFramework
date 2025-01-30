package airlines;

import io.restassured.response.Response;
import restutils.RestUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineAPIs {

    public static Response createBooking(Map<String, Object> requestPayload) throws IOException {
        String uri;
        Map<String, Object> jsonfileMap = Base.jsonfiletoMap();
        uri = (String) jsonfileMap.get("appurl");
        return RestUtil.postRequest(uri,requestPayload, new HashMap<>());
    }

}
