
import java.util.Scanner;
public class NI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        char[] m=n.toCharArray();
        char[] b = new char[m.length];
        int j=0;
        for(int i=m.length-1;i>-1;i--){
            b[j]=m[i];
            j++;
        }
        String s=new String(b);
        System.out.println(s);

    }
}
