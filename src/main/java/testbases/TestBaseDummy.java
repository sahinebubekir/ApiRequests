package testbases;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBaseDummy {
    protected RequestSpecification spec03;

    @Before
    public void setUp03(){
        spec03 = new RequestSpecBuilder().
                setBaseUri("http://dummy.restapiexample.com/api/v1").
                build();
    }
}