import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int cnt1 =0;
        int cnt2=0;
        for(int i=1;i<100;i++){
            cnt1=n/i;
            n/=i;

            if(cnt1<=0){
                System.out.print(i);
                break;
            }

        }
    }
}