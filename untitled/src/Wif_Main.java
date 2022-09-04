import java.util.Scanner;

public class Wif_Main {
    public static void main(String[] args) {
        String[] names = new String[]{"ishara","isuru","aj","sara"};
        int[] percentage = new int[4];
        int i;
        Scanner bill = new Scanner(System.in);

        for(i = 0; i < 4; i++){
            System.out.println("Enter Percentage for " + names[i]);
            percentage[i] = bill.nextInt();

        }

        System.out.println("Enter total bill value for month with 2 decimals : ");
        double total = bill.nextDouble();
        Calculate_wifi wifi = new Calculate_wifi();
        wifi.set_bill(total,percentage[0],percentage[1],percentage[2],percentage[3]);

        wifi.calculate_bill();
    }

}
