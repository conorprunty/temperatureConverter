/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author conorprunty
 */
@Path("/converter")
public class Cel_To_Fahr_Service {

    @GET
    @Path("/c2fservice")
    @Produces("application/json")
    public Response FahrToCelConversion(@Context UriInfo info) {
        Gson gson = new Gson();

        String celsius = info.getQueryParameters().getFirst("celsius");
        Converter c = new Converter();
        String result = String.format(("%.2f"), (c.celToFahr(Double.parseDouble(celsius))));

        if (result.isEmpty()) {
            return Response.status(200)
                    .entity("You left the number blank")
                    .build();
        } else {
            return Response.status(200).entity("The Fahrenheit equivalent of " + celsius + " is " + gson.toJson(result)).build();
        }

    }
}
