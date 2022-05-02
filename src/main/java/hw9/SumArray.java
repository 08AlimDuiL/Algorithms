//Написать алгоритм SumArray, который возвращает сумму всех чисел массива.

package hw9;

public class SumArray {

    public int SumArray (int[] differentInteger){
        if(differentInteger.length !=0) {
            int sum = 0;
            for (int i = 0; i < differentInteger.length; i++) {
                sum  += differentInteger[i];
            }

            return sum;
        }

        return 0;
    }
}
