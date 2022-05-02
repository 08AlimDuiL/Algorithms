//Создать алгоритм OddEven, который принимает на вход целое число,
// возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
// Во всех остальных случаях результат будет “Undefined”.

package hw9;

public class OddEven {

    public String OddEven(long a) {

        if (a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE) {
            if (a % 2 == 0) {
                if (a % 2 == 0) {

                    return "Even";
                }
            } else {

                return "Odd";
            }
        }
        return "Undefined";
    }
}
