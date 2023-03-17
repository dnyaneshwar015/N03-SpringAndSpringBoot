package org.tnsif.objectsInjection;
//driver class
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIUsingObjects {

	public static void main(String[] args) {
		
		BeanFactory f=new ClassPathXmlApplicationContext("web.xml");
		Charger e=f.getBean("Charger",Charger.class);
		System.out.println(e);
		//System.out.println(e.cost());
		//System.out.println(e.display());
	}

}