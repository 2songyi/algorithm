package 자료구조;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N];
		long[] C = new long[M];
		
		long answer = 0;
		S[0] = sc.nextInt(); // 배열 첫번째에는 값 그대로 넣어줌
		
		for (int i = 1; i < N; i++) {
			S[i] = S[i-1] + sc.nextInt(); // 누적합
		}
		
		for (int i = 0; i < N; i++) {
			int remainder = (int)(S[i] % M); // 누적합을 M으로 나눠줌
			if (remainder == 0) {
				answer++; // M으로 나누어 떨어지면 정답 카운트
			}
			C[remainder]++; // 나머지가 C배열의 인덱스번호가 되고 그 나머지의 개수 카운트
		}
		
		for (int i = 0; i < M; i++) {
			if (C[i] > 1) {
				answer += C[i] * (C[i] - 1) / 2;
			}
		}
		System.out.println(answer);

	}

}
