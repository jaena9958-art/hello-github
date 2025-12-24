import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0; // sum이라는 연산자가 0.
         
            while (true) {
            System.out.print("숫자를 입력하세요 (종료: quit) : ");
            String input = reader.readLine();

            if ("quit".equals(input)) {
            System.out.println("최종합계 :" + sum);
            System.out.println("프로그램을 종료합니다.");
            break;  // 반복문 탈출
            }

            int number = Integer.parseInt(input);
            sum += number;
            System.out.println("현재 합계 : " +  sum );
        }

        reader.close();
    }
}