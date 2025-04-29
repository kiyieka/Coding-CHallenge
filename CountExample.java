// Coding challenge 5
// This code is used to demonstrate the while loop
// It counts numbers upto 5 then terminates the execution if it is greater than 5.

public class CountExample {
    void count(){
        int number = 1;
        while (number <= 5){
            System.out.println("Number: " +number);
            number++;
        }

    }
    public static void main(String[] args){
        CountExample nt = new CountExample();
        nt.count();

    }

}
