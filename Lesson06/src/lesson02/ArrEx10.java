package lesson02;

public class ArrEx10 {
	public static void main(String[] args) {
		//in this arr format, the index #0 is {1,2,3}
		//
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println(arr[1][0]); //as you go into the array, the type changes, ultimately to default
		
		String[][][] strs = {
				{}, { {"A", "B", "C"}, {"가", "나", "다"}, {"0", "1"} }
		};
		//strs.length
		//{}
		//{{"A", "B", "C"}, {"가", "나", "다"}}
		//{"0", "1"}
		System.out.println(strs.length);
		System.out.println(strs[1].length);
		System.out.println(strs[1][1].length);
		System.out.println(strs[1][1][1]);
	}
}
