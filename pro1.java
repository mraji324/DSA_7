
class Node{
    int data;
    Node next; 
    Node(int data){//Node()-constructor will have class name so Node()
        this.data=data;
        this.next=null;
    }
}
public class pro1{
    public static void main(String[] args) {
        Node node1=new Node(10);//data for nodes
        Node node2=new Node(20);
        Node node3=new Node(30);
        Node node4=new Node(40);
        node1.next=node2; //to link to next node
        node2.next=node3;
        node3.next=node4;

        Node head=node1;//create variable

        while(head !=null){ //to print data we use loop
            System.out.print(head.data+"->");
            head= head.next;//we need to update head
        }
        System.out.print("null");//last print
    }
}