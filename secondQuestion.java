
import java.util.*;
public class secondQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 50;

        for(int i=1; i<=m; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else System.out.println(i);
        }
    }
}
