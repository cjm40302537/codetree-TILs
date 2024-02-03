import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        boolean d =false;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(int i =a;i<=b;i++){
            if(i%c==0){
                d=true;
            }
        }
        if(d==true){
        System.out.print("NO");
        }else{
            System.out.print("YES");
        }
    }
}