//----------------------------------Task №4-------------------------------------
//Напишите алгоритм BiggerValue, который из двух параметров типа int
// возвращает бОльшее значение.
package hw9;

public class BiggerValue {

    public int BiggerValue (int a, int b){
        int BiggerValue;
        if( a > b){
            BiggerValue = a;
        } else {
            BiggerValue = b;
        }
        return BiggerValue;
    }
}
