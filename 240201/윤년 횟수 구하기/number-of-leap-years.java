import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int cnt1=0;
        int cnt2=0;
        for(int i=1;i<=n;i++){
            if(i%100==0 && i%400!=0){
                cnt2++;
            }else if(i%4==0){
                cnt1++;
            }
        }
        System.out.print(cnt1);
    }
}