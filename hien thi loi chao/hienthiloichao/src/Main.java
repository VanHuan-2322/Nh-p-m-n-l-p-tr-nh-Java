import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ten=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = ten.next();
        System.out.println("Hello: " + name);
    }
}