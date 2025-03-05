import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Gib 5 ein");
            value = scanner.nextInt();
            System.out.println("Du hast "+value+" eingegeben");
        } while(value!=5);
        System.out.println("Du hast 5 eingegeben");
    }
}
