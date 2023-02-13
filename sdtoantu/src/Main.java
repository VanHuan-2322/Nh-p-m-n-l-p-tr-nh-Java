import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        float r,d;
        System.out.print("nhap chieu rong: ");
        r= n.nextFloat();
        System.out.print("nhap chieu dai:");
        d=n.nextFloat();
        float S=r*d;
        System.out.print(S);
    }
}