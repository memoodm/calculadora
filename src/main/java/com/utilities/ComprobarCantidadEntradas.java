package com.utilities;

import javax.ejb.Stateless;

@Stateless
public class ComprobarCantidadEntradas {
    
    public boolean ejecturarComprobacion(String[] entradaNumeros){
        if(entradaNumeros.length==1){return false;}
        return true;
    }
    
}
