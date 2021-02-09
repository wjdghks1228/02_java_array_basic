package step2_01.array;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		//1.일반 변수 ( 값 저장 )
		int nVar = 0 ;
		
		//2. 주소 변수 ( 주소 저장 ) 
		int [ ] arr = null;
		arr = new int [ 5 ];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr[ 0 ] = 10; 
		arr[ 1 ] = 20; 
		arr[ 2 ] = 30; 
		arr[ 3 ] = 40; 
		arr[ 4 ] = 50;
		
		System.out.println("배열 출력 방법 1");
		for( int i = 0 ; i < 5 ; i++) {
			System.out.println(arr[ i ]);
		}
		
		System.out.println("배열 출력 방법 2");
		System.out.println(Arrays.toString(arr));
		
		//System.out.println(arr[5]);
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//배열 범위 초과 에러
	}

}
