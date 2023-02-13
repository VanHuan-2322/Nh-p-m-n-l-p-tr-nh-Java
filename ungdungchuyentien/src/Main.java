import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner tien= new Scanner(System.in);
        System.out.print("nhap so tien USD: ");
        usd= tien.nextDouble();
        double doi=usd*23000;
        System.out.print("tong tien o Viet Nam: " +doi +" VNĐ");
    }
}