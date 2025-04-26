package com.userdefined.linked;

import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleyLinkedList1<T> {
	
	public static class Node<T>{
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	}
	private Node<T> head;
	//Add to end
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node<T> curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	//Add to Begining
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = head;
		head = newNode;
	}
	public void remove(T data) {
		if(head==null)return;
		if(head.data.equals(data)) {
			head = head.next;	
			return;
		}
		Node<T> current = head;
		while(current.next != null &&  !current.next.data.equals(data)) {
			current =  current.next;
		}
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
	
	@Override
	public String toString() {
		if(head.data==null)return "[]";
		Node<T> current = head;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(current!=null) {
			sb.append(current.data+", ");
			current = current.next;
		}
		int lastIndexOf = sb.toString().lastIndexOf(", ");
		sb.delete(lastIndexOf, lastIndexOf+2);
		sb.append("]");
		return sb.toString();
	}
	public static void main(String[]arg) {
		//Userdefined
		SingleyLinkedList1<Integer> list = new SingleyLinkedList1<Integer>();
		list.add(5);
		System.err.println(list);
		//Predefined
		LinkedList<Integer> ls = new LinkedList<Integer>();
		/*ExecutorService executor = Executors.newFixedThreadPool(3);
		long userStart = 0;
		Future<?> submit1 = executor.submit(()->{
			long userStart1=System.currentTimeMillis();
			System.out.println(userStart1);
			for(int i=1;i<=100000;i++) {
				list.add(i);
			}
			long userEnd1 = System.currentTimeMillis();
			System.out.println();
			System.out.println("Userdefined Time take for insertion"+(userEnd1-userEnd1));
		});
		try {
			submit1.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Future<?> submit2 = executor.submit(()->{
			long userStart1=System.currentTimeMillis();
			System.out.println(userStart1);
			for(long i=1;i<=100000;i++) {
				ls.addFirst((int)i);
			}
			
			long userEnd1 = System.currentTimeMillis();
			long result = userEnd1-userEnd1;
			System.out.println("Predefined Time take for insertion::"+result);
			System.out.println();
		});
		try {
			submit2.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ls);
		
		
		
		executor.shutdown();*/
		
	}

	
}
