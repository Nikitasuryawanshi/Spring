package com.edubridge.myspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationcontext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		//Student student = beanFactory.getBean(Student.class);
	
		//student.readData();
		//student=new Student("Rani",234);
		
		//System.out.println(student);
	
		Employee employee = beanFactory.getBean(Employee.class);
//		employee.setEmpId(1234);
//		employee.setEmpName("rani");
//		employee.setSalary(25000);
		System.out.println(employee);
		
	}

}
