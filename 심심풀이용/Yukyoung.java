import java.util.Scanner;
public class Yukyoung {
    static Scanner scan = new Scanner(System.in);
    static Scanner scen = new Scanner(System.in);
    public static void main( String[] args ){
        System.out.println("유경이는 이쁘다를 몇번 쓰고싶으신가요? : ");
        int numbers = scan.nextInt();
        Yukyoung(numbers);

    }

    private static void Yukyoung(int numbers) {
        int wrongAnswer=0;
        for(int chocolate=1;chocolate<=numbers+wrongAnswer;chocolate++){
            System.out.println("유경이는 이쁘다를 입력하세요(띄어쓰기 주의): ");
            String perpactAnswer = "유경이는 이쁘다";

            String answer = scen.nextLine();
            int answerNum = numbers-chocolate+wrongAnswer;
            if(perpactAnswer.equals(answer)){
                if(answerNum == 0) {
                    break;
                }
                System.out.println("정확한 대답! 앞으로 "+answerNum+"번 남았습니다.");
            }
            else{
                System.out.println("잘못된 대답! 다시 쓰세요");
                wrongAnswer +=1;
            }
        }
        System.out.println("끝낫습니다. 잘 하셨습니다.");
    }
}
