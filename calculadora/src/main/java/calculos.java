
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
    int opcion;
    System.out.println("******BIENVENIDO A LA MI CALCULADORA******");
    System.out.println(" Digite el numero de la opcion que quiera usar:  ");
    System.out.print("1.Suma ");
    System.out.print("2.Resta ");
    System.out.print("3.Raiz cuadrada ");
    System.out.print("4.Multiplicacion ");
    System.out.print("5.Division ");
    System.out.print("6.IVA ");
    System.out.print("7.Seno ");
    System.out.print("8.Coseno ");
    System.out.print("9.Tangete ");
    

    opcion=entrada.nextInt();
    
    switch(opcion){
        case 1: 
            System.out.println("Digite los dos numeros que quiera sumar :");
            numero1= entrada.nextDouble();
            numero2= entrada.nextDouble();
            suma=numero1+numero2;
            System.out.println("El resultado de la suma es: "+suma);
            break;
        case 2: 
            System.out.println("Diguite los dos numeros que quiera restar: ");
            numero1= entrada.nextDouble();
            numero2= entrada.nextDouble();
            resta=numero1-numero2;
            System.out.println("El resultado de la resta es: "+resta);
            break;
        case 3:
            System.out.println("Digite el numero que quiera sacar raiz cuadrada: ");
            numero1= entrada.nextDouble();
            raiz=Math.sqrt(numero1)*(-1);
            System.out.println("El resultado de la raiz es: "+raiz);
            break;
        case 4:
            System.out.println("Digite los dos numeros que quiera multiplicar: ");
            numero1= entrada.nextDouble();
            numero2= entrada.nextDouble();
            multiplicacion =numero1*numero2;
            System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
            break;
        case 5:
             System.out.println("Digite los dos numeros que quiera divir");
            numero1= entrada.nextDouble();
            numero2= entrada.nextDouble();
            division=numero1/numero2;
            if(numero2==0){
                System.out.println("ERROR, no se puede divir entre 0");
            }else{
            System.out.println("El resultado de la division es: "+division);
            }break;
        case 6:
            System.out.println("Diguite el numero el cual que quiera ver su iva incluido: ");
            numero1= entrada.nextDouble();
            iva =numero1+numero1*0.19;
            System.out.println("El iva incluido es : "+iva);
            break;
        case 7:
            System.out.println("Digite el angulo: ");
            numero1= entrada.nextDouble();
            sen=Math.sin(numero1);
            System.out.println("El seno del aguno es: "+sen);
            break;
        case 8:
            System.out.println("Digite el angulo: ");
            numero1= entrada.nextDouble();
            cos=Math.cos(numero1);
            System.out.println("El coseno del aguno es: "+cos);
            break;
        case 9:
            System.out.println("Digite el angulo: ");
            numero1= entrada.nextDouble();
            tan=Math.tan(numero1);
            System.out.println("La tangente del aguno es: "+tan);
            break;
        
            
    }
    
    }
}
    



