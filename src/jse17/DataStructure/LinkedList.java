package jse17.DataStructure;

public class LinkedList {

	// The Linked List is different from the Linear List
	// Instead of storing values sequentially, Linked Lists has an address for the next element
	// So elements can be stored separated just knowing the next element
	
	// This example just demonstrates how the linked list concept works
	// Java provides classes that implements this kind of data structure
	
	// For this example, lets assume that data == 0 is the same as data == null
	
	int data;
	LinkedList next;
	
	LinkedList() {
		this.next = null;
	}
	
	LinkedList(int data) {
		this.data = data;
		this.next = null;
	}
	
	void insert(int data) {
		if(data == 0) {
			this.data = data;
		} else  {
			this.next = new LinkedList(data);
		}
	}
	
	void insertAt(int position, int data) {
		int count = 1;
		LinkedList aux = this;
		LinkedList prev = null;
		
		while(aux != null) {
			if(count == position) {
				if(prev == null) {
					this.data = data;
				} else {
					LinkedList element = new LinkedList(data);
					prev.next = element;
					element.next = aux;
				}
				return;
			}
			prev = aux;
			aux = aux.next;
		}
	}
	
	void remove(int data) {
		LinkedList aux = this;
		LinkedList prev = null;
		
		while(aux != null) {
			if(aux.data == data) {
				if(prev != null) {
					prev.next = aux.next;
				} else {
					aux = null;
				}
				return;
			}
			prev = aux;
			aux = aux.next;
		}
	}
	
	void removeAt(int position, int data) {
		int count = 1;
		LinkedList aux = this;
		LinkedList prev = null;
		
		while(aux != null) {
			if(count == position) {
				if(prev == null) {
					aux.data = 0;
				} else {
					prev.next = aux.next;
				}
				return;
			}
			prev = aux;
			aux = aux.next;
		}
	}
	
	void clean() {
		this.data = 0;
		this.next = null;
	}
	
	void print() {
		LinkedList aux = this;
		
		if(aux.data == 0) {
			System.out.println("The list is empty.");
			return;
		}
		
		while(aux != null) {
			System.out.print(aux.data + " ");
			aux = aux.next;
		}
	}
	
}
