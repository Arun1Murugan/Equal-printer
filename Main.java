public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        printEqual(5,5,5); // method that passes three numbers.
    }
    public static void printEqual(int num1, int num2, int num3){
        if((num1 < 0) || (num2 < 0) || (num3 < 0)){ // if any of them is Zero.
            System.out.println("Invalid.");
        }else if((num1 == num2) && (num1 == num3)){ // if all are equal.
            System.out.println("All numbers are equal.");
        }else{                                      // if all are different.
            System.out.println("All numbers are different.");
        }
    }
}