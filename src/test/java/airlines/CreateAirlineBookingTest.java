package airlines;

import groovyjarjarantlr4.v4.runtime.misc.Utils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restutils.RestUtil;
import utils.Util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CreateAirlineBookingTest{

    @Test
    public void createAirlineBooking() throws IOException {

        Map<String, Object>bookingDates = new HashMap<>();
        bookingDates.put("checkin", "2018-01-01");
        bookingDates.put("checkout","2019-01-01");

        Map<String, Object> requestPayload = new HashMap<>();
        requestPayload.put("firstname", "Praveen");
        requestPayload.put("lastname", "Brown");
        requestPayload.put("totalprice", 115);
        requestPayload.put("depositpaid", true);
        requestPayload.put("bookingdates", bookingDates);
        requestPayload.put("additionalneeds", "Breakfast");

       Response response = AirlineAPIs.createBooking(requestPayload);

        Assert.assertEquals(response.statusCode(), 200);

    }


}
