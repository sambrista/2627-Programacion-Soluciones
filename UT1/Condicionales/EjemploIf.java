

public class EjemploIf {
    public static void main() {
        int nota = 3;

        System.out.println("Inicio");
        if (nota >= 5) { // Si la nota es 5 o más...
            System.out.println("Aprobado"); // ... imprimo Aprobado ...
        } else { // ... y si no...
            System.out.println("Suspenso"); // ... imprimo Suspenso ...
        }
        System.out.println("Fin");
    }
}