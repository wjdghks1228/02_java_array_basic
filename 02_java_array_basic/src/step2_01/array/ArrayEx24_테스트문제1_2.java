package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 8");
		System.out.println("----------------------------------------");
		System.out.println();
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		int myNum = scan.nextInt();
		
		int eIndex = 0;
		for(int i = 0 ; i < d.length ; i++ ) {
			if( d[ i ] == myNum	 ) {
				continue;
			}
			e[ eIndex++ ] = d [ i ]  ;  	
		}
		System.out.println(Arrays.toString(e));
		
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 9");
		System.out.println("----------------------------------------");
		System.out.println();
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		
		System.out.println("번호입력 : ");
		myNum = scan.nextInt();
		
		int gIndex = 0;
		for (int i = 0 ; i < f.length; i++) {
			if( f[ i ] == myNum ) {
				i += 1;
				continue;
			}
			g[ gIndex++ ] = f [ i ]; 	
		}
		
		System.out.println(Arrays.toString(g));
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 10");
		System.out.println("----------------------------------------");
		System.out.println();
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		
		myNum = scan.nextInt();
		
		for(int i = 0 ; i < h.length - 1 ; i++) {
			h [ i ] = h [ i + 1 ];
		}
		h [ h.length - 1 ] = myNum;
		System.out.println(Arrays.toString(h));
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 11");
		System.out.println("----------------------------------------");
		System.out.println();
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		
		myNum = scan.nextInt();
		
		for( int y = i.length - 1; y >=1 ; y --) {
			i [ y ] = i [ y  - 1];
		}
		i [ 0 ] = myNum;
		System.out.println(Arrays.toString(i));
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		int kIndex = 0;
		for (int y = j.length - 1 ; y >= 0 ; y-- ) {
			k[ kIndex ++ ] = j [ y ];
		}
		System.out.println(Arrays.toString(k));
		
		
		
	}

}
