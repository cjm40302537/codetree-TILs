import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        int sum=0;
        int cnt=0;
       // double avg=sum/2;
       a=sc.nextInt();
       b=sc.nextInt();
       for(int i=a;a<=b;a++){
        if(a%5==0 || a%7==0){
            cnt++;
            sum+=a;
        }
       }
       double avg=(double)sum/cnt;
       System.out.printf("%d %.1f",sum,avg);
    }
}