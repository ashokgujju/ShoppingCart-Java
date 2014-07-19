public interface Cart{
	public void add(String productId, String productName, float price, int quantity);
	public void update(String prodId, int quantity);
	public void display();
	public void remove(String prodId);
}
