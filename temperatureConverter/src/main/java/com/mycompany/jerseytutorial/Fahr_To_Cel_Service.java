/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import com.google.gson.Gson;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author conorprunty
 */
@Path("/converter")
public class Fahr_To_Cel_Service {

    @GET
    @Path("/f2cservice")
    @Produces("application/json")
    public Response FahrToCelConversion(@Context UriInfo info) {
        Gson gson = new Gson();

        String fahrenheit = info.getQueryParameters().getFirst("fahrenheit");
        Converter c = new Converter();
        String result = String.format(("%.2f"), (c.fahrToCel(Double.parseDouble(fahrenheit))));

        return Response.status(200).entity("The Celsius equivalent of " + fahrenheit + " is " + gson.toJson(result)).build();

    }
//    
//    @POST
//    @Path("/echo")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response post(String entity){
//       return Response.status(200).entity(entity).build();
//    }
}
