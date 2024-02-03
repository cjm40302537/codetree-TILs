import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean a=false;
        int cnt=0;
        int n =sc.nextInt();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                cnt++;

            }
        }
        if(cnt==2){
            a=true;
        }
        if(a=true){
            System.out.print("P");
        }else{
            System.out.print("C");
        }
    }
}