package com.utilities;

import java.util.Arrays;
import javax.ejb.Stateless;

@Stateless
public class ComprobarValoresNumeros {
    
    public boolean ejecturarComprobacion(String[] entradaNumeros){
        try{
              Arrays
                .asList(entradaNumeros)
                .parallelStream()
                .forEach(e->Integer.parseInt(e));                    
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
}
