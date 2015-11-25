package linked_list;

import java.util.ArrayList;
import java.util.List;


public class LinkedList_deleteOperations{

	Node head;

	public LinkedList_deleteOperations(){
		head = null;
	}

	public String deleteByIndex(int indexValue){
		Node prev = null;
		Node current =head;
		int listIndexIterator = 0;
		if(head==null)
			return "List empty";
		else{
			while(listIndexIterator < indexValue){
				if(current.next == null)
					return "Index out of bounds";
				else{
					prev = current;
					current = current.next;
					listIndexIterator++;
				}
			}
			if(prev==null){
				current = current.next;
				head = current;
			}
			else{
				prev.next = current.next;
			}
			return "Value at index " + indexValue + " deleted successfully"; 


		}
	}

	public String deleteOperation(int valueToDelete){
		Node current = head;
		Node prev = null;
		if(head==null){
			return "List is empty";
		}
		else{
			while(current.data!=valueToDelete){
				prev = current;
				current = current.next;
				if(current.next==null && current.data!=valueToDelete){
					return "Value "+ valueToDelete +" Not Found";
				}
			}
			if(prev==null){
				current = current.next;
				head = current;
			}
			else{
				prev.next = current.next;
			}
			return valueToDelete + " deleted successfully";
		}
	}

	public void addToList(int newData){
		Node tempNode = new Node(newData);
		Node currentNode = head;
		if(head == null){
			head= tempNode;
			head.next=null;
		}
		else{
			while(currentNode.next!=null)
				currentNode = currentNode.next;
			currentNode.next = tempNode;
		}
	}

	public static void main(String[]args){
		LinkedList_deleteOperations deleteOperations = new LinkedList_deleteOperations();
		List<Integer> addedValues = new ArrayList<Integer>();
		for(int i = 0;i< 10;i++){
			deleteOperations.addToList(i*5);
			addedValues.add(i*5);
		}
		//		System.out.println(deleteOperations.deleteOperation(12));
		System.out.println(deleteOperations.deleteByIndex(addedValues.size()-1));
		//		addedValues.remove(addedValues.size()-3);
		deleteOperations.printList();

	}

	private void printList() {
		Node current = head;
		if(head==null)
			System.out.println("List is empty");
		else{
			while(current.next!=null){
				System.out.print(current.data + "-->");
				current = current.next;
			}
			System.out.print(current.data + "---> Nil");
		}

	}

	class Node{
		int data;
		Node next,previous;
		public Node(int data){
			this.data = data;
			next=null;
			previous = null;
		}
	}

}