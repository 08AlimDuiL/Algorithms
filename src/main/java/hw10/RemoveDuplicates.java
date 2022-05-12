package hw10;

public class RemoveDuplicates {

    public String RemoveDuplicates(String uniqueLetter) {

        if (uniqueLetter.length() != 0) {
            uniqueLetter = uniqueLetter.trim().toLowerCase();
            String unique = "";
            for (int i = 0; i < uniqueLetter.length(); i++) {
                if (uniqueLetter.charAt(i) > 'z' || uniqueLetter.charAt(i) < 'a') {
                    uniqueLetter = uniqueLetter.replace((uniqueLetter.charAt(i)), ' ');
                }
            }
            uniqueLetter = uniqueLetter.replace(" ", "");
            String[] duplicate = uniqueLetter.split("");
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
            uniqueLetter = "";

            for (int i = 0; i < duplicate.length; i++) {
                if (duplicate[i] != ("A")) {

                    uniqueLetter = uniqueLetter.concat(noDuplicate[count++] = duplicate[i]);
                }
            }

            return uniqueLetter;
        }

        return null;
    }
}
