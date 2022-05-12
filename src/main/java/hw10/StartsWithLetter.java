package hw10;

public class StartsWithLetter {

    public String StartsWithLetter(String text) {

        if (text.length() != 0) {
            int count = 0;
            String startWordWithL = "";
            String[] a = text.split("\\W");
            for (int i = 0; i < a.length; i++) {
                if (a[i].startsWith("l") || a[i].startsWith("L")) {
                    startWordWithL = startWordWithL.concat(a[count++] = (a[i] + ", "));
                }
            }
            startWordWithL = startWordWithL.substring(0, startWordWithL.length() - 2);

            return startWordWithL;
        }

        return null;
    }
}
