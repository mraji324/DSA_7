class Node{
    private Node top;//create variable-global variable
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackMethods{
    static Node top;
    public void push(int data){//push function
        Node newNode = new Node(data); //new node created
        newNode.next=top;
        top = newNode;//top node-new
    }
    public static void  pop(){//pop function
       if(top == null){
        System.out.println("no data");
        return;
       }
       System.out.println(top.data);
       top=top.next;
    }
    public static void peek(){ //top value
        if(top == null){
            System.out.println("No data");
            return ;
        }else{
            System.out.println(top.data);
    }
    }
    public static void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class pro3{
    public static void main(String[] args) {
        StackMethods sm=new StackMethods();
        sm.push(30);
        sm.push(10);
        sm.push(20);
        sm.display();
        sm.pop();
        sm.display();
        sm.peek();
        sm.display();
    }
}