// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;

public class myTest
{
   public static void main (String[] args)
   {
      int optionNumber = 0; //For user to input their option number
      int x; //variable to use for the Add methods
      int index; //used for methods that require an index
      LinkedList myList = new LinkedList(); //create a list object
      
      //print out the list content
      System.out.print("My test list values are:  ");
      myList.printList();
      System.out.println();

      Scanner optionNumberScanner = new Scanner(System.in);
      do{
         DisplayMainMenu();
         optionNumber = optionNumberScanner.nextInt();
         Scanner nodeAdder = new Scanner(System.in); //Read numbers to add to the linked list
         Scanner indexScanner = new Scanner(System.in);
         switch (optionNumber){
            case 1:
               System.out.print("Number to add: ");
               x = nodeAdder.nextInt();
               System.out.print("List before adding " + x + " is: ");
                  myList.printList();
               System.out.print("\nList after adding " + x + " is: ");
               myList.addFirstNode(x);
                  myList.printList();
                  break;
            case 2:
               System.out.print("Number to add: ");
               x = nodeAdder.nextInt();
               System.out.print("List before adding " + x + " is: ");
                  myList.printList();
               System.out.print("\nList after adding " + x + " is: ");
               myList.addLastNode(x);
                  myList.printList();
                  break;
            case 3:
               System.out.print("At what index would you like to add the node: ");
               index = indexScanner.nextInt();
               System.out.print("Number to add: ");
               x = nodeAdder.nextInt();
               System.out.print("List before adding " + x + " is: ");
                  myList.printList();
               System.out.print("\nList after adding " + x + " is: ");
               myList.addAtIndex(index, x);
                  myList.printList();
                  break;
            case 4:
               System.out.print("System before removing first node: ");
                  myList.printList();
               myList.removeFirstNode();
               System.out.print("\nSystem after removing first node: ");
                  myList.printList();
                  break;
            case 5:
               System.out.print("System before removing last node: ");
                  myList.printList();
               myList.removeLastNode();
               System.out.print("\nList after removing last node: ");
                  myList.printList();
               break;
            case 6:
               System.out.print("At what index would you like to remove: ");
               index = indexScanner.nextInt();
               System.out.print("The list before removing at index " + index + " is: ");
                  myList.printList();
               System.out.print("\nThe list after removing at index " + index + " is: ");
               myList.removeAtIndex(index);
                  myList.printList();
               break;
            case 7:
               System.out.print("Then number of nodes are: " + myList.countNodes());
               break;
            case 8:
               myList.printList();
               break;
            case 9:
               break;
            case 10:
               nodeAdder.close();
               break;
         }
      }while(optionNumber != 10);
      optionNumberScanner.close();
   }

   public static void DisplayMainMenu(){
      System.out.print("\n---------MAIN MENU--------" +
              "\n1 – Add First Node" +
              "\n2 – Add Last Node" +
              "\n3 – Add At Index" +
              "\n4 – Remove First Node" +
              "\n5 – Remove Last Node" +
              "\n6 – Remove At Index" +
              "\n7 – Print List Size" +
              "\n8 – Print List (Forward)" +
              "\n9 – Print List In Reverse" +
              "\n10- Exit program" +
              "\n\nEnter option number: ");
   }
}
    
