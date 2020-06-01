package edu.quarkus.dynamodb;

import io.quarkus.test.junit.QuarkusTest;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FruitResourceTest {

    @Ignore
    public void testHelloEndpoint() {
        given()
          .when().get("/C:/Program Files/Git/fruits")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}