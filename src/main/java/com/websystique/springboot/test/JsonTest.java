/*
package com.websystique.springboot.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {

    public static void main (String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        try {
            MyValue myValue = mapper.readValue(jsonString, MyValue.class);
            System.out.println(myValue);

            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myValue);

            System.out.println(jsonString);
        }
            catch (Exception e) { e.printStackTrace(); }
        }
    }*/
