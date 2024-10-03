import java.util.*;
public class thirdQuestion {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        for(int i=s; i<=e; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
