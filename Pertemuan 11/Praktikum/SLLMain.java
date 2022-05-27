package Praktikum;

class Node {
    //Praktikum
    int data;
    Node next;

    Node(int data, Node next){
            this.data = data;
            this.next = next;
    }
        //Tugas 1
        /*int data;
    Node next;

    public Node(int data, Node next){
            this.data = data;
            this.next = next;
    }*/
    
    //Tugas 2
    /*char data;
    Node next;
    
    public Node(char nilai, Node berikutnya){
        this.data = nilai;
        this.next = berikutnya;
     }*/

    //Tugas 3
    /*String data;
    Node next; 

    public Node(String data, Node berikutnya){
        this.data = data;
        this.next = berikutnya;
    }*/  
   
}

class SingleLinkedList {
    Node head; //posisi awal linked list
    Node tail; //posisi akhir linked list
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            //System.out.print("Isi Linked List : \t");
            System.out.print("Isi Stack : ");
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            //System.out.println("Linked list kosong");
            System.out.println("Stack Masih Kosong");
        }
    }
    
    public void addFirst(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){//jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    //Tugas 3
    /*public void peek(){
        if(!isEmpty()){
            Node tmp = head;
            while(tmp != null){
                if(tmp == head){
                    System.out.println("Isi Stack Teratas = " + tmp.data);
                }
                tmp = tmp.next;
            }
        }else{
            System.out.println("Stack Masih Kosong");
        }
    }*/
    
    //Tugas 3
    /*public void push(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }*/
    
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Masih Kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    //Tugas 2
    /*public void addFirst(char input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){//jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }*/
    
    public void addLast(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    //Tugas 2
    /*public void addLast(char input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }*/
    
    public void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail=ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    
    //Tugas2
    /*public void insertAfter(char key, char input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail=ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }*/

    
    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }
    
    //Tugas2
    /*public void insertAt(int index, char input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }*/
    
    //Modifikasi Elemen pada Single Linked List
    public int getData(int index){
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1;
        }else{
            return index;
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    
    //untuk menghapus data pada bagian belakang
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Liked List masih kosong, tidak dapat dihapus!");
        }else{
            Node temp = head;
            while(temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
    
    //Tugas 1
    /*public void insertBefore(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                this.addFirst(input);
                break;
            }else if(temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }*/
    
    //Tugas2
    /*public void insertBefore(int key, char input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                this.addFirst(input);
                break;
            }else if(temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }*/
}

public class SLLMain {
    public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();
        //Tugas3
        /*singLL.push("Bahasa");
        singLL.print();
        singLL.push("Android");
        singLL.print();
        singLL.push("Komputer");
        singLL.print();
        singLL.push("Basis Data");
        singLL.print();
        singLL.push("Matematika");
        singLL.print();
        singLL.push("Algoritma");
        singLL.print();
        singLL.push("Statistika");
        singLL.print();
        singLL.push("Multimedia");
        singLL.print();
        System.out.println();
        singLL.peek();*/
        
        
        //Tugas 2
        /*singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.insertAfter('a', 'b');
        singLL.print();
        singLL.insertAt(2, 'c');
        singLL.print();
        singLL.insertAfter('c', 'd');
        singLL.print();*/
        
        //Praktikum
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
        
        //Tugas 1
        /*singLL.insertBefore(700, 500);
        singLL.print();*/
        
        //modifikasi Linked list
        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(760));
        
        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
