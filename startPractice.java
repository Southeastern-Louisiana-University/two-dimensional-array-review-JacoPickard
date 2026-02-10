import java.util.Scanner;

public class startPractice{
    public static void main(String[] args){
        int[][] matrix = new int[10][10];

        //Initializing arrays with input values. The following loop initializes the array with user input values:
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter " + matrix.length + "rows and " matrix[0].length + "columns: ");
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][column] = input.nextInt();
        }

        //Initializing arrays with random values. The following loop initializes the array with random values between 0 and 99:
        for (int row=0; row<matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
        //Printing arrays. To print a two-dimensional array, you have to print each element in the array using a loop
        for (int row = 0); row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "");
            }
        }

    }
}