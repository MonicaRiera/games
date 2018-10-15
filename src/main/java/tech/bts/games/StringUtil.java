package tech.bts.games;

public class StringUtil {

    /**Returns a String with "s" repeated "n" times*/
    public static String repeat(String s, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += s;
        }

        return result;
    }

    /**Returns a string where s is padded with spaces on the left until the resulting string has length n*/
    public static String padLeft(String s, int n) {
        return repeat(" ", n - s.length()) + s;
    }

    /**Returns a string where s is padded with spaces on the right until the resulting string has length n*/
    public static String padRight(String s, int n) {
        return s + repeat(" ", n - s.length());
    }
}

