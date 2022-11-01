import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double perKM=0.10,cocukIndirim=0.50,gencIndirim=0.10,yasliIndirim=0.30,gidisDönüs=0.20,toplam;
        int km,yas,tip;
        Scanner getData=new Scanner(System.in);
        System.out.print("Please enter flying distance (km): ");
        km=getData.nextInt();
        System.out.print("Please enter age of the passenger:");
        yas=getData.nextInt();
        System.out.print("Please choose type of flight (1- One Way  2- Two Way): ");
        tip =getData.nextInt();
        if(km>0&&(tip==2||tip==1)&&yas>0) {
            toplam = perKM * km;
            if (yas <= 12) toplam -= toplam * cocukIndirim;
            else if (yas <= 24) toplam -= toplam * cocukIndirim;
            else if (yas >= 65) toplam -= toplam * yasliIndirim;
            if (tip == 2) toplam = (toplam - tip * toplam) * 2;
            System.out.println("Your Flight ticket cost " + toplam + " TL");
        }else System.out.println("Invalid data entry.");

    }
}