import java.util.Scanner;
public class Main {
    public static boolean pr(int x){
        return x%2==0 &&(x/10+x%10)%5==0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(pr(n)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}