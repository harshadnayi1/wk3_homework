package Week3_homework;
//(Do While Loop) 6. Write a program to print 10 even numbers and odd numbers

public class DoWhileLoopEvenOddNumber {
    public static void main(String[] args) {
        int i = 0;
           do {
            System.out.println("Even Number: " + i+ ",");
            i+=2;
        } while (i<=19);

        int j = 1;
         do {
           System.out.print("\nOdd Numbers:"+ j+ ",");
            j+=2;
        } while (j<=19);
    }
}
