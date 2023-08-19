package studyguide1;
import java.util.LinkedList;

public class ArrayToLinkedList implements MyLinkList{
	
   LinkedList<String> aToL;
   LinkedList<String> revLinkedList;

 public ArrayToLinkedList(){
  this.aToL = new LinkedList<>();
  this.revLinkedList = new LinkedList<>();
 }
 public void convert(String[] a){
  for(int i = 0; i < a.length; i++){
   this.aToL.add(a[i]);
   System.out.println("I have added the string: "+a[i]+" at the node: "+i);
  }
  }
 
 //==================
 
 public void displayList()
 {
	  System.out.println("Original Linked List Order");
	  for (int i = 0; i < aToL.size(); i++){
		  System.out.println(i +" element="+aToL.get(i)); 
	  }	 
	  
	  reverseLinkedList();
	  
	  System.out.println("Reversed Linked List Order");
	  for (int i = 0; i < revLinkedList.size(); i++){
		  System.out.println(i +" element="+revLinkedList.get(i)); 
	  }	 
 }
 
 public void reverseLinkedList()
 {
     
     for (int i = aToL.size() - 1; i >= 0; i--) {

         // Append the elements in reverse order
         revLinkedList.add(aToL.get(i));
     }
     return;
 }
 
 //===================

 public void replace(int idx){
	  System.out.println("I have replaced the string: "+aToL.get(idx)+ " with a null string");
	  aToL.set(idx, "");
 }

 public LinkedList<String> compact(){

	  LinkedList<String> res = new LinkedList<>();
	  for(int i = 0; i < aToL.size(); i++)
	   {
	       if(!aToL.get(i).equals(""))
	           res.add(aToL.get(i));
	   }
	   return res;
	 }

}