import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int s=pr(a);
        System.out.println(s);
    }


    public static int pr(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum+=i;
            }
            return sum / 10;
        
    }
}