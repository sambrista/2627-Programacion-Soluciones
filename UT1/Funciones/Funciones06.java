// Diseña una función que reciba una temperatura en grados Celsius y devuelva 
// su equivalente en Fahrenheit. F = C * 9/5 + 32

public class Funciones06 {
    public void main() {
        double temperaturaCelsius = 37;
        double temperaturaFarenheit = celsiusAFarenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " ºC = " + temperaturaFarenheit + " ºF");
    }

    public double celsiusAFarenheit(double temperaturaCelsius) {
        return temperaturaCelsius * (9 / 5) + 32;
    }
}