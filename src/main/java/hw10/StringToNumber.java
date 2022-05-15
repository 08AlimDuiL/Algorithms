package hw10;

public class StringToNumber {

    public String StringToNumber(String delAllExcNumbers) {
        if (delAllExcNumbers.length() != 0) {
            delAllExcNumbers = delAllExcNumbers.trim();
            int count = 0;
            for (int i = 0; i < delAllExcNumbers.length(); i++) {
                char one = delAllExcNumbers.charAt(i);
                if (one >= '0' && one <= '9') {
                    count++;
                }
            }
            String[] except = new String[count];
            count = 0;
            for (int i = 0; i < delAllExcNumbers.length(); i++) {
                char one = delAllExcNumbers.charAt(i);
                if (one >= '0' && one <= '9') {
                    except[count++] = String.valueOf(one);
                }
            }
            delAllExcNumbers = "";
            for (int i = 0; i < except.length; i++) {
                delAllExcNumbers = delAllExcNumbers.concat(except[i]);
            }

            return delAllExcNumbers;
        }

        return "";
    }
}
