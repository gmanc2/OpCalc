/*
 * Attackspeed
 * 2/23/2020
 * JDK 1.8
 */
import java.util.Scanner;
public class Attackspeed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    double as;
    double seconds = 0;
    int op;
    int c;
    double calc;
    double out;
    System.out.println("Input 1 for Seconds per attack 2 for calculating modifier");
    c = scan.nextInt();
    if(c == 1) {
        System.out.println("Input attack modifier amount:");
        as = scan.nextDouble();
        System.out.println("Input opp number:");
        op = scan.nextInt();
        if (op == 0) {
            seconds = 1 / (4 + as);
        } else if (op == 1) {
            seconds = 1 / (4 * (1 + as));
        }
        System.out.println("Seconds per full attack: " + seconds);
    }
    if(c == 2) {
        System.out.println("Input Opperator:");
        c = scan.nextInt();
        if(c==0) {
            System.out.println("Input seconds desired");
            calc = scan.nextDouble();
            out = 1 / calc - 4;
            System.out.println("Attack modifier:" + out);
        }
        else if (c == 1){
            System.out.println("Input seconds desired");
            calc = scan.nextDouble();
            out = (-4*calc +1)/(4 * calc);
            System.out.println("Attack modifier:" + out);
        }
    }


    }
}
