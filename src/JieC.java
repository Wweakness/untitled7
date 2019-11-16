import java.util.Scanner;
public class JieC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
       for(int j=1;j<=n/5;j++){
           if(j*5<=n){
               count++;
               if(j%5==0){
                   count++;
               }
            }
       }

       System.out.println(count);
    }
}
