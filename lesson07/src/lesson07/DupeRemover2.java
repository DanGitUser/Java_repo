package lesson07;

import java.util.Arrays;

//50���� ���̸� ������ ���� �迭 ����. �� ���� 1~20������ ���ڷ� ä���
		//���� �ߺ��� ����  ������ �� �迭 ����
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