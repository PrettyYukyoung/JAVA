import java.util.Scanner;

public class practice_1 {
    static Scanner scan = new Scanner(System.in);
    static Scanner s = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
    input();
    }

    private static void input() {
        System.out.println("당신이 원하는 계산을 대신 해드립니다\r");
        System.out.println("1.A+B 2.A-B 3.A*B 4.A/B 5.A%B ");
        System.out.println("\r숫자 입력 : ");
        int i = scan.nextInt();
        whatDoYouWant(i);
    }

    public static void whatDoYouWant(int i) {
        if(i==1){
            System.out.println("당신이 선택하신건 1.A+B\n");
            System.out.println("A와 B를 엔터로 구분하여 입력 : ");
            int a = s.nextInt();
            int b = sc.nextInt();
            aPlusB(a,b);
        }
        else if(i==2){
            System.out.println("당신이 선택하신건 1.A-B\n");
            System.out.println("A와 B를 엔터로 구분하여 입력 : ");
            int a = s.nextInt();
            int b = sc.nextInt();
            aMinusB(a,b);
        }
        else if(i==3){
            System.out.println("당신이 선택하신건 1.A*B\n");
            System.out.println("A와 B를 엔터로 구분하여 입력 : ");
            int a = s.nextInt();
            int b = sc.nextInt();
            aMultiplicationB(a,b);
        }
        else if(i==4){
            System.out.println("당신이 선택하신건 1.A/B\n");
            System.out.println("A와 B를 엔터로 구분하여 입력 : ");
            int a = s.nextInt();
            int b = sc.nextInt();
            aDivideB(a,b);
        }
        else if(i==5){
            System.out.println("당신이 선택하신건 1.A%B\n");
            System.out.println("A와 B를 엔터로 구분하여 입력 : ");
            int a = s.nextInt();
            int b = sc.nextInt();
            aTheRestB(a,b);
        }
        else{
            System.out.println("!보기에 없는 숫자를 입력하셨습니다! \r!다시 입력해주세요 처음으로 돌아갑니다!\n");
            input();
        }

    }

    private static void aPlusB(int a,int b) {
        System.out.println("a 더하기 b의 값은 : "+(a+b));
    }
    private static void aMinusB(int a, int b) {
        System.out.println("a 빼기 b의 값은 : "+ (a-b) );
    }
    private static void aMultiplicationB(int a, int b) {
        System.out.println("a 곱하기 b의 값은 : "+a*b);
    }
    private static void aDivideB(int a, int b) {
        System.out.println("a를 b로 나눈 값 : "+a/b+" 나머지 : "+a%b);
    }
    private static void aTheRestB(int a, int b) {
        System.out.println("a를 b로 나눈거의 나머지 값 : " +a%b);
    }
}
