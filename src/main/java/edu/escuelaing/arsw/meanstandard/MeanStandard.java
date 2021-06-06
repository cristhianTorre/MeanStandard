package edu.escuelaing.arsw.meanstandard;

import edu.escuelaing.arsw.meanstandard.LinkedList;

import java.math.*;

/**
 *
 *
 */
public class MeanStandard
{
    public static void main( String[] args )
    {
        Integer[] arrEntero = new Integer[args.length];
        for(int i= 0; i<args.length;i++){
            arrEntero[i] = Integer.parseInt(args[i]);
        }
        LinkedList<Integer> datos = new LinkedList<Integer>(arrEntero);
        int sumCuadrado = 0;
        int sumatoria = 0;
        System.out.println(datos.size());
        for(Integer d:datos){
            sumatoria += d;
        }
        long mean = sumatoria/datos.size();
        for(Integer d:datos){
            sumCuadrado += (d - mean)*(d - mean);
        }
        long varianza = sumCuadrado/(datos.size()-1);
        long standard = (long)Math.sqrt(varianza);
        System.out.println(mean);
        System.out.println(standard);
    }
}

