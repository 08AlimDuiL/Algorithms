//----------------------------------Task №1-------------------------------------
//Создать алгоритм OddEven, который принимает на вход целое число,
// возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
// Во всех остальных случаях результат будет “Undefined”.
package hw9;

public class OddEven {
    public String OddEven (int a) {
        String result;
        if (a % 2 != 0) {
            result = "Odd";
        } else if (a % 2 == 0) {
            result = "Even";
        } else {
            result = "Undefined";
        }
        return result;
    }
}
