import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean x=false;
        for(int i=1;i<=5;i++){
            int a =sc.nextInt();
            if(a%3==0){
                
                x=true;
            }else{
                x=false;
                break;
            }
        }
        if(x==true){
        System.out.print(1);
        }else{
            System.out.print(0);
        }

    }
}