import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =0;
        for(int i=a;a<=b;a++){
            if(a%2==0){
                sum+=a;
            }
        }
        System.out.print(sum);
    }
}