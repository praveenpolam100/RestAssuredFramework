package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Util {

    public static ObjectMapper objectMapper = new ObjectMapper();
    public static Map<String, Object> filetoMap(String filePath) throws IOException {

        Map<String, Object> data;
        data = objectMapper.readValue(new File(filePath), new TypeReference<Map<String, Object>>() {});
        return data;
    }

    }