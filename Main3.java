import java.io.*;
import java.util.*;
class Main{
	public staic void main(String[] args){
		CartItem [] Items = new CartItem [4];
		BufferedReader br = new BufferedReader(new FileReader("ShoppingCart.txt"));
		int x =0;
		while(x<=4){
                    StringTokenizer st = new StringTokenizer(br.readLine(), ",");
                            Items[x].setProductId = st.nextToken();
                            Items[x].setName = st.nextToken();                            
                            Items[x].setPrice = st.nextToken();
                            Items[x].setQuantity = st.nextToken();
                            x+=1;
		}
		br.close();
		
		ShoppingCart obj = new ShoppingCart();
		obj.display(Items[0].getProductId, Items[1].getName, Items[2].getPrice, Items[3].getQuantity);
	}
}
