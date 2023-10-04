

public class StringtoInteger {

    public static void main(String[] args) {
        String test = "   -42";
        System.out.println(myAtoi(test));
        System.out.println("reference");
    }

    public static int myAtoi(String s) {
        s = s.trim();
        StringBuilder str = new StringBuilder(s);
        boolean pos = true;
        boolean containsDigits = false;
        long result;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') { //negative if "-" is read
                pos = false;
            }
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                containsDigits = true;
            } else {
                str.delete(i, i+1); //delete non-numerical chars
                i = -1;
            }
        }
        if (!containsDigits) {
            return 0;
        }
        result = Long.parseLong(str.toString());
        if (result > Integer.MAX_VALUE && pos) {
            return Integer.MAX_VALUE;
        } else if (result > Integer.MAX_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            if (pos) {
                return Integer.parseInt(str.toString());
            } else {
                return ~(Integer.parseInt(str.toString()));
            }
        }
    }
}
