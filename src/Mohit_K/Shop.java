package Mohit_K;

/*Assignment  7  : 30th March 2021 

1. Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. Partial selling is allowed.  
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
*/

public class Shop {
	int Maggie = 50;
	int Dosa = 43;
	int oilPouches = 39;
	int Panipuri = 45;
	int Masala = 73;
	
	void Customer(int maggieQty, int dosaQty, int oilqty, int panipuriQty, int masalaQty) {
		if (Maggie >= maggieQty) {
			Maggie = Maggie - maggieQty;
		}
		if (Dosa >= dosaQty) {
			Dosa = Dosa - dosaQty;
		}
		if (oilPouches >= oilqty) {
			oilPouches = oilPouches - oilqty;
		}
		if (Panipuri >= panipuriQty) {
			Panipuri = Panipuri - panipuriQty;
		}
		if (Masala >= masalaQty) {
			Masala = Masala - masalaQty;
		}
		
	}
	
	void outOfStock() {
		if (Maggie == 0) {
			System.out.println("Maggie is running out of stock" );
		}
		if (Dosa == 0) {
			System.out.println("Dosa is running out of stock" );
		}
		if (oilPouches == 0) {
			System.out.println("oilPouches is running out of stock" );
		}
		if (Panipuri == 0) {
			System.out.println("Panipuri is running out of stock" );
		}
		if (Masala == 0) {
			System.out.println("Masala isrunning out of stock" );
		}
		
	}
	
	void inStock() {
		if (Maggie > 0){
			System.out.println("Remaining stock of maggie is : "+ Maggie + "packets" );
		}
		if (Dosa > 0){
			System.out.println("Remaining stock of dosa is : "+ Dosa + "packets" );
		}
		if (oilPouches > 0){
			System.out.println("Remaining stock of oilpouches is : "+ oilPouches + "packets" );
		}
		if (Panipuri > 0){
			System.out.println("Remaining stock of panipuri is : "+ Panipuri + "packets" );
		}
		if (Masala > 0){
			System.out.println("Remaining stock of masala is : "+ Masala + "packets" );
		}
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.Customer(10,10,10,10,10);
		shop.outOfStock();
		shop.inStock();
	}

}
