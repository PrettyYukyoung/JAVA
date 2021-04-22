import java.util.Scanner;

public class practice_1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        method(a);
    }

    public static void method(int i) {
        for(int j=0;j<i;j++)
            System.out.println(j);

    }
}