package siru.practice08;
/*
 *  1.构造方法的创建：
 *     如果没有定义构造方法，系统会给出一个默认的无参构造方法
 *     如果定义了构造方法，系统将不在提供默认的构造方法
 *  
 *  2.构造方法的重载
 *     如果自定义了带参的构造方法，还要使用无参构造方法的话，就必须再写一个无参构造方法
 *  
 *  3.推荐的使用方式
 *      无论是否使用，都手工书写无参构造方法。
 *      
 */
public class Student {
	//成员变量
	private String name;
	private int age;
	
	//构造方法
//	public Student() {
//		System.out.println("无参构造方法");
//	}
	
	//默认构造方法，无参构造方法
	public Student() {};
	//name构造
	public Student(String name) {
		this.name = name;
	}
	
	//age构造
	public Student(int age) {
		this.age = age;
	}
	
	//完整的构造方法
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//show（）方法
	public void show() {
		System.out.println(name + "," + age);
	}
	

}
