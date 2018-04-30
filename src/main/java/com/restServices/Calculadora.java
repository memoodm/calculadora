package com.restServices;

import com.utilities.ComprobarCantidadEntradas;
import com.utilities.ComprobarValoresNumeros;
import com.utilities.OperarCalculadora;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("calculator")
public class Calculadora {
    
    @EJB
    OperarCalculadora operador;
    
    @EJB
    ComprobarValoresNumeros comprobarValores;
    
    @EJB
    ComprobarCantidadEntradas comprobarCantidadEntradas;
            
    /*
        Operacion de Suma
    */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("add/{numbers: [a-zA-Z0-9_///-]+}")
    public String sumar(@PathParam("numbers") String numbers){
        String[] arrayNumbers = numbers.split("/");
        if(!comprobarValores.ejecturarComprobacion(arrayNumbers)){ return "Algunos de los parametros introducidos contienen caracteres";}
        if(!comprobarCantidadEntradas.ejecturarComprobacion(arrayNumbers)){ return "Se requiere 2 parametros como minimo";}
        return operador.suma(arrayNumbers);
    }
    
    /*
        Operacion de Resta
    */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("subs/{numbers: [0-9_///-]+}")
    public String restar(@PathParam("numbers") String numbers){
        String[] arrayNumbers = numbers.split("/");
        if(!comprobarValores.ejecturarComprobacion(arrayNumbers)){ return "Algunos de los parametros introducidos contienen caracteres";}
        if(!comprobarCantidadEntradas.ejecturarComprobacion(arrayNumbers)){ return "Se requiere 2 parametros como minimo";}
        return operador.resta(arrayNumbers);
    }
    
    /*
        Operacion de Multiplicacion
    */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("mult/{numbers: [0-9_///-]+}")
    public String multiplicar(@PathParam("numbers") String numbers){
        String[] arrayNumbers = numbers.split("/");
        if(!comprobarValores.ejecturarComprobacion(arrayNumbers)){ return "Algunos de los parametros introducidos contienen caracteres";}
        if(!comprobarCantidadEntradas.ejecturarComprobacion(arrayNumbers)){ return "Se requiere 2 parametros como minimo";}
        return operador.multiplicacion(arrayNumbers);
    }
    
    /*
        Operacion de Division
    */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("div/{numbers: [0-9_///-]+}")
    public String dividir(@PathParam("numbers") String numbers){
        String[] arrayNumbers = numbers.split("/");
        if(!comprobarValores.ejecturarComprobacion(arrayNumbers)){ return "Algunos de los parametros introducidos contienen caracteres";}
        if(!comprobarCantidadEntradas.ejecturarComprobacion(arrayNumbers)){ return "Se requiere 2 parametros como minimo";}
        return operador.division(arrayNumbers);
    }
    
}