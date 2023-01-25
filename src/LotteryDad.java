import java.util.Scanner;

public class LotteryDad {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.generateWinningNumbers();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 5 lottery numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        lottery.checkWinningNumbers(numbers);
    }
}





