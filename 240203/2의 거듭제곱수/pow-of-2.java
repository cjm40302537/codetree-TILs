import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int prod=1;
        int cnt =0;
        for(;;){
            if(n==prod){
                break;
            }
            prod *=2;
            cnt++;
        }
        System.out.println(cnt);
    }
}