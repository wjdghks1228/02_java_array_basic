package step2_01.array;

import java.util.Arrays;
import java.util.Random;

//2021_02_16 TIME --> 20 : 25 ~ 20 : 34
/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
*  예)
 * 랜덤숫자 : 1
 * check = {false , true , false , false , false}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {false , true , false , true , false}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {false , true , true , true , false}
 * arr   = {1, 3, 2, 0, 0}
 */

public class ArrayEx11_문제 {

	public static void main(String[] args) {
	
		Random ran  = new Random(); 
		
		boolean[] check = new boolean[5];
		int[] arr   = new int[5];
		
		//check false 초기화
		for(int i = 0 ; i < check.length ; i++) {
			check [ i ]  = false;
		}
		
		int log = 0;
		int arrIndex = 0;
		boolean isRun = true;
		while(isRun) {

			if(arrIndex == 5) {
				isRun = false;
			}
			int ranNum = ran.nextInt(5);
			//중복숫자 검출
			if(check [ ranNum ] == true) {
					continue;
			}
				
			arr [ arrIndex ] = ranNum;
			check [ ranNum ] = true;
			arrIndex ++;
			System.out.println(Arrays.toString(check));
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
					
	}
	
}
