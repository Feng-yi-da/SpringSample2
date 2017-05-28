package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 获取BeanFactory
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// 从容器中获取Sample对象
		Sample sample = (Sample) beanFactory.getBean("sample2");

		// 调用Sample对象的方法
		int result = sample.compute(3, 4);
		System.out.println(result);
	}

}
