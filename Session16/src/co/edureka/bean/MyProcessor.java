package co.edureka.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanName) throws BeansException {
		System.out.println("==postProcessAfterInitialization== "+beanName);
		return beanRef;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanName) throws BeansException {
		System.out.println("==postProcessBeforeInitialization== "+beanName);
		
		if(beanName.equals("conID1")){
			//System.out.println("==Accessing Bean Data==");
			DBConnection con = (DBConnection)beanRef;
			//System.out.println(con.getPassword());
			con.setPassword("someNewPass123");
		}
		
		return beanRef;
	}

}
