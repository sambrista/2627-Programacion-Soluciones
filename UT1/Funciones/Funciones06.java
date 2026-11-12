/*
 * ========================================================================
 *  Funciones06
 * ========================================================================
 *  Diseña una función que reciba una temperatura en grados Celsius y
 *  devuelva su equivalente en Fahrenheit. F = C * 9/5 + 32
 * ========================================================================
 */

public class Funciones06 {
    public void main() {
        double temperaturaCelsius = 37;
        double temperaturaFahrenheit = celsiusAFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " ºC = " + temperaturaFahrenheit + " ºF");
    }

    public double celsiusAFahrenheit(double temperaturaCelsius) {
        return temperaturaCelsius * (9.0 / 5.0) + 32.0;
    }
}