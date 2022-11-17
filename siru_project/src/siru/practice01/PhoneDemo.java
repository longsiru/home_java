package siru.practice01;
/*
 * 创建对象
 *    格式： 类名 对象名 = new 类名（）
 *    范例： Phone p = new Phone
 *    
 * 使用对象
 *    1. 使用成员变量
 *       格式： 对象名.变量名
 *       范例： p.brand
 *    2.使用成员方法
 *       格式： 对象名.方法名（）
 *       范例： p.call()
 */
public class PhoneDemo {

	public static void main(String[] args) {
		//创建对象
				Phone p = new Phone();
				
				//使用成员变量
				System.out.println(p.brand);  //此时还没有值，在堆内存里，输出默认值
				System.out.println(p.price);
				
				p.brand = "小米"; //进行赋值
				p.price = 2999;
				
				System.out.println(p.brand);//赋值后输出，数值赋予的值
				System.out.println(p.price);
				
				//使用成员方法
				p.call(); //手机类里面的方法call(),方法里面输出了“打电话”，所以通过对象调用方法时，在控制台输出的就是“打电话”
				p.sendMessage();
	}

}
