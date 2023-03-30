package dz4;

public class ArrayL<T> {

	private T[] array;
	private Integer length;

	public ArrayL() {
		this.length = 1;
		array = (T[]) new Object[length];
	}

	public ArrayL(T[] array) {
		this.array = array;
		this.length = array.length;
	}

	public void addItem(T obj) {
		T[] temp = (T[]) new Object[array.length + 1];
		if (array.length != 0)
			for (int i = 0; i < temp.length - 1; i++) {
				temp[i] = array[i];
			}
		temp[temp.length - 1] = obj;
		array = temp;
		length++;
	}

	public void deleteItem(int index) {
		T[] temp = (T[]) new Object[array.length - 1];
		int i = 0;
		for (int j = 0; j < array.length; j++) {
			if (j == index)
				continue;
			temp[i++] = array[j];
		}
		array = temp;
		length--;
	}

	public void deleteItemFromItem(T obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(obj)) {
				deleteItem(i);
				i--;
			}
		}
	}

	public T getMin() {
		if (length == 0) {
			printZero();
			return null;
		}
		T result = array[0];
		for (int i = 1; i < length; i++) {
			if (((Comparable<T>) array[i]).compareTo(result) < 0) {
				result = array[i];
			}
		}
		return result;
	}

	public T getMax() {
		if (length == 0) {
			printZero();
			return null;
		}
		T result = array[0];
		for (int i = 1; i < length; i++) {
			if (((Comparable<T>) array[i]).compareTo(result) > 0) {
				result = array[i];
			}
		}
		return result;
	}

	void printZero() {
		System.out.println("Массив пустой");
	}

	public T getSumm() {
		if (length == 0) {
			printZero();
			return null;
		}
		T result = null;
		if (array[0] instanceof Integer) {
			Integer summ = (Integer) array[0];
			for (int i = 1; i < length; i++) {
				summ = summ + (Integer) array[i];
			}
			result = (T) summ;
		}
		if (array[0] instanceof Double) {
			Double summ = (Double) array[0];
			for (int i = 1; i < length; i++) {
				summ = summ + (Double) array[i];
			}
			result = (T) summ;
		}
		if (array[0] instanceof String) {
			System.out.println("Это строки, их нельзя сложить");
		}
		return result;
	}

	public T getMultipli() {
		if (length == 0) {
			printZero();
			return null;
		}
		T result = null;
		if (array[0] instanceof Integer) {
			Integer summ = (Integer) array[0];
			for (int i = 1; i < length; i++) {
				summ = summ * (Integer) array[i];
			}
			result = (T) summ;
		}
		if (array[0] instanceof Double) {
			Double summ = (Double) array[0];
			for (int i = 1; i < length; i++) {
				summ = summ * (Double) array[i];
			}
			result = (T) summ;
		}
		if (array[0] instanceof String) {
			System.out.println("Это строки, их нельзя умножить");
		}
		return result;
	}

	public int findIndxItem(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(val)) {
				return i;
			}
		}
		return -1;
	}

	public boolean findItem(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(val)) {
				return true;
			}
		}
		return false;
	}

	public T getElement(int index) {
		if (index < 0 || index >= length) {
			System.out.println("Индекс вне диапазона значений");
			return null;
		} else {
			return array[index];
		}
	}

	public void setElement(int index, T item) {
		if (index < 0 || index >= this.length) {
			System.out.println("Индекс вне диапазона значений");
		} else {
			this.array[index] = item;
		}
	}

	public void print() {
		if (length != 0) {
			for (int i = 0; i < length; i++) {
				if (i == length - 1) {
					System.out.println(array[i]);
				} else
					System.out.print(array[i] + ",");
			}
		} else {
			System.out.println("Массив пустой");
		}
	}

	/**
	 * Сортировка пузырьком
	 */
	public void bubbleSort() {
		if (array[0] instanceof String) {
			return;
		}
		if (array[0] instanceof Integer) {
			for (int i = 0; i < length - 1; i++) {
				for (int j = 0; j < length - i - 1; j++) {
					if ((Integer) array[j] > (Integer) array[j + 1]) {
						T temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}

		if (array[0] instanceof Double) {
			for (int i = 0; i < length - 1; i++) {
				for (int j = 0; j < length - i - 1; j++) {
					if ((Double) array[j] > (Double) array[j + 1]) {
						T temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}

	}

	/**
	 * Сортировка вставками
	 */
	public void insertionSort() {
		if (array[0] instanceof String) {
			return;
		}
		if (array[0] instanceof Integer) {
			for (int i = 1; i < length; i++) {
				T key = array[i];
				int j = i - 1;
				while (j >= 0 && (Integer) array[j] > (Integer) key) {
					array[j + 1] = array[j];
					j--;
				}
				array[j + 1] = key;
			}
		}

		if (array[0] instanceof Double) {
			for (int i = 1; i < length; i++) {
				T key = array[i];
				int j = i - 1;
				while (j >= 0 && (Double) array[j] > (Double) key) {
					array[j + 1] = array[j];
					j--;
				}
				array[j + 1] = key;
			}
		}

	}

	/**
	 * Сортировка выбором
	 */
	public void selectionSort() {
		if (array[0] instanceof String) {
			return;
		}
		if (array[0] instanceof Integer) {
			for (int i = 0; i < length - 1; i++) {
				int minIndex = i;
				for (int j = i + 1; j < length; j++) {
					if ((Integer) array[j] < (Integer) array[minIndex]) {
						minIndex = j;
					}
				}
				T temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}

		if (array[0] instanceof Double) {
			for (int i = 0; i < length - 1; i++) {
				int minIndex = i;
				for (int j = i + 1; j < length; j++) {
					if ((Double) array[j] < (Double) array[minIndex]) {
						minIndex = j;
					}
				}
				T temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}

	}

	public int getLength() {
		return length;
	}
}