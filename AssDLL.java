
package assdll;

public class AssDLL {

    Node head;

  
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        data=d;prev=null;next=null;}
}
class SingleLinkedList{
    Node head;
        private int newdata;
    
    public void push(int newdata){
        Node NewNode=new Node(newdata);
       NewNode.next=head;
       NewNode.prev=null;
        if(head !=null)
            head.prev=NewNode;
        head=NewNode;}
    public void InsertAfter(Node prev_Node,int new_data){
        if(prev_Node==null){
            System.out.println("The given previous nod cannot be NULL");
            return; }
        Node new_node=new Node(new_data);
        new_node.next=prev_Node.next;
        prev_Node.next=new_node;
        new_node.prev=prev_Node;
        if(new_node.next !=null)
            new_node.next.prev=new_node;
    }
    void append(int new_data){
        Node NewNode=new Node(new_data);
        Node last =head;
        NewNode.next=null;
        if(head==null){
            NewNode.prev=null;
            head=NewNode;}
        return;}
    while(last.next !=null) 
    last=last.next;
    last.
   void insertBefore(Node next_node,int newdata){
       if(next_node==null){
           printf("The given node cannot be NULL");
           return;}
       
      Node NewNode=new Node(newdata);
      NewNode.data=newdata;
      NewNode.prev=next_node.prev;
      next_node.prev=NewNode;
      NewNode.next=next_node;
      
      if(NewNode.prev !=null)
          NewNode.prev.next=NewNode;
      else
          head=NewNode;
   }
   void deleteNodeFirst(){
       Object del=null;
       if(head==null||del==null){
           if(head !=del){
               head=head.next;
           }
       }
   }
   void deleteNodeLast(){
       Node last=head;
       Node pv=head;
       while(last.next !=null){
           pv=last;
           last=last.next;
       }
       pv.next=pv.next.next;
   }
   public void printlist(Node node){
       Node last=head;
       while(last !=null){
           System.out.println(last.data+" ");
           last=last.next;
       }
       System.out.println();
   }

        private void printf(String the_given_next_node_connot_be_NULL) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
}
public class DSLAP2{
    
public static void main(String[]args){
AssDLL dll=new AssDLL();
dll.append(6);
dll.append(5);
dll.append(44);
System.out.println("Created DLL is:");
dll.printlist(dll.head);
dll.deleteNodeLast();
System.out.print("List after Deleting frist and last node:");
dll.printlist(dll.head);



 }   

    }
}
    

