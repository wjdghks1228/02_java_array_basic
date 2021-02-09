package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 사용 예시 
		String [ ] test1 = new String[ 3 ] ;
		double [ ] test2 = new double [ 5 ];
		char [ ] test3 = new char [ 1 ];
		boolean [ ] test4 = new boolean [ 10 ];
		
		int [ ] arr1 = new int [ 3 ];
		arr1 [ 0 ] = 10 ;
		arr1 [ 1 ] = 20 ;
		arr1 [ 2 ] = 30 ;
		
		//배열 사용 예시2 : 축약형 ( 배열을 처음 생성할 때만 가능 )
		int [ ] arr2 = { 10 , 20 , 30 };
		//                0  , 1 ,  2
		// arr2 = {40,50,60}; -> ERROR : 처음만들때만 가능 중간에 이런식으로 변경 불가능 
		
		//배열 사용 예시3 : FOR 문과 조화
		int [ ] arr3 = new int [ 100 ];
		int x = 10;
		for(int i = 0; i < 100; i++) {
			if(x > 100) {
				x = 10;
			}
			arr3 [ i ] = x;
			x += 10;
			System.out.println(arr3 [ i ]);
		}
	}

}
