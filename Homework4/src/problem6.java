import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        double sum=0;
        for(int i = 1; i<=n; i++ ){
            sum = sum + 1/ (double) i;
        }
        System.out.println("sum="+sum);
    }
}
