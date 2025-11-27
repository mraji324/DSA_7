class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class listoffunction{
     static node head;
     public static void insertion(int data,int index){
        node newnode=newnode(data);
        if(index==0){
            add(data);
            return;
        }
        node temp=head;
        for(int i=0;temp!=null&&i<index-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("out of bound");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;          
     }
     public static int count(){
        int count=0;
        node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
     }
     public static void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print("null");
     }
     public static void add(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
     }
     public static void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
             return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newnode;
    }
    public static void reverse(){
        node prev=null;
        node current=head;
        node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public static boolean search(int key){
        node temp=head;
        while(temp!=null){
            if(temp.data==key){
               return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void delete(int index){
        if(head==null){
            System.out.println("no data");
            return;
        }
        if(index==0){
            head=head.next;
        return;
        }
        node temp=head;
        for(int i=0;temp!=null&&i<index-1;i++){
            temp=temp.next;
        }
        if(temp==null||temp=temp.next){
            System.out.println("out of range");
           return;
        }
        temp.next=temp.next.next;

    }
    public static void databyvalue(int value){
        if(head==null){
            system.out.println("no data");
        }if(head.data==value){
            head=head.next;
            return;
        }
        node temp=head;
            while(temp.next!=null&&temp.next.data!=value){
                temp=temp.next;
            }
            if(temp.next==null){
                System.out.println("not found");
                return;

            }
            temp.next=temp.next.next;
        }

    } 
public class pro2 {
        public static void main(String[] args){
            listoffunction listoffunctions=new listoffunction();
         listoffunctions.add(10);//data for nodes
        listoffunctions.add(20);
        listoffunctions.add(30);
        listoffunctions.add(40);
        listoffunctions.display();
        listoffunctions.insert(50);
        listoffunctions.count();
        listoffunctions.reverse();
        listoffunctions.display();
        listoffunctions.search(30);
        listoffunctions.insertion(20,2);
        System.out.println("count"+listoffunctions.count( ));
        listoffunctions.display();
        System.out.println("reversed list"+listoffunctions.reverse( ));
        listoffunctions.display();
        System.out.println("searching element"+listoffunctions.search(20));
        listoffunctions.display();
        System.out.println("insertion data"+listoffunctions.insertion(30,3));
        listoffunctions.display();
        System.out.println("deleted"+listoffunctions.delete(2));
        listoffunctions.display();
        System.out.println("databyvalue"+listoffunctions.databyvalue(20));
        listoffunctions.display();
    }
}
