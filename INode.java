
package com.mycompany.dec_20_stack_n_queue;


public interface INode <K> {
    K getKey();
    void setKey(K key);
    
    INode getNext();
    void setNext(INode next);
    
   
}
