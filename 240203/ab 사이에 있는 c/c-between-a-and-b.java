import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        boolean d =false;
        for(int i=a; a<=b; a++){
            c+=c;
            if(c%a==0){
                d = true;
                break;
            }
        }
        if(d==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}