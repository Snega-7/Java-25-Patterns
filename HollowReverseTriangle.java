import java.util.*;
public class HollowReverseTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(n-i+1)-1; j++){
                if(i==1 || j==1 || j==2*(n-i+1)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}