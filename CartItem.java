class CartItem {
	private String productId ;
	private String name;
	private float price;
	private int quantity;

	public void setProductId(String productId){
		this.productId = productId;
	}
	public String getProductId(){
		return productId;
	}
	
	public void setName(String name){
		this.name =  name;
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	public float getPrice(){
	
		return price;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
	
		return quantity;
	}
}
