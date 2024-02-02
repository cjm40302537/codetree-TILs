import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        int sum =0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;a<=b;a++){
            if(a%6==0 && a%8!=0){
                sum+=a;
            }

        }
        System.out.print(sum);
    }
}