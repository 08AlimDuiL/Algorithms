//Написать алгоритм Intersection, который принимает на вход 2 массива целых
// чисел и возвращает массив общих элементов.

package hw9;

public class Intersection {

    public int[] Intersection(int[] arrayOne, int[] arrayTwo) {
        int[] Intersection;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = i + 1; j < arrayOne.length; j++) {
                if (arrayOne[i] == arrayOne[j]) {
                    arrayOne[j] = Integer.MIN_VALUE;
                }
            }
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = i + 1; j < arrayTwo.length; j++) {
                if (arrayTwo[i] == arrayTwo[j]) {
                    arrayTwo[j] = Integer.MIN_VALUE;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayTwo[j] == arrayOne[i] && arrayOne[i] != Integer.MIN_VALUE
                        && arrayTwo[j] != Integer.MIN_VALUE) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {

            return new int[]{};
        } else {
            Intersection = new int[count];
            count = 0;
            for (int i = 0; i < arrayOne.length; i++) {
                for (int j = 0; j < arrayTwo.length; j++) {
                    if (arrayTwo[j] == arrayOne[i]
                            && arrayOne[i] != Integer.MIN_VALUE
                            && arrayTwo[j] != Integer.MIN_VALUE) {
                        Intersection[count] = arrayOne[i];
                        count++;
                        break;
                    }
                }
            }
        }

        return Intersection;
    }
}
