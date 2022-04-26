package Week3_homework;
//4. (While Loop)Write a program to print 10 even numbers and odd numbers.

public class WhileLoopEvenOddNumbers {
    public static void main(String[] args) {
        int i = 0;
        System.out.print("Even Numbers are: ");
        while (i<=19){
            System.out.print(i+",");
            i+=2;
        }
        int j=1;
        System.out.print("\nOdd Numbers are: ");
        while (j<=19){
            System.out.print(j+",");
            j+=2;
        }

    }
}
