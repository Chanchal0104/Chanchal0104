import java.util.*;
public class Number{
    public static void main(String[] args) {
        int i , j , n, c=1;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the value on n: ");
        n = sc.nextInt();
        for(i = 0;i<n; i++){
            for(j=0; j<=i; j++){
                System.out.print(j+" ");
                
            }
            System.out.println("");
        }
    }
}