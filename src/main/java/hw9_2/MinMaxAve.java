//Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2
// значения индексов. Алгоритм возвращает массив, который содержит минимальное
// значение, максимальное значение,  и среднее среди всех значений между 2-мя
// индексами.
package hw9_2;

import java.util.Arrays;

public class MinMaxAve {

    public  int [] MinMaxAve (int[] array, int indexA, int indexB){
        int average = 0;
        int[] MinMaxAverage;
        for (int i = indexA; i < array.length; i++) {
            if(i <= indexB){
                average = average + array[i];
            }
        }
        average = (average / (indexB - indexA + 1));
        MinMaxAverage = new int[]{array[indexA], array[indexB], average};
        return MinMaxAverage;
    }
}
