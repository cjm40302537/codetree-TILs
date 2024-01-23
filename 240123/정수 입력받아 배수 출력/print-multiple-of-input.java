import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m=n;
        for(int a=1;a<=5;a++){
            System.out.print(m+" ");
            m+=n;
        }
    }
}