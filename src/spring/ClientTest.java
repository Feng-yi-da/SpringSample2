package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ��ȡBeanFactory
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// �������л�ȡSample����
		Sample sample = (Sample) beanFactory.getBean("sample2");

		// ����Sample����ķ���
		int result = sample.compute(3, 4);
		System.out.println(result);
	}

}
