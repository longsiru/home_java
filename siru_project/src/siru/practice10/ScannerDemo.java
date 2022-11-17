package siru.practice10;

import java.util.Scanner;

/*
 * Scanner在java.unil包下使用时需要导入
 * Scanner：
 *      用于获取键盘来录入数据(基本数据类型，字符串string数据）
 *      
 * public String nextLine()：
 *      获取键盘录入的字符串数据
 *      
 * 注意：调用方法时，如果方法有明确的返回值，我们用变量接受（这里的变量是line）
 */
public class ScannerDemo {

	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入一个字符串数据");
        String line = sc.nextLine();
		
		//输出结果
		System.out.println("你输入的数据是： " + line);

	}

}
