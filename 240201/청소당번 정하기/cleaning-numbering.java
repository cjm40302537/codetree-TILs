import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cnt1 =0;//교실
        int cnt2=0;//복도
        int cnt3=0;//화장실
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i/10==1){
                continue;
            }
            if(i%2==0){
                cnt1++;
            }
            if(i%3==0){
                cnt2++;
            }
            if(i%12==0){
                cnt3++;
            }
        }
        System.out.print(cnt1+" "+cnt2+" "+cnt3);
    }
}