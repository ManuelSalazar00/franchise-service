package co.com.bancolombia.graphqlapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApiQueriesTest {

    @Test
    void addSomethingTest(){
        ApiQueries apiQueries = new ApiQueries();
        var objRequest = "objRequest";
        var addSomething = apiQueries.getSomething(objRequest);

        Assertions.assertNotNull(addSomething);
    }
}