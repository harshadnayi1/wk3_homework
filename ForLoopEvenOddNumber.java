package Week3_homework;
//(For Loop) 2. Write a program to print 10 even numbers and odd numbers

public class ForLoopEvenOddNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 19; i++) {
            if (i % 2 == 0)   System.out.println((i) + " Even");
                else    System.out.println((i) + " Odd");
        }
    }
}

