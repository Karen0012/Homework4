import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     int x=scanner.nextInt(),y= scanner.nextInt(),sum=0;
        while(x<y){
            if(x%9==0){
                System.out.print(x +" ");
                sum=sum+x;
                x++;
            }else{
                x++;
            }
                    }
        System.out.println(sum);
}
}
