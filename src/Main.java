// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("01234.56789");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(0) < '0') {
                str.delete(i, str.length());
                break;
            }
        }
        System.out.println(str);
    }
}