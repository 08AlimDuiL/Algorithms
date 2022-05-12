package hw10;

public class StringToLettersAndSpaces {

    public String StringToLettersAndSpaces(String delAllExcLettsAndSpaces) {
        if (delAllExcLettsAndSpaces.length() != 0) {
            int count = 0;
            for (int i = 0; i < delAllExcLettsAndSpaces.length(); i++) {
                char one = delAllExcLettsAndSpaces.charAt(i);
                if ((one >= 'a' && one <= 'z') || (one >= 'A' && one <= 'Z') || one == 32) {
                    count++;
                }
            }
            String[] except = new String[count];
            count = 0;
            for (int i = 0; i < delAllExcLettsAndSpaces.length(); i++) {
                char one = delAllExcLettsAndSpaces.charAt(i);
                if ((one >= 'a' && one <= 'z') || (one >= 'A' && one <= 'Z') || one == 32) {
                    except[count++] = String.valueOf(one);
                }
            }
            delAllExcLettsAndSpaces = "";
            for (int i = 0; i < except.length; i++) {
                delAllExcLettsAndSpaces = delAllExcLettsAndSpaces.concat(except[i]);
            }

            return delAllExcLettsAndSpaces;
        }

        return null;
    }
}
