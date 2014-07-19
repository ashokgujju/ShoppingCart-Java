import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args){
		CartItem [] Items = new CartItem [10];
		Scanner as = new Scanner(System.in);

		try{
				BufferedReader br = new BufferedReader(new FileReader("ShoppingCart.txt"));
		
				int index =0, count =0;
		
				String line=null;
				while((line=br.readLine())!=null){
				    StringTokenizer st = new StringTokenizer(line, ",");
			
					Items[index]=new CartItem();  

					String id = st.nextToken();
					Items[index].setProductId(id);
			
					String name = st.nextToken();
					Items[index].setName(name);                            
			
					String price = st.nextToken();
					Items[index].setPrice(Float.valueOf(price.trim()).floatValue());
			
			
					int quantity = Integer.parseInt(st.nextToken());
					Items[index].setQuantity(quantity);
					index+=1;
					count+=1;
				}
		
				br.close(); 
		
		
				ShoppingCart obj = new ShoppingCart();
				
				int index2=0;
				while(index2<count){
					obj.add(Items[index2].getProductId(), Items[index2].getName(), Items[index2].getPrice(), Items[index2].getQuantity());
					index2 +=1;		
				}
		
				int choice = 0;
		
		do{		
				System.out.println("\nMenu\n");
				System.out.println("1. Add new product \n2. Update the quantity of product \n3. Display all items \n4. Remove a item \n5.Exit");
				System.out.println("Enter your choice : ");
				choice = as.nextInt();
		
				switch(choice){
					case 1:
						{
									
							Items[index2]=new CartItem();  
	
							System.out.println("\n1. Add new product\n");
							
							System.out.println("Enter product Id");
							Items[index2].setProductId(as.next());
							
							System.out.println("Enter product name :");
							Items[index2].setName(as.next());
							
							System.out.println("Enter price of the product");
							Items[index2].setPrice(as.nextFloat());
							
							System.out.println("Enter quantity of the product");
							Items[index2].setQuantity(as.nextInt());
					
							obj.add(Items[index2].getProductId(), Items[index2].getName(), Items[index2].getPrice(), Items[index2].getQuantity());
							index2+=1;

							break;
						}
						
					case 2:
						{
							System.out.println("\n2. Update the quantity of product\n");
							System.out.println("Enter the productId : ");
							String pid = as.next();
					
							for(int j=0;j<index2;j++){
								if((Items[j].getProductId()).equals(pid)){
									System.out.println("Enter new quantity of product : ");
									int quantity = as.nextInt();
									Items[j].setQuantity(quantity);
									obj.update(Items[j].getProductId(), Items[j].getQuantity());
									break;
									}
								if(j==(index2-1))
									System.out.println("\nProduct Id not found.......\n");
								}
							break;
						}
						
					case 3:
						{
							System.out.println("\n3. Display all items\n");
							obj.display();
							break;
						}
						
					case 4:
						{
							System.out.println("\n4. Remove a item\n");
							System.out.println("Enter the productId : ");
							String pid = as.next();
					
							for(int j=0;j<index2;j++){
								if((Items[j].getProductId()).equals(pid)){
									obj.remove(Items[j].getProductId());
									break;
									}
								if(j==(index2-1))
									System.out.println("\nProduct Id not found.......\n");
								}
							break;
						}
					case 5:
						{
							System.out.println("\nthanks for using this program...\n");
							break;
						}
					default:
							System.out.println("\nInvalid choice try again....\n");
									
					} // end of switch control
			}while(choice != 5);
			
		}catch(InputMismatchException e){System.out.println("\nInvalid input try again later....\n");}
		catch(IOException e){System.out.println("File not found...");}
	}
}
