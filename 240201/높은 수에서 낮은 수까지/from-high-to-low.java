import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(b>a){
            for(int i =b;b>=a;b--){
                System.out.print(b+" ");
            }
        }else{
            for(int i=a;a>=b; a--){
                System.out.print(a+" ");
            }
        }
    }
}