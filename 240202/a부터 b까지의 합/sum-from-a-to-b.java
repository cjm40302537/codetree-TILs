import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        int intVal=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;a<=b;a++){
            intVal+=a;
        }
        System.out.print(intVal);
    }
}