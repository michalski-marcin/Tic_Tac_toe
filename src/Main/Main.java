
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Game game = new Game();

        System.out.println("Welcome to Tic Tac Toe game!");

        game.askForNewGame();

    }
}