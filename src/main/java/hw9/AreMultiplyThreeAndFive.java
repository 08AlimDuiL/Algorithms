//----------------------------------Task №7---------------------------------
//Given an integer M perform the following conditional actions:
//If M is multiple of 3 and 5 then return "Good Number".
//If M is only multiple of 3 and not of 5 then return "Bad Number"
//If M is only multiple of 5 and not of 3 then return "Poor Number"
//If M doesn't satisfy any of the above conditions then return "-1"
package hw9;

public class AreMultiplyThreeAndFive {

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
