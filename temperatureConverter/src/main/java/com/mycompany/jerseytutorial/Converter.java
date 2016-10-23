package com.mycompany.jerseytutorial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conorprunty
 */
public class Converter {
    
    public double fahrToCel(double fahr){
        return ((fahr - 32)*5)/9;
    }
    
    public double celToFahr(double cel){
        return ((cel*9)/5)+32;
    }
}
