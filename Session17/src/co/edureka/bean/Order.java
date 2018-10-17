package co.edureka.bean;

public class Order {
	
	// Attributes
	int pid;
	String productName;
	String orderDate;
	String address;
	int price;
	boolean isProductAvailable; 		// should be true before order is placed
	boolean isAutoPaymentEnabled; 	    // if true we will directly place the order, else we will ask user to pay

	public Order() {
	
	}

	public Order(int pid, String productName, String orderDate, String address, int price, boolean isProductAvailable,
			boolean isAutoPaymentEnabled) {
		this.pid = pid;
		this.productName = productName;
		this.orderDate = orderDate;
		this.address = address;
		this.price = price;
		this.isProductAvailable = isProductAvailable;
		this.isAutoPaymentEnabled = isAutoPaymentEnabled;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isProductAvailable() {
		return isProductAvailable;
	}

	public void setProductAvailable(boolean isProductAvailable) {
		this.isProductAvailable = isProductAvailable;
	}

	public boolean isAutoPaymentEnabled() {
		return isAutoPaymentEnabled;
	}

	public void setAutoPaymentEnabled(boolean isAutoPaymentEnabled) {
		this.isAutoPaymentEnabled = isAutoPaymentEnabled;
	}

	// Business Logic Method
	// 1. PreCondition  : Check for Inventory
	// 2. Business Logic: Save Product Details
	// 3. PostCondition : Process Payments
	public void processOrder(String deliveryPlacePref, String time, boolean isGift){
		System.out.println("****************************************************");
		if(isProductAvailable){
		
			// Some small conditions in Business Logic
			if(isGift){
				price = price + 30; // Add Rs. 30 for Gifting
			}
			
			// Save the Order Object Data in the DataBase
			
			if(deliveryPlacePref.equals("office")){
				System.out.println("Deliver Product "+pid+" at Office by "+time);
			}else{
				System.out.println("Deliver Product "+pid+" at Home by "+time);
			}
			
		}else{
			System.out.println("OOPS!! Seems like Product "+pid+" has gone out of Stock !! Please come back again !!");
		}
		System.out.println("****************************************************");
	}
	
	
	@Override
	public String toString() {
		return "Order [pid=" + pid + ", productName=" + productName + ", orderDate=" + orderDate + ", address="
				+ address + ", price=" + price + ", isProductAvailable=" + isProductAvailable
				+ ", isAutoPaymentEnabled=" + isAutoPaymentEnabled + "]";
	}
	
	
}
