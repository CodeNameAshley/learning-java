public class Calculator {

    // This is a simple 2 digit positive integer calculator
    public Calculator() {

    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b) {
        int difference = a - b;
        return difference;
    }

    public int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public int divide(int a, int b) {
        int quotient = a / b;
        return quotient;
    }

    public int module(int a, int b) {
        int remainder = a % b;
        return remainder;
    }

    public static void main (String[] args){
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));

        // This program can be improved by allowing negative numbers as the args and answer. Allowing multiple numbers to be used, and different math operators used at one time.
    }
}