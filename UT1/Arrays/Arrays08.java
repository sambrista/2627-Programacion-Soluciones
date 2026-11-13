/*
 * ========================================================================
 *  Arrays08
 * ========================================================================
 * Realizar un método que compare 2 arrays, devolverá false si son distintos
 * y true si son iguales. Haz un programa para probarlo.
 * ========================================================================
 */

public class Arrays08 {
    void main() {
        int[] arrayA = {15, 8, 7, 8, 3};
        int[] arrayB = {15, 8, 7, 6, 3};
        if (compararArrays(arrayA, arrayB)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }

    public boolean compararArrays(int[] array1, int[] array2) {
        boolean sonIguales = true;
        if (array1.length != array2.length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < array1.length && sonIguales; i++) {
                if (array1[i] != array2[i]) {
                    sonIguales = false;
                }
            }
        }

        return sonIguales;
    }
}