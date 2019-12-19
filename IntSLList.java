// IntSLList.java
  
// singly linked list class to store integers 
public class IntSLList {  
    protected IntSLLNode head, tail;  
    public IntSLList() {
    	head = tail = null;     
    	}  
    public boolean isEmpty() {
    	return head == null;     
    	}  
    public void addToHead(int el) {
    	head = new IntSLLNode(el, head);
    	if (tail == null) {
    		tail = head;         
    		}     
    	}  
    public int deleteFromHead() { // delete the head and return its info;  
    	int el = head.info;   
    	if (head == tail) // if only one node on the list;        
    		{             head = tail = null;        
    		} else 
    		{ 
    			head = head.next;         
    			} 
  
        return el;     
        }  
    public void printAll() {
    	for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next) {
    		System.out.print(tmp.info + " ");  
    		}  
    	} 
    }  