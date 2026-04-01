package co.com.bancolombia.graphqlapi;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class ApiMutations {

    //private final MyUseCase useCase;


    @MutationMapping
    public String addSomething(@Argument("objectRequest") String objRequest/* change for object request */) {
        //return useCase.doAction(objRequest);
        return "Hello world from graphql-api mutations " + objRequest;
    }
}