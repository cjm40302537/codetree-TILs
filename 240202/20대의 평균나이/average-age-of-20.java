import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cnt =0;
        int sum =0;
        for(;;){
            int a=sc.nextInt();
            if(a>=30 || a<=19){
                double avg =sum/(double)cnt;
            System.out.printf("%.2f",avg);
                break;
            }
            sum+=a;
            cnt++;
        }
    }
}