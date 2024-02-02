import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        int y=sc.nextInt();
        pr(x,y);
    }

    public static void pr(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(1);
            }
            System.out.println();
        }

    }
}