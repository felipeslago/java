package jse21.DominatingCollections;

import java.util.List;

public class UnmodifiableListMethod {

	public static void main(String[] args) {
		
		Person p1 = new Person("John", 20);
		Friend f1 = new Friend("Carl");
		
		// The getFriends method returns a list of Friend objects
		// From this list is possible to add new Friend objects that will reflect in the Person object because it has the same memory reference
		// These two add method below do the same thing but done in different ways
		
		List<Friend> friends = p1.getFriends();
		
		friends.add(f1);
		p1.getFriends().add(f1);
		
		// But just the Person class must have access to modify the Friend list
		// It is possible to program in a defensive way to avoid this kind of code
		// By using the Collections.unmodifiableList method, when returning the list, it is possible to return a copy of this object that is read-only
		// Check the method getFriendsUnmodifiable in the Person class
		
		List<Friend> friendsNew = p1.getFriendsUnmodifiable();
		friendsNew.add(f1); // It will throw an exception
		
		p1.getFriendsUnmodifiable().add(f1); // It will throw an exception
	}
	
}
