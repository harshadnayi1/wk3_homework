package Week3_homework;
//Do While Loop - 7. Write a program to generate tables of 5
public class DoWhileLoopTableOff {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        do {
            System.out.println(n + "" + " X " + i+ " = " + (i * n));
            i++;
        }while(i<=12);
    }
}
        /* Output:
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        5 X 4 = 20
        5 X 5 = 25
        5 X 6 = 30
        5 X 7 = 35
        5 X 8 = 40
        5 X 9 = 45
        5 X 10 = 50
        5 X 11 = 55
        5 X 12 = 60

        Process finished with exit code 0 */