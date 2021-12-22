
package com.mycompany.dec_20_stack_n_queue;


public class MyLinkedList {
    public INode head;
    public INode tail;
    
    // Push an element into stack, Makes the added element as the head
    public void addElement(INode adNode){
        if (this.head==null){
            this.head = adNode;
        }if (this.tail==null){
            this.tail = adNode;
        }else {
           INode pres_node = this.head;
           this.head = adNode;
           this.head.setNext(pres_node);
        }
    }
    
    //Peek into the stack
    public boolean peekInto(){
        boolean stack_not_empty = false;
        if (this.head != null){
            stack_not_empty = true;
        }
      return stack_not_empty;      
    }
    
    // Pop an element from the stack
    public INode popElement(){
        INode tempNode;
        if (this.head == null){
            tempNode = null;
            System.out.println("It is empty!");
        }else{
            tempNode = this.head;
            this.head = this.head.getNext();
        }
      return tempNode;      
    }
    
    // To print the nodes of the linked list
    public void printNodes(){
        INode pres_node = this.head;
        if (pres_node == null){
            System.out.println("It is empty!");
        }else {
            StringBuffer toPrint = new StringBuffer("The Nodes are: ");
            while (pres_node.getNext() != null){
                toPrint.append(pres_node.getKey());
                if (!pres_node.equals(tail)) {
                    toPrint.append("->");
                }
                pres_node = pres_node.getNext();
            }
            toPrint.append(pres_node.getKey());
            System.out.println(toPrint);
        }
    }
}
