import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        int n=sc.nextInt();
        int prod=1;
        int a=1;
        for(int i=a;i<=10;a++){
            prod*=a;
            if(prod>=n){
                break;
            }

        }
        System.out.print(a);
    }
}