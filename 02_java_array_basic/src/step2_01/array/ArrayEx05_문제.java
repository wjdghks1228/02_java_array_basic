package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

//2021 _ 02 _ 09 TIME -> 20 : 28 ~ 20 : 33

public class ArrayEx05_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		System.out.println("문제 1 ");
		System.out.println(" 0 1 2 3 4");
		System.out.print("학생 번호를 입력하세요 : ");
		int student = scan.nextInt();
		if( student >= 5) {
			System.out.println("없는 학생입니다.");
			return;
		}
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		else {
			System.out.println("성적 : " + arr [ student ] + "점");
		}
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.println("문제2");
		System.out.println(Arrays.toString( hakbuns ));
		System.out.print("학번을 입력하세요 : ");
		int numbers =  scan.nextInt();
		for(int i = 0 ; i < 5 ; i++) {
			if(hakbuns [ i ] == numbers) {
				System.out.println("학번입력 : " + hakbuns[ i ] + " 성적 : " + scores[ i]);
			}
		}

	}
	
}
