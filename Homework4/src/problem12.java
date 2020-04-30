import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s="Black ", m="White ";
        for (int i = 0; i < n; i++) {
            System.out.println();

            for (int j = 0; j <n ; j++) {
                if (j%2 == 1) { System.out.print(m); }
                else { System.out.print(s); }
            }
            String k = s;
            s=m;
            m=k;
        }
    }
}