package org.my.group;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MyResource {

    @Inject
    private HelloService helloService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return helloService.sayHello();
    }


    @POST
    @Path("/newExample/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addHello(@HeaderParam("token") String hname,
                           @PathParam("id") String pathParameter,
                           @QueryParam("name") String aName,
                           String body){
        return "{\"key\":\""+aName+" - "+hname+" - "+pathParameter+"\"}";
    }
}