import java.util.Scanner;

public class CharacterSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
    int key=scanner.nextInt();
    switch (key) {
        case 1:
            System.out.println("!");
        break;
        case 2:
        System.out.println("@");
        break;
        case 3:
        System.out.println("#");
        break;
        case 4:
        System.out.println("$");
        break;
        case 5:
        System.out.println("%");
        break;
    }
    }
}
