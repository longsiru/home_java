package siru.practice04;
/*
 * private关键字
 * 1.是一个权限修饰符
 * 2.可以修饰成员（成员变量和成员方法）
 * 3.作用是保护成员不被别的类使用，被private修饰的成员只在本类中才能访问。
 * 
 * 针对private修饰的成员表变量，如果需要被其他类使用，提供相应的操作
 * 1.提供“get变量名（）”方法，用于获取成员变量的值，方法用public修饰
 * 2.提供“set变量名（参数）”方法，用于设置成员变量的值，方法用public修饰
 */
public class Student {
	//成员变量
		String name;
//		int age;
		private int age;  //成员变量有默认值。
		
		//提供get和set方法
		public int getAge() {
			return age;
		}
		
		public void setAge(int a) {
//			age = a;
			if (a < 0 || a > 120) {
				System.out.println("你给的年龄有误");
			}else {
				age = a;
			}
		}
		
		
		
		//成员方法
		public void show() {  //show的作用是为了在控制台输出name和age的值。
			System.out.println(name + "," + age);
}

}
