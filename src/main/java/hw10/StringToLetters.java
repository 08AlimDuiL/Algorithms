package hw10;

public class StringToLetters {

    public String StringToLetters(String delAllExcTheLetters) {
        if (delAllExcTheLetters.length() != 0) {
            delAllExcTheLetters = delAllExcTheLetters.trim();
            int count = 0;
            for (int i = 0; i < delAllExcTheLetters.length(); i++) {
                char one = delAllExcTheLetters.charAt(i);
                if ((one >= 'a' && one <= 'z') || (one >= 'A' && one <= 'Z')) {
                    count++;
                }
            }
            String[] except = new String[count];
            count = 0;
            for (int i = 0; i < delAllExcTheLetters.length(); i++) {
                char one = delAllExcTheLetters.charAt(i);
                if ((one >= 'a' && one <= 'z') || (one >= 'A' && one <= 'Z')) {
                    except[count++] = String.valueOf(one);
                }
            }
            delAllExcTheLetters = "";
            for (int i = 0; i < except.length; i++) {
                delAllExcTheLetters = delAllExcTheLetters.concat(except[i]);
            }

            return delAllExcTheLetters;
        }

        return "";
    }


}
