package siru.practice08;
/*
 * 测试类
 */
public class StudentDemo {

	public static void main(String[] args) {
		//创建对象
		Student s = new Student(); //没有写构造方法的时候也没有报错，因为系统会给出一个默认的构造方法
		//但是当给了有参构造方法这里就会报错。
		s.show();
		
		//通过public Student(String name)来创建对象
		Student s2 = new Student("林青霞");
		s2.show();
		
		//通过public Student(int age)来创建对象
		Student s3 = new Student(30);
		s3.show();

		//通过public Student(String name, int age)构造方法来创建对象
		Student s4 = new Student("大龙",30);
		s4.show();
	}

}
