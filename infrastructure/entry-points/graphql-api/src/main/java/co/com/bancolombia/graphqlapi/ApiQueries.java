package co.com.bancolombia.graphqlapi;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
/**
* To interact with the API make use of Playground in the "/graphiql" path, but remember,
* Playground ONLY must be used in dev or qa environments, not in production.
*/
public class ApiQueries {

//  private final MyUseCase useCase;


    @QueryMapping
    public String getSomething(@Argument("id") String id/* change for object request */) {
        //return useCase.doAction(objRequest);
        return "Hello world from graphql-api queries " + id;
    }
}