public class CharArrToStr {
    public static String toString(char[] a) {
        StringBuilder sb = new StringBuilder();
        return sb.append(a).toString();
    }

    public static void main(String args[]) {
        String s = "geeksforgeeks";
        System.out.println(toString(s.toCharArray()));
    }
}