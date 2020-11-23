// Task : Queue Implementation Using Linked List

package linkedlistqueue;

public class LinkedListQueue 
{      
    Node front;
    Node rear;
    
    class Node
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }
    
    // EnQueue() Function
    public void enQueue (int data)
    {
        Node q = new Node(data);
                
        if (front == null) 
        {
            front = rear = q;
            return;
        }
                
        rear.next = q;
        rear = q;    
    }
        
    // DeQueue() Function 
    public void deQueue ()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty!");
            return;
        }
        
        front = front.next;
        
        if (front == null)
        {
            rear = null;
        }
    }
    
    // isEmpty() Function
    public boolean isEmpty ()
    {
        return front == null;
    }
    
    // Display() Function
    public void display ()
    {
        Node temp = front;
        
        while (temp != null)
        {
            System.out.println("Data is : " +temp.data);
            temp = temp.next;
        }
        System.out.println("------------------");
    }
    
    public static void main(String[] args)
    {
        LinkedListQueue queue = new LinkedListQueue();
               
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.display();
                     
        queue.deQueue();
        queue.display();        
    }
}