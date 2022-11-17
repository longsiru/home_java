package siru_practice02;
/*
 * 学生测试类（测试类都要有main）
 */
public class StudentDemo {

	public static void main(String[] args) {
			//创建对象
			Student s = new Student();
			
			//使用对象
			  //使用成员变量
			s.name = "大龙";
			s.age = 18;
			
			System.out.println(s.name);
			System.out.println(s.age);		
			System.out.println(s.name+ "," + s.age);
			
			  //使用成员方法
			s.study();
			s.doHomework();
	}

}
