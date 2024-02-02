import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        pr(x);
    }
    public static void pr(int a){
        int cnt=0;
        for(int i=1; i<=a;i++){
            for(int j=1;j<=a;j++){
                cnt++;
                if(cnt>9){
                    cnt =1;
                }
                System.out.print(cnt+" ");
            }
            System.out.println();
        }
    }
}