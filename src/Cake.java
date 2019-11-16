import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] a=new int[1000][1000];
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j=j+2){
                if(j%4==0){
                    a[i][j]=1;
                    a[i][j+1]=1;
                }else{
                    a[i][j]=0;
                    a[i][j+1]=0;
                }
            }
        }

        for(int i=2;i<y;i=i+4){
            for(int j=0;j<x;j=j+2){
                if(j%4==0){
                    a[i][j]=0;
                    a[i+1][j]=0;
                    a[i][j+1]=0;
                    a[i+1][j+1]=0;
                }else{
                    a[i][j]=1;
                    a[i+1][j]=1;
                    a[i][j+1]=1;
                    a[i+1][j+1]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}




/*import java.util.Scanner;
public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] a=new int[100][100];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j=j+2){
                if(j%4==0){
                    a[i][j]=1;
                    a[i][j+1]=1;
                }else{
                    a[i][j]=0;
                    a[i][j+1]=0;
                }
            }
        }

        for(int i=2;i<x;i=i+4){
            for(int j=2;j<y;j=j+2){
                if(i%4==0){
                    a[i][j]=0;
                    a[i][j+1]=0;
                }else{
                    a[i][j]=1;
                    a[i][j+1]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}*/
