//Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и
// возвращает значения пиковых элементов (элементы, которые больше своих соседей).
package hw9;

public class PeakElement {

    public int[] PeakElement(int[] arrayInt) {

        int[] PeakElement = new int[]{};
        if (arrayInt.length != 0) {
            int count = 0;
            if (arrayInt[0] > arrayInt[1]) {
                count++;
            }
            if (arrayInt[arrayInt.length - 1] > arrayInt[arrayInt.length - 2]) {
                count++;
            }
            for (int i = 1; i < arrayInt.length - 1; i++) {
                if (arrayInt[i] > arrayInt[i - 1]
                        && arrayInt[i] > arrayInt[i + 1]) {
                    count++;
                }
            }

            PeakElement = new int[count];
            count = 0;
            if (arrayInt[0] > arrayInt[1]) {
                PeakElement[0] = arrayInt[0];
                count++;
            }
            if (arrayInt[arrayInt.length - 1] > arrayInt[arrayInt.length - 2]) {
                PeakElement[PeakElement.length - 1] = arrayInt[arrayInt.length - 1];
            }

            for (int i = 1; i < arrayInt.length - 1; i++) {
                if (arrayInt[i] > arrayInt[i - 1]
                        && arrayInt[i] > arrayInt[i + 1]) {
                    PeakElement[count] = arrayInt[i];
                    count++;
                }
            }
        }

        return PeakElement;
    }
}
