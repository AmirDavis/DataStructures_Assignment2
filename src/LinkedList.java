/*
This class define a linked list that stores integer values.
*/

public class LinkedList
{
   public Node head, tail;

   //constructor method to create a list of object with head, tail, and size. 
   public LinkedList()
   {
      head = null;
      tail = null;
   }
  
   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }
  
   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
      Node newNode = new Node(data);
         if (head == null){
            head = newNode;
            tail = newNode;
         }
         else{
            //Node temp will point to head
            Node temp = head;
            //newNode will become new head of the list
            head = newNode;
            //Node temp(previous head) will be added after new head
            head.next = temp;
         }
   }
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
      int LinkedListSize = countNodes();
         if(index == 0){
            addFirstNode(data);
         }
         else if(index >= LinkedListSize){
            addLastNode(data);
         }
         else{
            Node current = head;
            Node temp = head.next;
            for(int i = 0; i < index; i++){
               current = current.next;
               temp = temp.next;
            }
         temp = current.next;
            current.next = new Node(data);
            (current.next).next = temp;

         }
   }
      
   //method #3: remove first node
   public void removeFirstNode()
   {
      if(head == null && tail == null){
         System.out.println("null");
      }
      else{
         Node temp = head;
         head = head.next;
      }

   }
      
   //method #4: remove last node
   public void removeLastNode()
   {
      int LinkedListSize = countNodes();
      if(head.equals(null) && tail.equals(null)){
         System.out.println("null");
      }
      else if(LinkedListSize == 1){
         Node temp = head;
         head = tail = null;
         LinkedListSize = 0;
      }
      else{
         Node current = head;
         while(current.next != null){
            current = current.next;
         }
         Node temp = tail;
         tail = current;
         tail.next = null;
      }

   }
    
   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
      int LinkedListSize = countNodes();
         if(index < 0 || index > LinkedListSize){
            System.out.println("Invalid index.");
         }
         else if(index == 0){
            removeFirstNode();
         }
         else if(index == LinkedListSize - 1){
            removeLastNode();
         }
         else{
            Node previous = head;
            for(int i = 0; i < index; i++){
               previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
         }
   }
          
   //method #6: countNodes
   public int countNodes()
   {
         int listSize= 0;
         Node current = head;
         while(current != null){
            listSize++;
            current = current.next;
         }
         return listSize;
         
   }
   
   //method #7: pritnInReverse  (Recursive method)
   public void printInReverse(Node L)
   {
      int LinkedListSize = countNodes();
         if(L.next == null){

         }
   }   

   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

