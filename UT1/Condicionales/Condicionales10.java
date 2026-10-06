/*
 Clasificación según la edad: Realiza un programa que pida la edad de una persona,
 utilizando únicamente números enteros, y muestre el grupo al que pertenece:
 - Menor de 0 → "Edad incorrecta".
 - De 0 a 2 años → "Bebé".
 - De 3 a 11 años → "Niño".
 - De 12 a 17 años → "Adolescente".
 - De 18 a 64 años → "Adulto".
 - 65 años o más → "Mayor".
 El programa deberá mostrar un mensaje de error cuando la edad introducida sea negativa.
 */

import java.util.Scanner;

public class Condicionales10{
    public static void main(){
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime la edad de la persona");
        edad = teclado.nextInt();
        
        if (edad < 0){
            System.out.println("Edad incorrecta");
        }
        
        else if (edad <= 2){ // edad < 3
            System.out.println("Bebé");
        } 
        
        else if (edad <= 11){ // edad < 12
            System.out.println("Niño");
        } 
        
        else if (edad <= 17){ // edad < 18
            System.out.println("Adolescente");
        } 
        
        else if (edad <= 64){ // edad < 65
            System.out.println("Adulto");
        } 
        
        else {
            System.out.println("Mayor");
        }
    }
}