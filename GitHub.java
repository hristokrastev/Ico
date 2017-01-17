package Java_fund_second_couse;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int n = Integer.parseInt(console.nextLine());
        double car = 0;
        double micBus = 0;
        double smallBus = 0;
        double bigBus = 0;
        double train = 0;
        double sumPeople =0;

        for (int i = 0; i < n; i++) {
            double people = Integer.parseInt(console.nextLine());
            if (people <= 5){
                car+= people;
            }else if (people > 5 && people <= 12){
                micBus = micBus + people;
            }else if (people > 12 && people <= 25){
                smallBus+=people;
            }else if (people > 25 && people <= 40){
                bigBus+=people;
            }else {
                train+=people;
            }
            sumPeople =car + micBus + smallBus + bigBus + train;


        }
        double carp = car/sumPeople * 100;
        double micbp = micBus/sumPeople * 100;
        double smallbp =smallBus/sumPeople * 100;
        double bigbusp= bigBus/sumPeople * 100;
        double trainp = train/sumPeople * 100;
        System.out.printf("%.2f",carp);
        System.out.println("%");
        System.out.printf("%.2f",micbp);
        System.out.println("%");
        System.out.printf("%.2f",smallbp);
        System.out.println("%");
        System.out.printf("%.2f",bigbusp);
        System.out.println("%");
        System.out.printf("%.2f",trainp);
        System.out.println("%");

    }
}