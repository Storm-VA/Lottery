import java.util.Random;

public class Lottery {
    // переменные для хранения выигрышных номеров
    private int[] winningNumbers;

    public Lottery() {
        winningNumbers = new int[5];
    }

    // метод для генерации выигрышных номеров
    public void generateWinningNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            winningNumbers[i] = rand.nextInt(50) + 1;
        }
    }

    // метод для проверки выигрыша
    public void checkWinningNumbers(int[] numbers) {
        int matchCount = 0;
        System.out.print("Winning numbers: ");
        for (int winningNum : winningNumbers) {
            System.out.print(winningNum + " ");
            for (int num : numbers) {
                if (winningNum == num) {
                    matchCount++;
                }
            }
        }
        System.out.println();
        if (matchCount == 5) {
            System.out.println("Congratulations! You have won the grand prize!");
        } else if (matchCount == 4) {
            System.out.println("Congratulations! You have won a runner-up prize!");
        } else if (matchCount == 3) {
            System.out.println("Congratulations! You have won a consolation prize!");
        } else {
            System.out.println("Sorry, you did not win any prizes this time.");
        }
    }
}
