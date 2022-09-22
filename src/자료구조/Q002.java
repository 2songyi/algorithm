package 자료구조;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		for (int i=0; i<N; i++) {
			if (A[i]>max) {
				max = A[i];
			}
			sum += A[i];
		}
		double result = (sum*100.0)/max;
		System.out.println(result/N);

	}

}

//import java.util.*;
//public class Q002 {
//    public static void main(String[] args) {
//    
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] A = new int[N];
//        
//        for (int i=0; i<N; i++) {
//            A[i] = sc.nextInt();
//        }
//        
//        long sum = 0;
//        long max = 0;
//        
//        for (int i=0; i<N; i++) {
//            if (A[i] > max) {
//                max = A[i];
//            }
//            sum += A[i];
//        }
//        
//        System.out.print(sum * 100.0 / max / N);
//    }
//}