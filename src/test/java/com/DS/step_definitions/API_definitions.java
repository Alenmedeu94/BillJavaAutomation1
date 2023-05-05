package com.DS.step_definitions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class API_definitions {

    @Test
    public void testListUsers() {
        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                body("data.id[0]", equalTo(7)).
                body("data.first_name", hasItems("Michael", "Lindsay", "Tobias"));
    }
}
