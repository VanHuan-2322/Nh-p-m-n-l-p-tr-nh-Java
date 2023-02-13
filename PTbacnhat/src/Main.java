import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("pt bac nhat 'a * x + b = c' ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.print("PT vo nghiem");

        } else if (b == c) {
                System.out.print("PT co nghiem X=0");}
          else { double no = (c - b) / a;
            System.out.printf("pt co nghiem X= "+ no);
            }
        }
    }
