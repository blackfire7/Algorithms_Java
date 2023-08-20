package recursion;

public class FrequencyOfSubstring {
    public static void main(String[] args) {
        String str = "hello world, hello universe";
        String subStr = "hello";
        System.out.println(frequency(str, subStr));
    }

    public static int frequency(String str, String subStr) {
        int n1 = str.length();
        int n2 = subStr.length();
        if (n1 == 0 || n1 < n2) return 0;
        if (str.substring(0, n2).equals(subStr)) return frequency(str.substring(1), subStr) + 1;
        return frequency(str.substring(1), subStr);
    }
}
