package Week3_homework;
// (For Loop) 3. Write a program to generate tables of 10

public class ForLoopTableOfTens {
    public static void main(String[] args) {
        int table = 10;
        for (int i = 1; i<=10; i++){
            System.out.println(table + ""+ " X " + i+ " = " + (i * table));
        }
    }
}
