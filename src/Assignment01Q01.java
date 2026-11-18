public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String string : args) {
            char firstChar = string.charAt(0);
            if (firstChar % 5 == 0) {
                System.out.println(firstChar);
            }
        }
    }
}
