import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       for(;;){
        int a =sc.nextInt();
        int b=sc.nextInt();
        char c =sc.next().charAt(0);
        int prod =a*b;
        System.out.println(prod);
        if(c=='C'){
            break;

        }
       }
    }
}