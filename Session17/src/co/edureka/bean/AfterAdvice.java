package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object ref1, Method method, Object[] inputs, Object ref2) throws Throwable {
		
		System.out.println("##after or PostProcessing: Process Payment and Notify Logistics##");
		
		if(method.getName().equals("processOrder")){
			Order order = (Order)ref2;
			if(order.isProductAvailable()){
				if(order.isAutoPaymentEnabled){
					System.out.println("Process Payment for amount \u20b9"+order.price);
					System.out.println("Notify Loistics to deliver the product with information Below:");
					System.out.println("Logisitics should deliver product at "+inputs[0]+" by "+inputs[1]);
				}else{	
					System.out.println("Please Proceed to Select a Payment Method to finish the order");
					System.out.println(">> Debit/Credit Cards");
					System.out.println(">> Net Banking");
					System.out.println(">> Wallet");
					System.out.println(">> Cash On Delivery");
				}
			}else{
				System.out.println("==Sorry !! We are out of stock !!==");
			}
			
			System.out.println("#########################################################");
		}
		
	}

}
