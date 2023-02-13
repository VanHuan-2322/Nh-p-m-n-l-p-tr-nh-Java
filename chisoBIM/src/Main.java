import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        double chieucao, cannang,BMI;
        System.out.println("nhap chieu cao 'met'");
        chieucao= n.nextDouble();
        System.out.println("nhap can nang 'kg'");
        cannang= n.nextDouble();
        BMI= cannang/(chieucao*chieucao) ;
        System.out.println("BMI \n"+BMI);
        if (BMI<18.5)
        {
            System.out.println("Trang Thai \n"+"Gay");
        }
        else if ( BMI>= 18.5 && BMI<25)
        {
            System.out.println("Trang Thai \n"+"Binh thuong");
        }
        else if ( BMI>= 25 && BMI<30) {
            System.out.println("Trang Thai \n"+"Beo");
        }
        else { System.out.println("Trang Thai \n"+"Beo phi");}
    }
}
