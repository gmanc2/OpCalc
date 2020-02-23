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
    System.out.println("Input attack modifier amount:");
    as = scan.nextDouble();
    System.out.println("Input opp number:");
    op = scan.nextInt();
    if(op == 0) {
        seconds = 1 / (4 + as);
    }
    else if(op == 1) {
        seconds = 1 / (4 * (1 + as));
    }
    System.out.println("Seconds per full attack: " + seconds);
    }
}
