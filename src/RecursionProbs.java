import java.util.*;

public class RecursionProbs {

	public RecursionProbs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//2
		System.out.print("sumReciprocals(10) >>> " + sumReciprocals(10));
		System.out.println();
		
		//3
		System.out.print("productOfEvens(4) >>> " + productOfEvens(4)); 
		System.out.println();
		
		//5
		System.out.print("conversion(10, 2) >>> " + conversion(10, 2)); 
		System.out.println();
		System.out.print("conversion(1453, 8) >>> " + conversion(1453, 8)); 
		System.out.println();
		
		//6
		System.out.print("matchingDigits(1000, 0) >>> " + matchingDigits(1000, 0));
		System.out.println();
		System.out.print("matchingDigits(298892, 7892) >>> " + matchingDigits(298892, 7892));
		System.out.println();
		
		//7
		Stack<Integer> nums = new Stack<Integer>();
		nums.add(3);
		nums.add(7);
		nums.add(12);
		nums.add(9);
		System.out.print("doubleUp(3, 7, 12, 9) >>> ");
		doubleUp(nums);
		System.out.println(nums); 
		
		//8
		System.out.print("printThis(1):  ");
		printThis(1);
		System.out.println();
		System.out.print("printThis(2):  ");
		printThis(2);
		System.out.println();
		System.out.print("printThis(3):  ");
		printThis(3);
		System.out.println();
		System.out.print("printThis(4):  ");
		printThis(4);
		System.out.println();
		System.out.print("printThis(5):  ");
		printThis(5);
		System.out.println();
		System.out.print("printThis(6):  ");
		printThis(6);
		System.out.println();
		System.out.print("printThis(7):  ");
		printThis(7);
		System.out.println();
		System.out.print("printThis(8):  ");
		printThis(8);
		System.out.println();
		
		//9
		System.out.print("printNums2(1):  ");
		printNums2(1);
		System.out.println();
		System.out.print("printNums2(2):  ");
		printNums2(2);
		System.out.println();
		System.out.print("printNums2(3):  ");
		printNums2(3);
		System.out.println();
		System.out.print("printNums2(4):  ");
		printNums2(4);
		System.out.println();
		System.out.print("printNums2(5):  ");
		printNums2(5);
		System.out.println();
		System.out.print("printNums2(6):  ");
		printNums2(6);
		System.out.println();
		System.out.print("printNums2(7):  ");
		printNums2(7);
		System.out.println();
		System.out.print("printNums2(8):  ");
		printNums2(8);
		System.out.println();
		System.out.print("printNums2(9):  ");
		printNums2(9);
		System.out.println();
		System.out.print("printNums2(10):  ");
		printNums2(10);
		System.out.println();
	}

	//2
	public static double sumReciprocals(int n) {
		double ret = 1.0; 
		if (n == 1) {
			return ret; 
		} else {
			return (1/(double)n) + sumReciprocals(n-1);
		}
	}
	
	//3
	public static int productOfEvens(int n) {
		if (n == 1) {
			return 2;
		} else {
			return (n * 2) * productOfEvens(n - 1);
		}
	}
	
	//4: Riddle
	
	//5
	public static String conversion(int num, int base) {
		if (num / base == 0) {
			return "" + num % base;
		} else {
			return conversion((num/base), base) + "" + num % base;
		}
	}

	//6
	public static int matchingDigits(int a, int b) {
		int ans = 0;
		if (a % 10 == b % 10) {
			ans++;
		}

		if (a / 10 == 0 || b / 10 == 0) {
			return ans;
		}
		return ans + matchingDigits(a / 10, b / 10);
	}
	
	//7
	public static void doubleUp(Stack<Integer> nums) {
		if (nums.isEmpty() == true) {
			return;
		} else {
			int top = nums.pop();
			doubleUp(nums);
			nums.push(top);
			nums.push(top);
		}
	}

	//8
	public static void printThis(int n) {
		if (n == 1) {
	        System.out.print("*");
	        return;
	    } else if (n == 2) {
	        System.out.print("**");
	        return;
	    }
	    System.out.print("<");
	    printThis(n - 2);
	    System.out.print(">");
	}
	
	//9
	public static void printNums2(int n) {
		if (n == 1) {
			System.out.print(1);
			return;
		} else if (n == 2) {
			System.out.print(1 + " " + 1);
			return;
		}
		System.out.print((n + 1) / 2 + " ");
		printNums2(n - 2);
		System.out.print(" " + (n + 1) / 2);
	}
}