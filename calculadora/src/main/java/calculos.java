
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
    double numero1,numero2,suma,resta,multiplicacion,division,raiz,iva,tan,sen,cos;
    System.out.println("******BIENVENIDO A LA MI CALCULADORA******");
    System.out.println("-Para funciones trigonometricas y iva, raiz se tendra en cuenta solo el primer numero- ");
    System.out.print("Diguite dos numeros los cuales quiera operar:  ");
    
    numero1= entrada.nextDouble();
    numero2= entrada.nextDouble();
    
    
    suma =numero1+numero2;
    resta =numero1-numero2;
    multiplicacion =numero1*numero2;
    division =numero1/numero2;
    raiz= Math.sqrt(numero1*(-1));
    tan=Math.tan(numero1);
    sen=Math.sin(numero1);
    cos=Math.cos(numero1);
    iva= numero1+numero1*0.19;
    if(numero2==0){
        System.out.println("error");
    }else{
        System.out.println("la division es:"+division );}
    
    System.out.println("la suma entre los dos numero es:  "+suma);
    System.out.println("la resta entre los dos numeros es:  "+resta);
    System.out.println("la multiplicacion entre los dos numeros es:  "+multiplicacion);
    System.out.println("el seno del primer numero es:  "+sen);
    System.out.println("el coseno del primer numero es:  "+cos);
    System.out.println("la tangente del primero numero es:  "+tan);
    System.out.println("el iva del primer numero es:  "+iva);
    System.out.println("la raiz del primer numero es:  "+raiz);
    
}
    
}


