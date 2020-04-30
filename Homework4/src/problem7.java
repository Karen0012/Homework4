import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt(), sum1=0, sum2=0;
        for (int i = 1; i <=n ; i=i+2) {
            sum1 = sum1 + i;

        }
        for (int i = 2; i <=n ; i=i+2) {
            sum2 = sum2 - i;

        }int sum=0;
        System.out.println(sum=sum1 + sum2);
    }
}
