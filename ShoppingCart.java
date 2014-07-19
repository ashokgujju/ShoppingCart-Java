class ShoppingCart implements Cart{

	String Product [][] = new String [10][2];
	float Price [] = new float [10];
	int Quantity [] = new int [10];
		
	public  void add(String productId, String productName, float price, int quantity){
		for(int i=0;i<10;i++)
			if(Product [i][0] == null)
				{
					Product[i][0] = productId;
					Product[i][1] = productName;
					Price[i] = price;
					Quantity [i] = quantity;
					break;
				}
	}
	
	public void update(String prodId, int quantity){
		for(int k=0; k<10;k++)
			if(prodId.equals(Product[k][0])){
				Quantity[k]=quantity;
				System.out.println("\n"+Product[k][1] +"'s quantity is updated.\n");				
				break;}

	}
	
	public void display(){
		System.out.println("Product Id\tProduct Name\tPrice\t\tQuantity");
		for(int j =0 ; j<10 ;j++)
			if(Product[j][0] != null)
				{	
					System.out.print(Product[j][0]+"\t\t"+Product[j][1]+"\t\t");
					System.out.format("%.2f", Price[j]);
					System.out.print("\t"+Quantity[j]); 
					System.out.println();
				}
		System.out.println();
	}
	
	public void remove(String prodId){
		for(int k=0 ; k<10 ;k++)
			if(prodId.equals(Product[k][0])){
				System.out.println("\n"+Product[k][1] +" is removed from the shopping cart.\n");										
				Product[k][0]=Product[k][1]=null;
				Quantity[k] = 0;
				Price[k] = (float)0;
				break;
			}
	}	
}
