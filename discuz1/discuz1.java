import java.util.Arrays;  
public class discuz1{

	public static int mystery(int[] inputArray, int k){
		int x = inputArray[k];
		int answer = k;
		int index = k + 1;
		while(index < inputArray.length){
			if(inputArray[index] < x){
				x = inputArray[index];
				answer = index;
			}
			index = index + 1;
		}
		return answer;	
	}

	public static void mystery2(int[] inputArray){
		int index = 0;
		while(index < inputArray.length){
			int targetIndex = mystery(inputArray, index);
			int temp = inputArray[targetIndex];
			inputArray[targetIndex] = inputArray[index];
			inputArray[index] = temp;
			index = index + 1;
		}
	}

	public static int fib(int n){
		if(n == 1)
			return 0;
		if(n == 2)
			return 1;
		return  fib(n-1) + fib(n-2);
	}

	public static void main(String[] args){
			int[] inputArray = {3, 0, 4, 6, 3};
			int m_result = mystery(inputArray, 1);
			System.out.println(Arrays.toString(inputArray));
			System.out.println("The result of mystery is :" + m_result);
			mystery2(inputArray);
			System.out.println(Arrays.toString(inputArray));

			int fibex = fib(5);
			System.out.println("The result of fib exercise is :" + fibex);
	}
}