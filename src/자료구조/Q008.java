package 자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class Q008 {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(bf.readLine());
//		int result = 0;
//		long[] A = new long[N];
//		
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		for (int i=0; i<N; i++) {
//			A[i] = Long.parseLong(st.nextToken());
//		}
//		
//		Arrays.sort(A);
//		
//		for (int k=0; k<N; k++) {
//			int i = 0;
//			int j = N - 1;
//			long find = A[k];
//			
//			while(i<j) {
//				if (A[i] + A[j] == find) { // 값이 일치할때
//					if (i != k && j != k) { // 서로 다른 두 값으로 더했을떄
//						result++;
//						break;
//					} else if (i == k) {
//						i++;
//					} else if (j == k) {
//						j--;
//					}
//				} else if (A[i]+A[j] < find) {
//					i++; // 작으면 i를 높여서 값을 키워야함
//				} else {
//					j--; // 값이 크면 j를 낮춰서 값을 낮춰야한다.
//				}
//			}
//		}
//		System.out.println(result);
//		bf.close();
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		
		for (int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}
		
		Arrays.sort(A);
		int count = 0;
		
		for (int k=0; k<N; k++) {
			long find = A[k];
			int i = 0;
			int j = N-1;
			
			while(i < j) {
				if (A[i]+A[j] == find) {
					if (i != k && j != k) {
						count++;
						break;
					} else if (i==k) {
						i++;
					} else if (j==k) {
						j--;
					}
				} else if (A[i]+A[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(count);
	}
}
