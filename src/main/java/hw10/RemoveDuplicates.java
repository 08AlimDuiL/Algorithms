package hw10;

public class RemoveDuplicates {

    public String RemoveDuplicates(String uniqueLetters) {

        if (uniqueLetters.length() != 0) {
            uniqueLetters = uniqueLetters.trim().toLowerCase();
            for (int i = 0; i < uniqueLetters.length(); i++) {
                if (uniqueLetters.charAt(i) > 'z' || uniqueLetters.charAt(i) < 'a') {
                    uniqueLetters = uniqueLetters.replace((uniqueLetters.charAt(i)), ' ');
                }
            }
            uniqueLetters = uniqueLetters.replace(" ", "");
            String[] duplicate = uniqueLetters.split("");
            int count = 0;
            for (int i = 0; i < duplicate.length; i++) {
                for (int j = i + 1; j < duplicate.length; j++) {
                    if (duplicate[i].equals(duplicate[j])) {
                        duplicate[j] = "A";
                    }
                }
            }
            for (int i = 0; i < duplicate.length; i++) {
                if (duplicate[i].equals("A")) {
                    count++;
                }
            }
            String[] noDuplicate = new String[duplicate.length - count];
            count = 0;
            uniqueLetters = "";

            for (int i = 0; i < duplicate.length; i++) {
                if (duplicate[i] != ("A")) {

                    uniqueLetters = uniqueLetters.concat(noDuplicate[count++] = duplicate[i]);
                }
            }

            return uniqueLetters;
        }

        return null;
    }
}
