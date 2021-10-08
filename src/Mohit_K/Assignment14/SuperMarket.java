package Mohit_K.Assignment14;

import java.util.Scanner;

public class SuperMarket {

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
			SuperMarket shop = new SuperMarket();
			Scanner quantity = new Scanner(System.in);
			System.out.println("How many maggie packets?");
			int numb1 = quantity.nextInt();
			System.out.println("How many dosa's?");
			int numb2 = quantity.nextInt();
			System.out.println("How many oilpouches?");
			int numb3 = quantity.nextInt();
			System.out.println("How many panipuri packets?");
			int numb4 = quantity.nextInt();
			System.out.println("How many masala packets?");
			int numb5 = quantity.nextInt();

			shop.Customer(numb1,numb2,numb3,numb4,numb5);
			shop.outOfStock();
			shop.inStock();
		}

	
}
