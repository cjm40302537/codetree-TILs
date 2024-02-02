import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int a=0;
        for (int i =a;a<=100;a++){
            sum+=a;
            if(n<=sum){
                break;
            } 
        }
        System.out.print(a);
        
    }
}