package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class GreetingResource {

    // curl -w "\n" http://localhost:8080/hello
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Me";
    }

    // curl -w "\n" http://localhost:8080/hello/json
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloJson() {
        return "{\"message\": \"Hello Me\"}";
    }
}