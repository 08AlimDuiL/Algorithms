//Написать алгоритм OddIndices, который принимает массив чисел,  и
// возвращает массив значений нечетных индексов.
package hw9;

public class OddIndices {

    public int[] OddIndices(int[] differentInt){
        int[]OddIndices;
        int count = 0;
        for (int i = 0; i < differentInt.length; i++) {
            if(i % 2 != 0){
                count++;
            }
        }
        OddIndices = new int[count];
        count = 0;
        for (int i = 0; i < differentInt.length; i++) {
            OddIndices[count++] = differentInt[i];
        }
        return OddIndices;
    }
}
