package hw10;

public class StringToLetters {

    public String StringToLetters(String deleteAllExceptForLetters) {
        if (deleteAllExceptForLetters.length() != 0) {
            deleteAllExceptForLetters = deleteAllExceptForLetters.trim();
            int count = 0;
            for (int i = 0; i < deleteAllExceptForLetters.length(); i++) {
                char one = deleteAllExceptForLetters.charAt(i);
                if ((one >= 'a' && one <= 'z') || (one >= 'A' && one <= 'Z')) {
                    count++;
                }
            }
            String[] except = new String[count];
            count = 0;
            for (int i = 0; i < deleteAllExceptForLetters.length(); i++) {
                char one = deleteAllExceptForLetters.charAt(i);
                if ((one >= 'a' && one <= 'z') || (one >= 'A' && one <= 'Z')) {
                    except[count++] = String.valueOf(one);
                }
            }
            deleteAllExceptForLetters = "";
            for (int i = 0; i < except.length; i++) {
                deleteAllExceptForLetters = deleteAllExceptForLetters.concat(except[i]);
            }

            return deleteAllExceptForLetters;
        }

        return null;
    }


}
