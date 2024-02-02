import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int cnt =1;
        for(int i=1;i<100;i++){
            n/=i;
            cnt+=1;

            if(n/i<=0){
                System.out.print(cnt);
                break;
            }

        }
    }
}