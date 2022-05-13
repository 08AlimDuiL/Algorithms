package hw10;

public class StringToNumbersAndSpaces {

    public String StringToNumbersAndSpaces(String ExcNumbAndSpaces) {
        if (ExcNumbAndSpaces.length() != 0) {
            int count = 0;
            for (int i = 0; i < ExcNumbAndSpaces.length(); i++) {
                char one = ExcNumbAndSpaces.charAt(i);
                if (one >= '0' && one <= '9' || one == ' ') {
                    count++;
                }
            }
            String[] except = new String[count];
            count = 0;
            for (int i = 0; i < ExcNumbAndSpaces.length(); i++) {
                char one = ExcNumbAndSpaces.charAt(i);
                if (one >= '0' && one <= '9' || one == ' ') {
                    except[count++] = String.valueOf(one);
                }
            }
            ExcNumbAndSpaces = "";
            for (int i = 0; i < except.length; i++) {
                ExcNumbAndSpaces = ExcNumbAndSpaces.concat(except[i]);
            }

            return ExcNumbAndSpaces;
        }

        return null;
    }
}
