package schoolPack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource =new ClassPathResource("SchoolPack.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Student student=(Student)factory.getBean("student");
		Teacher teacher=(Teacher)factory.getBean("teach");
	    System.out.println(teacher);
	}

}
