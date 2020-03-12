import java.util.Scanner;
import java.util.Random;

public class T200312 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		line(arr);
	}
	public static void line(int[] arr) {
		int tmp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
	            if(arr[j]%2 != 0) {
	                tmp = arr[j];
	                arr[j] = arr[i];
	                arr[i] = tmp;
	            }
            } 
        	System.out.print(arr[i] + " ");
	    } 
	}

	public static void main4(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int lastSum = 1;
		for(int i = 2; i <= n; i++) {
			System.out.print(lastSum + " " + sum + " ");
			lastSum = sum + lastSum;
			sum = sum + lastSum;
		}
	}

	public static void main3(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        int i = 0;
        int j = 0;
        int count;
        for(i = 0; i < arr.length; i++) {
            count = 0;
            for(j = 0;j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                count ++;    
                }if(count == 1) {
        		System.out.println(arr[i]);
            	}
       		 }
   		}
   	}
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = fac(num);
		System.out.println(ret);
	}
	public static int fac(int n) {
		if(n == 1) {
			return 1;//返回1的阶乘
		}
		return n*fac(n-1);
	}

	public static void main1(String[] args) {
		//递归
		//原理：函数的运行需要开辟栈帧
		//只要运行一个函数，就要在栈上开辟内存
		//容易栈溢出；StackOverflow
		//1——10的和
		int ret = sum(10);
		System.out.println(ret);
	}
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n + sum(n-1);
		//层层递（只计算到sum(n-1)）
		//层层归(return 1 ——> n + sum(n-1) ——> 加和后再 return)
	}
}