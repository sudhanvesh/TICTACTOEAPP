import java.util.Scanner;

public class TicTacToe2 {

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        int slot = sc.nextInt();
        return slot;
    }
}