
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class calculos {
    public static void main(String[] args){
    Scanner entrada= new Scanner(System.in);
    double numero1,numero2,resultado,suma,resta,multiplicacion,division,raiz,iva,tan,sen,cos;
    System.out.print("diguite dos numeros: ");
    numero1= entrada.nextDouble();
    numero2= entrada.nextDouble();
    
    
    suma =numero1+numero2;
    resta =numero1-numero2;
    multiplicacion =numero1*numero2;
    division =numero1/numero2;
    raiz= Math.sqrt(numero1);
    tan=Math.tan(numero1);
    sen=Math.sin(numero1);
    cos=Math.cos(numero1);
    
    if(numero2==0){
        System.out.println("error");
    }else{
        System.out.println("la division es:"+division );}
    
    System.out.println("la suma es :"+suma);
    System.out.println("la resta es:"+resta);
    System.out.println("la multiplicacion es:"+multiplicacion);
    System.out.println("raiz:"+raiz);
    System.out.println("raiz:"+sen);
    System.out.println("raiz:"+cos);
    System.out.println("raiz:"+tan);
    
}
}


