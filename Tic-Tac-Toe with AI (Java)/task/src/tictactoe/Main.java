package tictactoe;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        char[][] fild = new char[3][3];
        String input = scanner.nextLine();
        System.out.println("---------");
        int index = 1;
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++){
                fild[i][j] = input.charAt(index++);
                System.out.print(fild[i][j]+" ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
