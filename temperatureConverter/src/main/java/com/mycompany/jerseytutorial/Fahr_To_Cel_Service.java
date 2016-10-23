/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author conorprunty
 */
@Path("/fahr2cel")
public class Fahr_To_Cel_Service {

    @GET
    @Path("/{param}")
    public Response FahrToCelConversion(@PathParam("param") String input) {
        Converter c = new Converter();

        Double userInput = Double.parseDouble(input);
        double ansOut = c.fahrToCel(userInput);
        String formatAnsOut = String.format("%.2f", ansOut);

        String output = input + " Fahrenheit is "+ formatAnsOut + " in Celsius";
        return Response.status(200).entity(output).build();
    }
}
