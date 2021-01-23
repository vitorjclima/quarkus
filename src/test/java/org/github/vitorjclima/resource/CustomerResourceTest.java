package org.github.vitorjclima.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CustomerResourceTest {

    @Test
    public void testAddNewCustomer() {
        given().when().get("/customers").then().statusCode(SC_OK).body(is("hello"));
    }
}
