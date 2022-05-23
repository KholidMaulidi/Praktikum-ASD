class Node {
    int data;
    Node prev, next;
    
    Node(Node prev, int data, Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}

class DoubleLinkedList {
    Node head;
    int size;
         
    DoubleLinkedList(){
        head= null;
        size = 0;
    }

    boolean isEmpty(){
        return head == null;   
    }

    void addFirst(int item){
        if(isEmpty()){
           head=new Node(null,item,null);
        }else{
           Node newNode=new Node(null,item,head);
           head.prev=newNode;
           head=newNode;
        }
        size ++;
    }

    void addLast(int item){
        if(isEmpty()){
           addFirst(item);
        }else{
            Node current=head;
            while(current.next!=null){
            current=current.next;
        }
            Node newNode=new Node(current,item,null);
            current.next=newNode;
            size ++;
        }
    }

    void add(int item,int index)throws Exception{
        if(isEmpty()){
            addFirst(item);
        }else if(index<0|| index>size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Node current=head;
            int i=0;
            while(i<index){
            current = current.next;
            i++;
        }
        if(current.prev == null){
            Node newNode=new Node(null,item,current);
            current.prev=newNode;
            head = newNode;
        }else{
            Node newNode=new Node(current.prev,item,current);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev=newNode;
        }
        size ++;
        }
    }

    int size(){
        return size;
    }

    void clear(){
        head = null;
        size = 0;
    }

    void print(){
        if(!isEmpty()){
           Node tmp = head;
           while(tmp!=null){
               System.out.print(tmp.data+"\t");
               tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked Lists Kosong");
        }
    }

    void removeFirst()throws Exception{
        if(isEmpty()){
           throw new Exception("Linked List masih kosong,tidak dapat dihapus!");
        }else if(size ==1){
           removeLast();
        }else{
           head = head.next;
           head.prev   =null;
           size--;
        }
    }
    
    void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong,tidak dapat dihapus!");
        }else if(head.next == null){
            head=null;
            size--;
            return;
        }
        Node current=head;
        while(current.next.next!=null){
        current = current.next;
        }
        current.next=null;
        size--;
    }

    void remove(int index)throws Exception{
        if(isEmpty()|| index>=size){
            throw new Exception("Nilai indeks di luar batas");
        }else if(index ==0){
            removeFirst();
        }else{
            Node current=head;
            int i=0;
            while(i<index){
            current=current.next;
            i++;
        }
        if(current.next == null){
            current.prev.next=null;
        }else if(current.prev == null){
            current = current.next;
            current.prev=null;
            head = current;
        }else{
            current.prev.next = current.next;
            current.next.prev=current.prev;
        }
        size--;
        }
    }

    int getFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    int getLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    
    int get(int index)throws Exception{
        if(isEmpty()|| index>=size){
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for(int i=0;i<=index;i++){
            tmp=tmp.next;
            if(tmp.next==index){

            }
        }
        return tmp.data;
    }  
}

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
         dll.addLast(5);
          dll.addLast(9);
        dll.print();
        System.out.println("Size :"+ dll.size);
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        dll.add(40,1);
        dll.print();
        Node start = null;
        start = bubbleSort(start);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        System.out.println("Data Awal pada Linked List adalah "+ dll.getFirst());
        System.out.println("Data Akhir pada Linked List adalah " + dll.getLast());
        System.out.println("Data Indeks ke-1 pada Linked Lists adalah " +dll.get(1));
    }
} 

