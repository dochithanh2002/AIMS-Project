package MainSrc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[20];
	private int qtyOrdered = 0;
	
	void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}else {
			this.itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}

	void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart does not have enough spacecle for the DVD list");
		} else {
			for (DigitalVideoDisc digitalVideoDisc : dvdList) {
				this.itemOrdered[qtyOrdered] = digitalVideoDisc;
				qtyOrdered++;
			}
			System.out.println("The disc list has been added");
		}
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart does not have enough space for 2 DVDs");
		} else {
			addDigitalVideoDisc(dvd1);
			addDigitalVideoDisc(dvd2);
		}
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is null");
		}else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (this.itemOrdered[i] == disc) {
					this.itemOrdered[i] = this.itemOrdered[qtyOrdered - 1];
					this.itemOrdered[qtyOrdered - 1] = null;
					qtyOrdered--;
				}
			}
			System.out.println("The disc has been deleted");
		}
	}
	
	float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += this.itemOrdered[i].getCost();
		}
		return sum;
	}
}
