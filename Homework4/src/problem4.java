import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
int x =scanner.nextInt(),y = scanner.nextInt();
int i=1,j=1;
    while(j<=y){
        i=i*x;
        j++;
    }

        System.out.println(x+"^"+y+"="+i);
        }

}
