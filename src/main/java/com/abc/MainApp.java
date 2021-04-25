package com.abc;
import com.abc.ChildA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
ParentInterface p=context.getBean(ParentInterface.class);
p.sum(5, 6);
Abc a=(Abc) context.getBean("abc");
System.out.println(a);
Abc a1=(Abc) context.getBean("abc1");
System.out.println(a1);

	}



}
