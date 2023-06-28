/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        int sum = sumOfNumbers(number);
        int gausSum = gaussianSumOfNumbers(number);

        System.out.println(sum);
        System.out.println(gausSum);

        //1 million times and cases
        compareSpeed(100000);
    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        return (n * (n + 1) / 2);
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
    static void compareSpeed(int numTimes){
        // do the sum of numbers function and time it
        // should be O(n)
        final long startTime = System.currentTimeMillis();
        for(int i = 0; i < numTimes; i++){
            sumOfNumbers(i);
        }
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time for " + numTimes + " number of times: " + (endTime - startTime));

        // do the gaussian sum of numbers function and time it
        // should be O(1)
        final long startGaus = System.currentTimeMillis();
        for(int i = 0; i < numTimes; i++){
            gaussianSumOfNumbers(i);
        }
        final long endGaus = System.currentTimeMillis();

        System.out.println("Total execution time for " + numTimes + " number of times: " + (endGaus - startGaus));
    }
}
