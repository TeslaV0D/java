import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib dein Alter an");
        int age = scanner.nextInt();
        switch(age){
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 :
                System.out.println("Du bist an der Schule");
                break;
            case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27 :
                System.out.println("Du bist an der Arbeit");
                break;
            default:
                System.out.println("Nichts passiert");
        }
    }
}
