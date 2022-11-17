package siru.practice05;
/*
 * private关键字的使用
 * 
 *     一个标准类的编写：
 *              1.把成员变量用private修饰
 *              2.提供对应的getXxx()/setXxx()方法。
 */
public class Student {
	//成员变量
	private String name;
	private int age;
	
	//get/set method
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	
	public void show() {
		System.out.println(name + "," + age);
	}
	

}
