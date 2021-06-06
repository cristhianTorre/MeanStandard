package edu.escuelaing.arsw.meanstandard;

import edu.escuelaing.arsw.meanstandard.LinkedList;

import java.math.*;
import java.text.DecimalFormat;

/**
 *
 *
 */
public class MeanStandard
{
    public static void main( String[] args )
    {
        Double[] arrDouble = new Double[args.length];
        for(int i= 0; i<args.length;i++){
            arrDouble[i] = Double.parseDouble(args[i]);
        }
        LinkedList<Double> datos = new LinkedList<Double>(arrDouble);
        double sumCuadrado = 0;
        double sumatoria = 0;
        for(int i = 0; i<datos.size();i++){
            sumatoria += datos.get(i);
        }
        double mean = sumatoria/datos.size();
        for(int i = 0; i<datos.size();i++){
            sumCuadrado += (datos.get(i) - mean)*(datos.get(i) - mean);
        }
        double varianza = sumCuadrado/(datos.size()-1);
        double standard = Math.sqrt(varianza);
        DecimalFormat formato2 = new DecimalFormat("#.##");
        System.out.println(formato2.format(mean));
        System.out.println(formato2.format(standard));
    }
}

