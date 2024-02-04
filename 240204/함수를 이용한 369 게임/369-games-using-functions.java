import java.util.Scanner;
public class Main {
    public static boolean pr(int x){
        return x%3==0 ||x/10==3 ||x/10==6||x/10==9;
    }
    public static boolean pr1(int x){
        return x%10==3||x%10==6||x%10==9 ||pr(x);
    }



    public static void main(String[] args) {
        int cnt =0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;a<=b;a++){
            if(pr1(a)){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}