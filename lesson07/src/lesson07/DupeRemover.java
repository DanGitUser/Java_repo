package lesson07;

import java.util.Arrays;

//50개의 길이를 가지는 정수 배열 생성. 각 값은 1~20사이의 숫자로 채우기
		//이후 중복된 값을  제거한 새 배열 생성
public class DupeRemover {
	public static void main(String[] args) {
		
        int[] nums = new int[50];
        int[] uniq = new int[50];
        int uCount = 0;

        for (int i = 0; i < 50; i++) {
            int num = (int) (Math.random() * 20) + 1;
            nums[i] = num;

            boolean dupe = false;
            for (int j = 0; j < uCount; j++) {
                if (num == uniq[j]) {
                    dupe = true;
                    break;
                }
            }
            if (!dupe) {
                uniq[uCount++] = num;
            }
        }

        System.out.println("Random numbers: " + Arrays.toString(nums));
        System.out.println("Unique numbers: " + Arrays.toString(Arrays.copyOf(uniq, uCount)));
    }
}