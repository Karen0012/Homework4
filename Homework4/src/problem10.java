import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= 1, y=1, n= scanner.nextInt(), m;
        if(n%2==1){
            m=(n-2)/2+1;
        }
        else m=(n-2)/2;

        for (int i = 1; i <=m ; i++) {
            x=x+y;
            y=x+y;
        }if(n%2==0){
            System.out.println(y);
        }else{
            System.out.println(x);
        }
    }
}
