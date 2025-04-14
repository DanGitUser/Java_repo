package lesson07;

import java.util.Arrays;

//50���� ���̸� ������ ���� �迭 ����. �� ���� 1~20������ ���ڷ� ä���
		//���� �ߺ��� ����  ������ �� �迭 ����
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