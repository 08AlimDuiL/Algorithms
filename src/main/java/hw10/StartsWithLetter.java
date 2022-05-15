package hw10;

public class StartsWithLetter {

    public String StartsWithLetter(String text) {

        if (text.length() != 0) {
            int count = 0;
            String allWordStartWithL = "";
            String[] a = text.split("\\W");
            for (int i = 0; i < a.length; i++) {
                if (a[i].startsWith("l") || a[i].startsWith("L")) {
                    allWordStartWithL = allWordStartWithL.concat(a[count++] = (a[i] + ", "));
                }
            }
            if (count > 0) {
                allWordStartWithL = allWordStartWithL.substring(0, allWordStartWithL.length() - 2);
            }
            return allWordStartWithL;
        }

        return "";
    }
}
