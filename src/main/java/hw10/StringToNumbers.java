package hw10;

public class StringToNumbers {

    public String[] StringToNumbers(String str) {

        if (str.length() != 0) {
            str = str.trim().toLowerCase();
            String[] strNumb = str.split("\\D");
            int count = 0;

            for (int i = 0; i < strNumb.length; i++) {
                if (strNumb[i] == "") {
                    count++;
                }
            }
            String[] newStrNumb = new String[strNumb.length - count];
            count = 0;

            for (int i = 0; i < strNumb.length; i++) {
                if (strNumb[i] != "") {
                    newStrNumb[count++] = strNumb[i];
                }
            }

            return newStrNumb;
        }

        return new String[]{};
    }
}
