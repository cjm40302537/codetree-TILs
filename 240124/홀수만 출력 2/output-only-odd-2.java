import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        b=sc.nextInt();
        a=sc.nextInt();
        for(int i=b;i>=a;i-=2){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }  
    }
}