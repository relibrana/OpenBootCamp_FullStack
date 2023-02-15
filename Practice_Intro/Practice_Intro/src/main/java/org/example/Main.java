package org.example;

import java.util.Scanner;

public class Main {
    //4. Sentencias de control
    public static void compare(){
        Scanner escaner=new Scanner(System.in);
        System.out.println("Escribe un numero:");
        double numeroIf=escaner.nextDouble();

        if(numeroIf==0){
            System.out.println("El numero es neutro.");
        }else if (numeroIf<0){
            System.out.println("El numero es negativo.");
        }else{
            System.out.println("El numero es positivo");
        }
    }

    public static void inferiorA3(){
        Scanner escaner=new Scanner(System.in);
        System.out.println("Escribe un numero:");
        double numeroWhile=escaner.nextDouble();
        if (numeroWhile >3){
            System.out.println("Escribe un numero:");
            double numeroWhile2=escaner.nextDouble();
            numeroWhile=numeroWhile2;
        }
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    public static void bucleDoWhile(Integer numeroWhile){
        do{
            if (numeroWhile>3){break;}
            numeroWhile++;
        }while(numeroWhile<3);

        System.out.println(numeroWhile);
    }
     public static void bucleFor(){
        for(int numeroFor =0;numeroFor <=3;numeroFor++){
            System.out.println(numeroFor);
        }
     }



    public static void estaciones(Integer estaciones){
        switch (estaciones){
            case 1:
                System.out.println("Es invierno.");
                break;
            case 2:
                System.out.println("Es primavera.");
                break;
            case 3:
                System.out.println("Es verano.");
                break;
            case 4:
                System.out.println("Es otoño.");
                break;
            default:
                System.out.println("Ingrese un valor valido.");
                break;
        }
    }



    public static void main(String[] args) {
        bucleFor();

    }
}