package co.com.bancolombia.graphqlapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApiMutationsTest {

    @Test
    void addSomethingTest(){
        ApiMutations apiMutations = new ApiMutations();
        var objRequest = "objRequest";
        var addSomething = apiMutations.addSomething(objRequest);

        Assertions.assertNotNull(addSomething);
    }
}