package Nguyen.Van.Huan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc tu 0 den 999 ");
        int n = scanner.nextInt();
        if (n < 0 || n > 999) {
            System.out.print("nhap lai n tu 0 den 999");
        } else if (n >= 0 && n <= 15) {
            switch (n) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;

                case 5:
                    System.out.print("Five");
                    break;

                case 6:
                    System.out.print("Six");
                    break;

                case 7:
                    System.out.print("Seven");
                    break;

                case 8:
                    System.out.print("Eight");
                    break;

                case 9:
                    System.out.print("Nine");
                    break;
                case 10:
                    System.out.print("Ten");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
            }
        } else if (n > 15 && n < 20) {
            switch (n % 10) {
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eightteen");
                    break;
                case 9:
                    System.out.print("niceteen");
                    break;
            }

        } else if (n > 19 && n < 100) {
            switch (n / 10) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;

                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (n % 10) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;

                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;

                case 5:
                    System.out.print("Five");
                    break;

                case 6:
                    System.out.print("Six");
                    break;

                case 7:
                    System.out.print("Seven");
                    break;

                case 8:
                    System.out.print("Eight");
                    break;

                case 9:
                    System.out.print("Nine");
                    break;
            }
        } else {
            switch (n /100) {
                case 1:
                    System.out.print("One hundred and ");
                    break;
                case 2:
                    System.out.print("Two hundred and ");
                    break;
                case 3:
                    System.out.print("Three hundred and ");
                    break;
                case 4:
                    System.out.print("Four hundred and ");
                    break;
                case 5:
                    System.out.print("Five hundred and ");
                case 6:
                    System.out.print("Six hundred and ");
                case 7:
                    System.out.print("Seven hundred and ");
                case 8:
                    System.out.print("Eight hundred and ");
                case 9:
                    System.out.print("nine hundred and ");
                switch ((n%100)/10) {
                    case 2:
                        System.out.print("Twenty ");break;
                    case 3:
                        System.out.print("Thirty ");break;
                    case 4:
                        System.out.print("Forty ");break;
                    case 5:
                        System.out.print("Fifty ");break;
                    case 6:
                        System.out.print("sixty ");break;
                    case 7:
                        System.out.print("seventy ");break;
                    case 8:
                        System.out.print("Eighty ");break;

                    case 9:
                        System.out.print("Ninety ");break;
                }
            }
            switch ((n%100)% 10) {
                case 1:
                    System.out.print(" "+"one");
                    break;
                case 2:
                    System.out.print(" "+"two");
                    break;

                case 3:
                    System.out.print(" "+"Three");
                    break;
                case 4:
                    System.out.print(" "+"Four");
                    break;

                case 5:
                    System.out.print(" "+"Five");
                    break;

                case 6:
                    System.out.print(" "+"Six");
                    break;

                case 7:
                    System.out.print(" "+"Seven");
                    break;

                case 8:
                    System.out.print(" "+"Eight");
                    break;

                case 9:
                    System.out.print(" "+"Nine");
                    break;
            }
        }
         }
    }
