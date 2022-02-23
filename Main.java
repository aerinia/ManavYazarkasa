import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.print("Armut kaç kilo? :");
        double kg=input.nextDouble();
        double ar=kg*2.14;
        System.out.print("Elma kaç kilo? :");
        double kg1= input.nextDouble();
        double el= kg1*3.67;
        System.out.print("Domates kaç kilo? :");
        double kg2= input.nextDouble();
        double dm=kg2*1.11;
        System.out.print("Muz kaç kilo? :");
        double kg3= input.nextDouble();
        double muz=kg3*0.95;
        System.out.print("Patlıcan kaç kilo? :");
        double kg4= input.nextDouble();
        double pa=kg4*5;
        System.out.println((ar+el+dm+muz+pa)+" TL ödeyin.");
    }
}
