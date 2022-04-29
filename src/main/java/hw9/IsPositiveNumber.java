//----------------------------------Task №5---------------------------------
//Напишите алгоритм IsPositiveNumber, который возвращает true, если
// численный  параметр больше или равен нулю, и возвращает false, если
// параметр меньше 0.
package hw9;

public class IsPositiveNumber {

    public boolean IsPositiveNumber (int a){
        boolean IsPositiveNumber;
        if( a >= 0){
            IsPositiveNumber = true;
        } else {
            IsPositiveNumber = false;
        }
        return IsPositiveNumber;
    }
}
