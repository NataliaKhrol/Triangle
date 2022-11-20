public class ReverseString {
    public static void main(String[] args) {
        String inputData = "Beautiful";
        String reverseData = new StringBuffer(inputData).reverse().toString();
        System.out.println(reverseData);
    }
}
