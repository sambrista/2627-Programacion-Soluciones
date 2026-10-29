// Crea una función que reciba una cantidad en euros y devuelva su
// equivalente en dólares (usa una tasa de cambio fija, 1 € = 1,160 $).

public class Funciones07 {
    public void main() {
        double euros = 100;
        double dolares = eurosADolares(euros);
        System.out.println(euros + " € son " + dolares + " $");
    }

    public double eurosADolares(double euros) {
        final double TASA_CAMBIO = 1.16;
        return euros * TASA_CAMBIO;
    }
}

