package jse17.DataStructure;

public class LinearList {

	// Data Structure is a particular way to store and organize data that can be used efficiently
	// It can be implemented in different ways, depending on the situation and need
	
	// A Linear List is a vector that stores values sequentially
	// This kind of structure, although simple, is not effective for some operations
	// Inserting a new element at the first position consumes too much time and increases with more elements
	
	// This example just demonstrates how the linear list concept works
	// Java provides classes that implements this kind of data structure
	
	int[] numbers;
	int first; // It contains the first element in the list
	int last; // It contains the last element in the list
	final int maxSize; // It contains the list maximum size
	
	LinearList(int size) {
		this.first = 0;
		this.last = 0;
		this.maxSize = size; // When a list is created it must be specified a value for the list size
		this.numbers = new int[this.maxSize];
	}
	
	void insert(int data) { // This function inserts data at the bottom of the list
		if(this.last <= this.maxSize) {
			this.numbers[this.last] = data;
			this.last = this.last + 1;
		} else {
			System.out.println("The list is full.");
		}
	}
	
	void insertAt(int position, int data) { // This function inserts an element by a given position
		
		position = position - 1;
		
		if(position < this.first || position > this.last) {
			System.out.println("The given position is invalid.");
		} else if(this.last > this.maxSize) {
			System.out.println("The list is full.");
		} else {
			for(int i = this.last; i >= position; i--) { // But inserting an element implies to move forward all elements from backward
				this.numbers[i] = this.numbers[i - 1]; // In other words, if an element is inserted at position 5, the element at this position will forward to position 6 and so on
			}
			this.numbers[position] = data;
			this.last = this.last + 1;
		}
		
	}
	
	void remove(int data) { // This function removes an element by its value
		for(int i = this.first; i < this.last; i++) { // The function must go through the list seeking the value
			if(this.numbers[i] == data) { // And when find it, removes the element
				for(int j = i; j < this.last; j++) { // But removing an element implies to move backwards all elements from forward
					this.numbers[j] = this.numbers[j + 1]; // In other words, if the element at position 5 was removed, the element at position 6 will backward to position 5 and so on
				}
				this.last = this.last + 1;
				return;
			}
		}
		System.out.println("The given number was not found.");
	}
	
	void removeAt(int position) {
		position = position - 1;
		
		if(position < this.first || position >= this.last) {
			System.out.println("The given position does not exists.");
		} else {
			for(int i = position; i < this.last - 1; i++) {
				this.numbers[i] = this.numbers[i + 1];
			}
			this.last = this.last - 1;
		}
	}
	
	void sortAscending() { // This function sorts the list in ascending order using the Bubble Sort algorithm
		for(int i = this.first; i < this.last; i++) {
			for(int j = this.first; j < this.last - 1; j++) {
				if(this.numbers[j] > this.numbers[j + 1]) {
					int aux = this.numbers[j];
					this.numbers[j] = this.numbers[j + 1];
					this.numbers[j + 1] = aux;
				}
			}
		}
	}
	
	void sortDescending() { // This function sorts the list in descending order using the Bubble Sort algorithm
		for(int i = this.first; i < this.last; i++) {
			for(int j = this.first; j < this.last - 1; j++) {
				if(this.numbers[j] < this.numbers[j + 1]) {
					int aux = this.numbers[j];
					this.numbers[j] = this.numbers[j + 1];
					this.numbers[j + 1] = aux;
				}
			}
		}
	}
	
	void clean() { // This function cleans the list by making the last position as the first
		this.last = this.first;
	}
	
	void print() { // This function prints all elements by the top of the list
		if(this.last == this.first) {
			System.out.println("The list is empty.");
			return;
		}
		
		for (int i = this.first; i < this.last; i++) {
			System.out.print(this.numbers[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		LinearList list = new LinearList(10);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert(10);
		
		list.print();
		
		list.insertAt(5, 5);
		
		list.insertAt(15, 5);
		
		list.print();
		
		list.removeAt(10);
		
		list.removeAt(15);
		
		list.print();
		
		list.remove(2);
		
		list.remove(20);
		
		list.print();
		
		list.clean();
		
		list.print();
		
		list.insert(6);
		list.insert(3);
		list.insert(2);
		list.insert(1);
		list.insert(5);
		list.insert(7);
		list.insert(9);
		list.insert(10);
		list.insert(8);
		list.insert(4);
		
		list.print();
		
		list.sortAscending();
		
		list.print();
		
		list.sortDescending();
		
		list.print();
	}
}
