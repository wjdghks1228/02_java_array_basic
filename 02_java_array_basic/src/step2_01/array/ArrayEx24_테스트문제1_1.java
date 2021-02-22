package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = { 10, 4, 5, 3, 1 };

		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 1");
		System.out.println("----------------------------------------");
		System.out.println();

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);

		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2 , 1 ==> 4
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 2");
		System.out.println("----------------------------------------");
		System.out.println();

		System.out.println("값을 입력 : ");
		int value = scan.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				System.out.println("인덱스는 : " + i);
			}
		}

		// 문제 3) 인덱스를 입력하면 값 출력
		// 예) 2 ==> 5 , 4 ==> 1
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 3");
		System.out.println("----------------------------------------");
		System.out.println();

		System.out.println("인덱스를 입력해주세요 : ");
		int index = scan.nextInt();
		System.out.println("인덱스에 해당하는 값은 : " + a[index]);

		// 문제 4) 위 배열중 가장 큰 값 출력
		// 예) 10
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 4");
		System.out.println("----------------------------------------");

		int max = -100;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		System.out.println(max);
		// 문제 5) 위 배열중 홀수의 개수 출력
		// 예) 홀수의 개수 : 3
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 5");
		System.out.println("----------------------------------------");

		int holCnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				holCnt++;
			}
		}
		System.out.println(holCnt + " 개");

		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("문제 6");
		System.out.println("----------------------------------------");
		int[] b = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터 저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = { 0, 0, 0, 0, 0 };
		int cIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				c[cIndex] = a[i];
				cIndex++;
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
