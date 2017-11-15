package GeneralPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class AddTwoLinkedList {
	
	public static LinkedList<Integer> list1= new LinkedList<>();
	public static LinkedList<Integer> list2= new LinkedList<>();
	public static LinkedList<Integer> sumList	= new LinkedList<>();
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
			list1.add(i);
		for(int i=0;i<7;i++)
			list2.add(i);
		Iterator itr1= list1.iterator();
		Iterator itr2= list2.iterator();
		while(itr1.hasNext() && itr2.hasNext()){
			int sum= (int) itr1.next() +(int) itr2.next();
			System.out.println(sum);
			sumList.add(sum);
		}
		if(itr1.hasNext()){
			while(itr1.hasNext()){
				sumList.add((int)itr1.next());
			}
		}
		if(itr2.hasNext()){
			while(itr2.hasNext()){
				sumList.add((int)itr2.next());
			}
		}
		for(int i:sumList){
			System.out.print(i+" ");
		}
		
		
		
	}

}
