public class EjemploFunciones {
    public static void main() {
        System.out.println("Hola");
        imprimirNombre();
        System.out.println("Adios");
        imprimirAsteriscos(1);
        imprimirAsteriscos(2);
        imprimirAsteriscos(3);
        imprimirAsteriscos(4);
        imprimirAsteriscos(5);
        System.out.println("El triple de 5 es " + calcularTriple(5));
        int resultado = calcularMultiplo(4, 20);
        System.out.println(resultado);
        double base = 3.20;
        double pinturaNecesaria = 4 * areaRectangulo(base, 4);
        System.out.println("El área es " + areaRectangulo(3, 4));
        System.out.println("Necesito " + pinturaNecesaria + " litros de pintura");

    }

    public static void imprimirNombre() {
        System.out.println("Mi nombre es Alfonso");
    }

    public static void imprimirAsteriscos(int numeroAsteriscos) {
        for (int i = 0; i < numeroAsteriscos; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static int calcularTriple(int numero) {
        int resultado;
        if (numero < 0) {
            resultado = 0;
        }
        resultado = numero * 3;
        return resultado;
    }

    public static int calcularMultiplo(int numero, int veces) {
        return numero * veces;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

}