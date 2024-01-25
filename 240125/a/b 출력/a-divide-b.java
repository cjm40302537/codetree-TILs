import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double c=a/(double)b;
        System.out.printf("%.20f",c);
    }
}