import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        if(a==b){
            c=a;
            System.out.println(c);
        }
        else {
            for(int i=2;i<b+1;i++){
                if(a*i%b==0){
                    c=a*i;
                    System.out.println(c);
                    break;
                }else {
                    continue;
                }

            }
        }
    }
}