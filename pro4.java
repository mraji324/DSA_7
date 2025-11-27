class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ListOfFunctions{
    //another function
    static Node head;
    //global variable head
    public static void indexInsert(int data,int index){ //insert a element at a particular index
        //insert a element at a particular index value
        Node newNode=new Node(data);
        if(index==0){
            addfirst(data);
            return;
        }
        Node temp=head;
        for(int i=0;temp!=null && i<index-1;i++){
            temp=temp.next;//insert

        }
        if(temp==null){
            System.out.println("out of bounds.");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static int count(){ //count increment
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void display(){
        Node temp=head;        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addfirst(int data){ 
    //let us think linked list having values with 10,20,30,40 now 40 should swap with 10 how only still include that's all
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void insert(int data){//insert the data from begining or ending anywhere
        Node newNode=new Node(data);//to store data in new variable
        if(head==null){ //incase the head is not null
            head=newNode;
            return;//orhead=head.next-if not null then move to the next
        }
        Node temp=head;
        //already in head there will be data again if we insert error will come so we given a temp variable
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public static void reverse() {//reverse list
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {//
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
         head = previous;
    }
    public static boolean search(int key){//search a node
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void deleteIndex(int index){
        if(head == null){
            System.out.println("No data");
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node temp=head;
        for(int i=0;temp!=null && i<index-1;i++){
            temp = temp.next;
        }
        if(temp == null || temp == temp.next){
            System.out.println("out of the range");
            return;
            
        }
        temp.next=temp.next.next;
    }
    public static void deleteByValue(int value){
        if(head == null){
            System.out.println("No data.");
        }
        if(head.data == value)
        {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data != value){
            temp=temp.next;
        }
        if(temp.next == null){
            System.out.println("Not found!");
            return;
        }
         temp.next = temp.next.next;
    }
}
public class pro4{
    public static void main(String[] args) {
        ListOfFunctions lf=new ListOfFunctions();
        lf.addfirst(10);
        lf.addfirst(20);
        lf.addfirst(30);
        lf.addfirst(40);
        lf.display();
        System.out.println("count:"+lf.count( ));
        lf.reverse();   // reverse the list
        System.out.println("Reversed List: ");
        lf.display();   // print the reversed list  
        System.out.println(lf.search(20));
        lf.indexInsert(22, 2);
        lf.display();
        lf.deleteIndex(2);
        lf.display();
        lf.deleteByValue(30);
        lf.display();
    }  
}
