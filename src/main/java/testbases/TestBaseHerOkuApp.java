package testbases;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBaseHerOkuApp {
    protected RequestSpecification spec02;

    @Before
    public void setUp(){

        spec02 = new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com/booking").
                build();
    }
}
