import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt(), i =2 ,s=0;
        while(i<=n-1){
         if(n%i==0){
              s++;
              i++;
         } else i++;

        }
        if (s == 0) {System.out.println("Prime");}
        else {System.out.println("Not prime");}
        }
        }


