import java.util.*;

public class ticTacToe {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Press S to start ");

        char ch = sc.next().charAt(0);

        int turn = 1;
        int count = 0;

        if (ch == 's' || ch == 'S') {
            while (winnerChecker(arr) == 0) {
                count++;

                if (turn == 1) {
                    System.out.println("X's Turn ");
                    int block = sc.nextInt();
                    gridFiller(arr, turn, block);
                    int ans = winnerChecker(arr);
                    if (ans == 1)
                        System.out.println("Player X won the game ");
                    else if (ans == 2)
                        System.out.println("Player 0 won the game ");
                    turn = 2;
                } else {
                    System.out.println("0's Turn ");
                    int block = sc.nextInt();
                    gridFiller(arr, turn, block);
                    int ans = winnerChecker(arr);
                    if (ans == 1)
                        System.out.println("Player X won the game ");
                    else if (ans == 2)
                        System.out.println("Player 0 won the game ");
                    turn = 1;
                }
                if (count == 9) {
                    System.out.println("Match Tied ");
                    break;
                }

            }

        }

    }

    public static void gridFiller(int[][] arr, int turn, int block) {
        if (block == 1) {
            arr[0][0] = turn;
        } else if (block == 2) {
            arr[0][1] = turn;
        } else if (block == 3) {
            arr[0][2] = turn;
        } else if (block == 4) {
            arr[1][0] = turn;
        } else if (block == 5) {
            arr[1][1] = turn;
        } else if (block == 6) {
            arr[1][2] = turn;
        } else if (block == 7) {
            arr[2][0] = turn;
        } else if (block == 8) {
            arr[2][1] = turn;
        } else if (block == 9) {
            arr[2][2] = turn;
        }

    }

    public static int winnerChecker(int[][] arr) {

        if ((arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1)
                || (arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1)
                || (arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1)
                || (arr[0][0] == 1 && arr[1][0] == 1 && arr[2][0] == 1)
                || (arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1)
                || (arr[0][2] == 1 && arr[1][2] == 1 && arr[2][2] == 1)
                || (arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1)
                || (arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1)) 
        {return 1;} 
        else if ((arr[0][0] == 2 && arr[0][1] == 2 && arr[0][2] == 2)
                || (arr[1][0] == 2 && arr[1][1] == 2 && arr[1][2] == 2)
                || (arr[2][0] == 2 && arr[2][1] == 2 && arr[2][2] == 2)
                || (arr[0][0] == 2 && arr[1][0] == 2 && arr[2][0] == 2)
                || (arr[0][1] == 2 && arr[1][1] == 2 && arr[2][1] == 2)
                || (arr[0][2] == 2 && arr[1][2] == 2 && arr[2][2] == 2)
                || (arr[0][0] == 2 && arr[1][1] == 2 && arr[2][2] == 2)
                || (arr[0][2] == 2 && arr[1][1] == 2 && arr[2][0] == 2)) {
            return 2;
        }

        return 0;

    }

}
