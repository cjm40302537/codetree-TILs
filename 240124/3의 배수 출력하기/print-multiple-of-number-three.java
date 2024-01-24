import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
            int n;
            int a=3;
            n=sc.nextInt();
            while(a<=n){
                System.out.print(a+" ");
                a+=3;
            }
        }
    }