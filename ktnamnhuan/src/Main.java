import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.println("nhap so nam: ");
        nam = scanner.nextInt();
        if(nam % 4 == 0){
            if (nam%100==0)
            {
                if (nam%400==0)
                {System.out.println("Nam "+nam+" la nam nhuan");
                }
                else {System.out.print("Nam "+nam+" la nam khong nhuan");}

            }
            else {System.out.println("Nam "+nam+" la nam nhuan");}
        }
        else {
            System.out.print("Nam "+nam+" la nam khong nhuan");
        }
    }
}