/*
 Haz un programa que recoja en una variable el saldo disponible en el móvil
 y mande SMSs hasta quedarse sin saldo suficiente. Los SMS cuestan 10 céntimos.

 Simula el envío de SMS imprimiendo el mensaje "Mando un SMS".
 */

public class EjemploWhile {
    public void main() {
        double saldo = 1.15;

        while (saldo >= 0.10) {
            System.out.println("Mando un SMS");
            saldo -= 0.10;
            System.out.println("Saldo restante: " + saldo);
        }
        System.out.println("No tienes suficiente saldo");
    }
}