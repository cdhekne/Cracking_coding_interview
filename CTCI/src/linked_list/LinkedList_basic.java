package linked_list;

import java.util.HashMap;
import java.util.Stack;

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
		//		linkedList_basic.printNthToLastElement(2);
		linkedList_basic.findNthToLastElement(2);



		LinkedList_basic linkedList_basic1 = new LinkedList_basic();
		LinkedList_basic linkedList_basic2 = new LinkedList_basic();
		linkedList_basic1.addToEndOfList(2);
		linkedList_basic1.addToEndOfList(0);
		linkedList_basic1.addToEndOfList(0);
		linkedList_basic1.addToEndOfList(4);
		linkedList_basic2.addToEndOfList(9);
		linkedList_basic2.addToEndOfList(9);

		linkedList_basic.addTwoNumbers(linkedList_basic1.head,linkedList_basic2.head);
	}



	private void addTwoNumbers(Node linkedHead1, Node linkedHead2) {
		Node currLinked1=linkedHead1;
		Node currLinked2=linkedHead2;

		LinkedList_basic linkedBasic3 = new LinkedList_basic();
		Node currLinked3=linkedBasic3.head;

		if(currLinked1==null || currLinked2==null)
			System.out.println("Cant add null linked lists");
		else{
			Stack<Integer> Linked1Stack = new Stack<Integer>();
			Stack<Integer> Linked2Stack = new Stack<Integer>();
			Stack<Integer> Linked3Stack = new Stack<Integer>();
			while(currLinked1!=null){
				Linked1Stack.push(currLinked1.data);
				currLinked1 = currLinked1.next;
			}
			while(currLinked2!=null){
				Linked2Stack.push(currLinked2.data);
				currLinked2 = currLinked2.next;
			}
			int carryItem = 0;
			while(!Linked1Stack.isEmpty() || !Linked2Stack.isEmpty()){
				int num1=0;
				int num2 =0;
				if(!Linked1Stack.isEmpty())
					num1= Linked1Stack.pop();
				
				if(!Linked2Stack.isEmpty())
					num2= Linked2Stack.pop();
				int ans = num1+num2;
				if(carryItem<=0 && ans>=10){
					carryItem = ans/10;
					ans = ans%10;
				}
				else{
					ans = ans + carryItem;
				}
				/*Node temp = new Node(ans);
				currLinked3 = temp;
				currLinked3 = currLinked3.next;
				temp = linkedBasic3.head;*/
				Linked3Stack.push(ans);

			}
			
			while(!Linked3Stack.isEmpty())
				System.out.print(Linked3Stack.pop());
		}
		




	}



	private void findNthToLastElement(int i) {
		Node currentNode = head;
		Node runnerNode = head;
		int counter=0;

		if(currentNode==null)
			System.out.println("link list emppty !");
		else{
			while(counter<i){
				runnerNode = runnerNode.next;
				counter++;
			}
		}
		while(runnerNode!=null){
			currentNode= currentNode.next;
			runnerNode = runnerNode.next;
		}
		System.out.println(currentNode.data);

	}

	private void printNthToLastElement(int index) {
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