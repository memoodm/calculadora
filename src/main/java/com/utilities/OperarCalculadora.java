package com.utilities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;

@Stateless
public class OperarCalculadora {
    
    public String suma(String[] entrada){
        return Arrays
                .asList(entrada)
                .stream()
                .map(e->Integer.parseInt(e))
                .reduce(0,(n1,n2)->n1+n2)
                .toString();   
    }
    public String resta(String[] entrada){
        List<Integer> myList =  Arrays
                .asList(entrada)
                .stream()
                .map(e->Integer.parseInt(e))
                .collect(Collectors.toList());
        Integer result = myList.get(0);
        for(int x=1;x<myList.size();x++){
            result-=myList.get(x);
        }
        return result.toString();
    }
    public String multiplicacion(String[] entrada){
        return Arrays
                .asList(entrada)
                .stream()
                .map(e->Integer.parseInt(e))
                .reduce(1,(n1,n2)->n1*n2)
                .toString();   
    }
    public String division(String[] entrada){
        List<Double> myList =  Arrays
                .asList(entrada)
                .stream()
                .map(e->Double.parseDouble(e))
                .collect(Collectors.toList());
        Double result = myList.get(0);
        for(int x=1;x<myList.size();x++){
            result/=myList.get(x);
        }
        return result.toString();   
    }
    
}
