package linked_list;

import java.util.HashMap;

public class LinkedList_basic{
	
	Node head;
	
	public static void main(String []args){
		LinkedList_basic linkedList_basic = new LinkedList_basic();
		linkedList_basic.addToEndOfList(12);
		linkedList_basic.addToEndOfList(1);
		linkedList_basic.addToEndOfList(123);
		linkedList_basic.addToEndOfList(12);
		linkedList_basic.addToEndOfList(23);
		linkedList_basic.addToEndOfList(123);
//		linkedList_basic.printList();
//		linkedList_basic.removeDuplicates();
		linkedList_basic.findNthToLastElements(2);
		
		
	}

	private void findNthToLastElements(int index) {
		Node currentNode = head;
		int counter=0;
		if (currentNode==null){
			System.out.println("List is empty..");
		}
		else{
			while(counter<index && currentNode.next!=null){
				currentNode = currentNode.next;
				counter++;
			}
			while(currentNode.next!=null){
				System.out.print(currentNode.data+"-->");
				currentNode = currentNode.next;
			}
			System.out.println(currentNode.data+"-->NILL");
		}
	}

	private void removeDuplicates() {
		Node currentNode = head;
		Node previousNode = null;
		HashMap<Integer, Boolean> hashMapForData = new HashMap<Integer, Boolean>();
		
		if(currentNode==null){
			System.out.println("List is empty..No duplicates found");
		}
		else{
			while(currentNode!=null){
				if(!hashMapForData.containsKey(currentNode.data)){
					hashMapForData.put(currentNode.data, true);
					previousNode = currentNode;
				}
				else{
					previousNode.next = currentNode.next;
					
				}
				
				currentNode = currentNode.next;
			}
		}
		printList();
		
	}

	private void printList() {
		Node currentNode = head;
		if(head==null)
			System.out.println("List is empty");
		
		else{
			while(currentNode.next!=null){
				System.out.print(currentNode.data+"-->");
				currentNode = currentNode.next;
			}
			System.out.println(currentNode.data+"-->NILL");
		}
	}

	private void addToEndOfList(int data) {
		Node temp = new Node(data);
		Node currentNode = head;
		if(currentNode==null){
			head = temp;
			head.next = null;
		}
		else{
			while(currentNode.next!=null)
				currentNode = currentNode.next;
			currentNode.next = temp;
		}
	}

	protected class Node{
		
		Node next;
		int data;
		
		public Node(int data){
			this.data = data;
		}
	}
	
}