//----------------------------------Task №3---------------------------------
//Написать алгоритм SumArray, который возвращает сумму всех чисел массива.
package hw9;

public class SumArray {

    public int SumArray (int[] differentInteger){
        int sum = 0;
        for (int i = 0; i < differentInteger.length ; i++) {
            sum = sum + differentInteger[i];
        }

        return sum;
    }
}
