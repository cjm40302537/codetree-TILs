import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(c>a){
            if(a>b){
                System.out.println(a);
            }else if(b>a && c>b){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}