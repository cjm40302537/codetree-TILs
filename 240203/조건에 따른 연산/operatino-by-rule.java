import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int cnt=0;
        int sum=0;
        for(;;){
            if(n%2==0){
                n=n*3+1;
                sum+=n;
                cnt++;
            }
            if(n%2==1){
                n=n*2+2;
                sum+=n;
                cnt++;
            }
            if(sum>=1000){
                break;
            }
        }
        System.out.println(cnt);
    }
}