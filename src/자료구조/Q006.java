package 자료구조;

import java.util.Scanner;

public class Q006 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 1; // end를 더하기 전이라 1
		int start = 1;
		int end = 1;
		int count = 1; // N만 뽑는 경우를 미리 넣어 초기화한다.

		while (end != N) { //end_index가 N이 될때까지 반복한다.
			if (sum == N) { // 값이 같아지면 count 그리고 end를 높혀주고 값이 오버되면 start도 높혀준다.
				count++;
				end++;
				sum += end; // 같아지면 이제 범위를 위로 높힌다.
			} else if (sum > N) {
				sum -= start; // 시작인덱스뺴주고 시작인덱스를 높힌다. 구간합(구간에 속하지 않은 값을 빼준거)
				start++;
			} else {
				end++;
				sum += end;
			}
		}

		System.out.print(count);

	}
}
