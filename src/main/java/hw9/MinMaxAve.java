//Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2
// значения индексов. Алгоритм возвращает массив, который содержит минимальное
// значение, максимальное значение,  и среднее среди всех значений между 2-мя
// индексами.
package hw9;

import java.util.Arrays;

public class MinMaxAve {

    public  int [] MinMaxAve (int[] array, int indexA, int indexB){
        if(indexB < indexA){
            int sum = indexB + indexA;
            indexA = sum - indexA;
            indexB = sum - indexB;
         }
        if(array.length > 0 && indexB >= indexA && indexA >=0 && indexB < array.length) {
            int averagebetween = 0;
            int[] MinMaxAverage;
            for (int i = indexA; i < array.length; i++) {
                if (i <= indexB) {
                    averagebetween  += array[i];
                }
            }
            averagebetween = (averagebetween / (indexB - indexA + 1));
            MinMaxAverage = new int[]{array[indexA], array[indexB], averagebetween};

            return MinMaxAverage;
        }

        return new int[] {};
    }
}
