package Week3_homework;
//5.(While Loop) Write a program to generate tables of 9

public class WhileLoopTableOf {
    public static void main(String[] args) {
        int i = 1;
        int table = 9;
        while (i<=10){
            System.out.println(table + "" + " X " + i+ " = " + (i * table));
            i++;
        }
    }
}
