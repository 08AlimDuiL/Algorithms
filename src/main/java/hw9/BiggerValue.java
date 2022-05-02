//Напишите алгоритм BiggerValue, который из двух параметров типа int
// возвращает бОльшее значение.
package hw9;

public class BiggerValue {

    public int BiggerValue (int a, int b){
        if( a != b) {
            return Math.max(a, b);
        }
        return 0;
    }
}
