import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int limit = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
            if (i < limit) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
