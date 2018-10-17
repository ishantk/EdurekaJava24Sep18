package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

					//        ref to method, input values in the method, ref to the Order Bean
	@Override
	public void before(Method method, Object[] inputs, Object ref) throws Throwable {
		
		System.out.println("==before or PreProcessing: Checking for Inventory==");
		
		if(method.getName().equals("processOrder")){
			
			for(Object o : inputs){
				System.out.println(o);
			}
			
			// Downcast ref to the Order
			Order order = (Order)ref;
			// Check for inventory logic here
			// Ideally code should go in DB and Check
			if(Util.PRODUCT_STOCK>0){
				order.isProductAvailable = true;
			}else{
				order.isProductAvailable = false;
			}
			
			// Ideally code should go in DB and Check
			if(Util.PAYMENT_METHOD == 1 || Util.PAYMENT_METHOD == 2){
				order.isAutoPaymentEnabled = true;
			}else{
				order.isAutoPaymentEnabled = false;
			}
		}
		
		System.out.println("===================================================");
	}

}
