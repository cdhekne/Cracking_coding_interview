/**
 * 
 */
package linked_list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cdhekne
 *
 */
public class LinkedList_MiscOperations {

	Node head;
	int lengthOfList;

	public LinkedList_MiscOperations(){
		head = null;
		lengthOfList=0;
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
		lengthOfList++;
	}


	public void findNthToLastElement(int nValue){
		Node prev = null;
		Node current = head;
		int indexValue = nValue-1;
		int counter = 0;
		boolean indexFlag = false;
		if(head==null)
			System.out.println("List is empty");
		else{
//			if(indexValue!=0){ 	
				while(counter<indexValue){
					prev = current;
					current = current.next;
					counter++;
				}
				while(current.next!=null){
					System.out.print(current.data+ "-->");
					current = current.next;
				}
				System.out.println(current.data + "--> Nil");
//			}
		}
	}

	public void printList() {
		Node current = head;
		if(head==null)
			System.out.println("List is empty");
		else{
			while(current.next!=null){
				System.out.print(current.data + "-->");
				current = current.next;
			}
			System.out.println(current.data + "---> Nil");
		}

	}

	public static void main(String[] args) {
		LinkedList_MiscOperations miscOperations = new LinkedList_MiscOperations();
		List<Integer> addedValues = new ArrayList<Integer>();
		for(int i = 0;i< 10;i++){
			miscOperations.addToList(i*5);
			addedValues.add(i*5);
		}
		miscOperations.printList();
		miscOperations.findNthToLastElement(addedValues.size()-1);
	}

	class Node{
		Node next;
		int data;

		public Node(int data){
			this.data = data;
			next=null;
		}
	}



}
