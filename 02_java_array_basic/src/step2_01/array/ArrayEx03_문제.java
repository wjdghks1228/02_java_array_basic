package step2_01.array;

import java.util.Arrays;

/*
 * # 배열 기본문제
 */

public class ArrayEx03_문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		System.out.println("문제 1");
		for( int i = 0 ; i < 5; i ++) {
			arr[ i ] = ( i + 1 ) * 10;
		}
		System.out.println(Arrays.toString(arr));
		
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40
		System.out.println("문제 2");
		for(int i = 0 ; i < 5; i++) {
			if(arr[ i ] % 4 == 0 ) {
				System.out.println(arr[ i ]);
			}
		}
		
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		System.out.println("문제 3");
		int fourSum = 0 ;
		for(int i = 0 ; i < 5 ; i++) {
			if( arr[ i ] % 4  == 0 ) {
				fourSum += arr[ i ];
			}
		}
		System.out.println(fourSum);
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		System.out.println("문제 4");
		int fourCount = 0;
		for(int i = 0 ; i < 5 ; i++) {
			if( arr[ i ] % 4 == 0 ) {
				fourCount ++;
			}
		}
		System.out.println(fourCount);
		
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		int count = 0;
		System.out.println("문제 5");
		for(int i = 0 ; i < 5; i++) {
			if( arr[ i ] % 2 == 0 ) {
				count ++ ;
			}
		}
		System.out.println(count);
		
	}
	
}
