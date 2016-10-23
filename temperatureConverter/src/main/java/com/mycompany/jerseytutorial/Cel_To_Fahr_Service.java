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
@Path("/cel2fahr")
public class Cel_To_Fahr_Service {
    @GET
    @Path("/{param}")
    public Response celToFahrConversion(@PathParam("param") String input) {
        Converter c = new Converter();
        
        Double userInput = Double.parseDouble(input);
        double ansOut = c.celToFahr(userInput);
        String formatAnsOut = String.format("%.2f", ansOut);
        
        String output = input + " Celsius is "+ formatAnsOut + " in Fahrenheit";
        return Response.status(200).entity(output).build();
    }
}
