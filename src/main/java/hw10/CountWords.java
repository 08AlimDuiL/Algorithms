package hw10;

public class CountWords {

    public int CountWords(String text, String word) {
        if (text.length() != 0 && word.length() != 0) {
            text = text.toLowerCase();
            word = word.toLowerCase();
            text = text.replace(word, word.toUpperCase());
            int count = 0;
            String[] a = text.split("\\W");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(word.toUpperCase())) {
                    count++;
                }
            }

            return count;
        }

        return -1;
    }
}
