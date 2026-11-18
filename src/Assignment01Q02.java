public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int accuracy = Integer.parseInt(args[0]);
        for (int i = 1; i <= accuracy; i++) {
            double addend = 1.0/(2*i-1); // Get the absolute value of the fraction we need to add
            if (i % 2 == 0) { // Calculate whether or not we need a negative sign
                addend *= -1;
            }
            approxPi += addend;
        }
        approxPi *= 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
