package hw10;

public class StringIntersection {

    public String StringIntersection(String first, String second) {
        if (first.length() != 0 && second.length() != 0) {
            String[] firstArr = first.toLowerCase().split("");
            String[] secondArr = second.toLowerCase().split("");
            boolean point = false;
            String total = "";
            for (int i = 0; i < firstArr.length; ) {
                for (int j = 0; j < secondArr.length; j++) {
                    if (firstArr[i].equals(secondArr[j])) {
                        total = total.concat(firstArr[i]);
                        secondArr[j] = "A";
                        firstArr[i] = "B";
                        if (i < firstArr.length - 1) {
                            i++;
                            point = true;
                        }
                    }
                }
                if (!point) {
                    i++;
                }
                point = false;
            }

            return total;
        }

        return null;
    }
}
