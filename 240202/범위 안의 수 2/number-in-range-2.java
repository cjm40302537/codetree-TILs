import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cnt =0;
        int sum=0;
        double avg;
        for(int i=1;i<=10;i++){
            int a=sc.nextInt();
            if(a>=0 && a<=200){
                cnt++;
                sum+=a;
            }
        }
        avg=(double)sum/cnt;
        System.out.printf("%d %.1f",sum,avg);
    }
}