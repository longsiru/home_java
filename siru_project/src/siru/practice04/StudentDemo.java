package siru.practice04;

public class StudentDemo {

	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
				
		//使用对象
		//使用成员变量
		s.name = "大龙";
//		s.age = 18;
//		s.age = -18;
		s.setAge(30);
//		s.setAge(-30);
				
//		System.out.println(s.name);
//		System.out.println(s.age);		
//		System.out.println(s.name+ "," + s.age);
				
		//使用show方法
		s.show();  //大龙,18

	}

}
