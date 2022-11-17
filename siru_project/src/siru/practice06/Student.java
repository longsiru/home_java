package siru.practice06;
/*
 * this关键字的使用
 *     1.this修饰的变量用于指代成员变量
 *        方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量。
 *        方法的形参没有与成员变量同名，不带this修饰的变量指是成员变量。
 *        
 *     2.什么时候用this：解决局部变量隐藏成员变量
 *     
 *     3.this：代表所在类的对象引用（方法被那个对象调用，this就代表哪个对象）
 *     
 */
public class Student {
	//成员变量
	private String name;
	private int age;
	
	//get/set method
	public String getName() {
		return name;
	}
//	public void setName(String n) {
//		name = n;
//	}
	public void setName(String name) {
//		name = name;//赋值不成功结果为null
		this.name = name;  //this后的那么是成员变量，没有this的name是局部变量。
	}
	
	public int getAge() {
		return age;
	}
//	public void setAge(int a) {
//		age = a;
//	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println(name + "," + age);
	}
	

}
