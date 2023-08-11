package beanPack;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmployeeBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// load the configuration file
		Resource resource =new ClassPathResource("employeebean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee employee=(Employee)factory.getBean("employee");
	    System.out.println(employee);
	}

}
