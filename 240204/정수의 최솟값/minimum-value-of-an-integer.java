import java.util.Scanner;
public class Main {
    public static int pr(int x,int y,int z){
        int e=0;
        if(x>y && z>y){
            e+=y;
        }else if(y>x && z>x){
            e+=x;
        }else{
            e+=z;
        }
        return e;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(pr(a,b,c));

        
    }
}