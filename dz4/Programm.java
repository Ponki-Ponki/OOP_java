package dz4;

/**
 * Programm
 */
public class Programm {
	public static void main(String[] args) {
		Integer[] a = {1,2,44,5,23,234,4234};
		ArrayL<Integer> list = new ArrayL<>(a);
		list.addItem(1);
		list.addItem(5);
		list.addItem(6);
		list.addItem(51);
		list.addItem(41);
		list.addItem(153);
		list.print();
		// String[] a = {"asda","sdfg","d","adsf","gf","we12","asdzxcad","fd","sa","d","asd","zx","r3"};
		// ArrayL<String> list = new ArrayL<>(a);
		// list.deleteItem(0);
		// list.print();
		// list.deleteItemFromItem("d");
		list.deleteItemFromItem(1);
		list.print();
		System.out.println(list.getMax());
		System.out.println(list.getMin());
		list.getSumm();
		System.out.println(list.getMultipli());
		System.out.println(list.findIndxItem(-1));
		System.out.println(list.findItem(3));
		list.getElement(0);
		list.setElement(0, 1919);
		list.print();
		System.out.println("Length: "+list.getLength());
		list.bubbleSort();
		// list.selectionSort();
		// list.selectionSort();
		list.print();
	}
}