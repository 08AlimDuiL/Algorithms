package hw10;

public class ReverseString {

    public String ReverseString(String straightString) {

        if (straightString.length() != 0) {
            String[] reverse = straightString.split("");
            int lastIndex = reverse.length - 1;
            String reverseString = "";
            for (int i = 0; i < reverse.length; i++) {
                reverseString = reverseString.concat(reverse[lastIndex - i]);
            }
            return reverseString;
        }

        return "";
    }
}
