package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_문제 {
//2021_02_19 19 : 15 ~ 19 : 32
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("put index1 and index2");
		getIndex1 = scan.nextInt();
		getIndex2 = scan.nextInt();
		
		int index1 = 0 ;
		int index2 = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if( i == getIndex1 ) {
				index1 =  i;
			}
			if( i == getIndex2 ) {
				index2 = i ;
			}
		}
		//기존 값 출력 
		System.out.println("["+arr[getIndex1]+"]     <-->     "+"["+arr[getIndex2]+"]");
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.println(Arrays.toString(arr));
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		System.out.println("문제2");
		System.out.println(Arrays.toString(arr));
		System.out.println("put value 1");
		int value1  =  scan.nextInt();
		System.out.println("put value 2");
		int value2  =  scan.nextInt();
		
		int valueIndex1 = 0 ;
		int valueIndex2 = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if( arr[ i] == value1 ) {
				valueIndex1 = i;
			}
			if( arr[ i ] == value2 ) {
				valueIndex2 =  i;
			}
		}
		temp = arr[valueIndex1];
		arr[valueIndex1] = arr[valueIndex2];
		arr[valueIndex2] = temp;
		System.out.println(Arrays.toString(arr));
		
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.println();
		System.out.println("문제3");
		System.out.println("put hakbuns 1 : ");
		int inputId1 = scan.nextInt();
		System.out.println("put hakbuns 2 : ");
		int inputId2 = scan.nextInt();
		
		int scoreTemp = 0;
		int scoreTemp1 = 0;
		int scoreTemp2 = 0;
		
		for(int i = 0 ; i < hakbuns.length; i++) {
			if( hakbuns[ i ] == inputId1 ) {
				scoreTemp1  = i ;
			}
			if( hakbuns [ i] == inputId2 ) {
				scoreTemp2 = i 	;
			}
		}
		System.out.println("기존 : "+ Arrays.toString(scores));
		
		int scoresTemp = scores[ scoreTemp1 ];
		scores[ scoreTemp1 ] = scores [ scoreTemp2 ];
		scores [ scoreTemp2 ] = scoresTemp;
		System.out.println("이후 : "+ Arrays.toString(scores));
	}
	
}
