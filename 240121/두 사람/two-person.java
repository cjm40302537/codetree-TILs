import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        char c =sc.next().charAt(0);

        if(a>=19 && c=='M'){
            System.out.println("1");
        }else{
           System.out.println("0"); 
        }
    }
}