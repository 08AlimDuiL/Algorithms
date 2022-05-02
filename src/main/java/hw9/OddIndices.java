//Написать алгоритм OddIndices, который принимает массив чисел,  и
// возвращает массив значений нечетных индексов.

package hw9;

public class OddIndices {

    public int[] OddIndices(int[] differentInt) {
        if (differentInt.length != 0) {
            int[] OddIndices = new int[differentInt.length / 2];
            int count = 0;
            for (int i = 1; i < differentInt.length; i += 2) {
                OddIndices[count++] = differentInt[i];
            }

            return OddIndices;
        }

        return new int[]{};
    }
}
