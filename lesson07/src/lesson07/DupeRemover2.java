package lesson07;

import java.util.Arrays;

//50개의 길이를 가지는 정수 배열 생성. 각 값은 1~20사이의 숫자로 채우기
		//이후 중복된 값을  제거한 새 배열 생성
public class DupeRemover2 {
	public static void main(String[] args) {
		
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 3 + 1);
		}
        System.out.println(Arrays.toString(arr));
        
        int[] tmp = new int[3];
        int length = 0;
        
        for( int n : arr) {
        	boolean insert = true;
        	for (int i = 0; i < tmp.length; i++) {
        		if (n == tmp[i]) {
        			insert = false;
        			break;
        		}
        	}	
        	if(insert) {
        		tmp[length++] = n;
        	}	
        }
        System.out.println(Arrays.toString(tmp));
        tmp = Arrays.copyOf(tmp, length);
        arr = tmp;
        System.out.println(Arrays.toString(arr));
    }
}