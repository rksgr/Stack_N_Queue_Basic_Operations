
package com.mycompany.dec_20_stack_n_queue;


public class StacknQueueBasic {
    /*
    Use case 1: create a stack by pushing some elements
    */
    public static MyLinkedList pushToStack(MyLinkedList myLinkedList,Integer ...args){
        // create node and add them to the linked list
        for (int num:args){
          Node<Integer> myNode1 = new Node<>(num); 
          myLinkedList.addElement(myNode1);
        }   
        myLinkedList.printNodes();
        return myLinkedList;
    }
    public static void main(String []args){
        MyLinkedList myLinkedList = new MyLinkedList();
        pushToStack(myLinkedList,70,30,56);
    }
}
