package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

//2021_02_09 TIME 20 : 23 ~ 20 : 28
public class ArrayEx04_문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		System.out.println("문제1");
		Random rand = new Random();
		for(int i = 0; i < 5; i ++) {
			int randNum = rand.nextInt(100)+1;
			arr[ i ] = randNum;
		}
		System.out.println(Arrays.toString(arr));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		System.out.println("문제2");
		int total = 0 ;
		int average = 0 ;
		for(int i = 0 ; i < 5 ; i++	) {
			total += arr[ i] ;
		}
		average = total / 5;
		System.out.println("총점("+ total +") "+"평균("+average+")");
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("문제3");
		int pass = 0 ;
		for(int i = 0 ; i < 5 ; i++) {
			if( arr[ i ] > 60 ) {
				pass ++ ;
			}
		}
		System.out.println("합격생의 수는 : " + pass + "명" );
	}
	
}
