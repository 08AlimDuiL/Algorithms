public class HW9 {
    //----------------------------------Task №1---------------------------------
    //Создать алгоритм OddEven, который принимает на вход целое число,
    // возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
    // Во всех остальных случаях результат будет “Undefined”.
    public String OddEven (int a){
        String result;
        if (a % 2 != 0){
           result = "Odd";
        } else if(a % 2 == 0){
            result = "Even";
        } else {
            result = "Undefined";
        }
        return result;
    }
    //----------------------------------Task №2---------------------------------
    //Написать алгоритм OddIndices, который принимает массив чисел,  и
    // возвращает массив значений нечетных индексов.
    public int[] OddIndices(int[] differentInt){
        int[]OddIndices;
        int count = 0;
        for (int i = 0; i < differentInt.length; i++) {
            if(i % 2 != 0){
                count++;
            }
        }
        OddIndices = new int[count];
        count = 0;
        for (int i = 0; i < differentInt.length; i++) {
            OddIndices[count++] = differentInt[i];
        }
        return OddIndices;
    }
    //----------------------------------Task №3---------------------------------
    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива.
    public int SumArray (int[] differentInteger){
        int sum = 0;
        for (int i = 0; i < differentInteger.length ; i++) {
            differentInteger[i] = Math.abs(differentInteger[i]);
            sum = sum + differentInteger[i];
        }
        return sum;
    }
    //----------------------------------Task №4---------------------------------
    //Напишите алгоритм BiggerValue, который из двух параметров типа int
    // возвращает бОльшее значение.
    public int BiggerValue (int a, int b){
        int BiggerValue;
        if( a > b){
            BiggerValue = a;
        } else {
            BiggerValue = b;
        }
        return BiggerValue;
    }
    //----------------------------------Task №5---------------------------------
    //Напишите алгоритм IsPositiveNumber, который возвращает true, если
    // численный  параметр больше или равен нулю, и возвращает false, если
    // параметр меньше 0.
    public boolean IsPositiveNumber (int a){
        boolean IsPositiveNumber;
        if( a >= 0){
            IsPositiveNumber = true;
        } else {
            IsPositiveNumber = false;
        }
        return IsPositiveNumber;
    }
    //----------------------------------Task №6---------------------------------
    //Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
    //0, если числа равны;
    //-1, если первое число меньше второго;
    //1, если первое число больше второго.
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
    //----------------------------------Task №7---------------------------------
    //Given an integer M perform the following conditional actions:
    //If M is multiple of 3 and 5 then return "Good Number".
    //If M is only multiple of 3 and not of 5 then return "Bad Number"
    //If M is only multiple of 5 and not of 3 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"
    public String AreMultiplyThreeAndFive (int M){
        String IsPositiveNumber;
        if( M % 3 == 0 && M % 5 == 0){
            IsPositiveNumber = "Good Number";
        } else if (M % 3 == 0 && M % 5 != 0 ){
            IsPositiveNumber = "Bad Number";
        } else if (M % 3 != 0 && M % 5 == 0 ){
            IsPositiveNumber = "Poor Number";
        } else {
            IsPositiveNumber = "-1";
        }
        return IsPositiveNumber;
    }




}
