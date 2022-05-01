//Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int
// числа, и возвращает
//0, если числа равны;
//-1, если первое число меньше второго;
//1, если первое число больше второго.

package hw9;

public class AreNumbersEqual {

    public int AreNumbersEqual (int one, int two){
        int AreNumbersEqual;
        //int AreNumbersEqual = Integer.compare(one, two); Как лучше?
        if(one == two){
            AreNumbersEqual = 0;
        } else if (one < two){
            AreNumbersEqual = -1;
        } else {
            AreNumbersEqual = 1;
        }
        return AreNumbersEqual;
    }
}
