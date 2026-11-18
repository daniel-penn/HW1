public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        int lastFib = 0;
        int secondToLastFib = 0;
        int currentFib = -1;
        for (int i = 0; i < x; i++) {
            if (lastFib == 0) {
                currentFib = 1;
            }
            else {
                currentFib = lastFib+secondToLastFib;
            }
            secondToLastFib = lastFib;
            lastFib = currentFib;
            if (currentFib % 2 == 1) {numOdd++;}
            System.out.print(currentFib);

            if (i < x - 1) 
                System.out.print(" ");
        }
        System.out.println();
        
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
