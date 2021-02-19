package step2_01.array;

import java.util.Arrays;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 temp 배열을 생성한뒤에 
 *   arr배열의 요소들을 temp로 옮겨담자.
 * 
 * 
 */
//2021_02_19 TIME : 19 : 34 ~ 19 : 37
public class ArrayEx13_문제 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int tempCnt = 0;
		int tempIndex = 0 ;
		//4의 배수 확인
		for ( int i = 0 ;  i< arr.length ; i++) {
			if(arr [ i ] % 4 == 0 ) {
				tempCnt ++ ;
			}
		}
		temp = new int [ tempCnt ];
		for(int i = 0 ; i < arr.length ; i++) {
			if ( arr [ i ] % 4 == 0 ) {
				temp[tempIndex]	 = arr [ i] ;
				tempIndex++;
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
		int index = 0;
		
		for(int i = 0 ; i < arr.length; i++	) {
			if( arr[ i ] % 4 == 0) {
				temp [ index ] = arr[ i ];
				index++;
			}
		}
	}
	
}
