package com.google.training.helloworld;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;

/** * Defines endpoint functions APIs.. */

@Api(name = "helloworldendpoints", version = "v1",
scopes = {Constants.EMAIL_SCOPE },
        clientIds = {Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID },
        description = "API for hello world endpoints.")

public class HelloWorldEndpoints {
	
	//Query query = new Query();

    // Declare this method as a method available externally through End points
    @ApiMethod(name = "sayHelloByName", path = "sayHelloByName",
            httpMethod = HttpMethod.GET)

    public CompanyInfo sayHelloByName (@Named("race") String raceVar, @Named("company") String companyVar) {
    		//return new CompanyInfo(raceVar, companyVar);
        return Query.lookUp(raceVar, companyVar);
    }     
}
