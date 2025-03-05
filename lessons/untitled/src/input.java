import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //String string = new String("dfssdf");     //java.lang
        Scanner s = new Scanner(System.in); //java.util
        System.out.println("Gib ein Zahl ein");
        int x = s.nextInt();
        System.out.println("Es wird "+x+" eingegeben");
    }
}
