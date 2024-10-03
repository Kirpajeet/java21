import java.util.*;
public class basicTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int m = 1;
        int limit = 100;
        int sum = 0;
        System.out.print(n+",");
        System.out.print(m+",");

        while(sum<=limit){
            sum = n + m;
            n = m;
            m = sum;
            if(sum>limit){
                break;
            }
            System.out.print(sum+",");
        }

    }
}
