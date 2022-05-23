import java.util.Scanner;
class Node {
    int noAntrian;
    String nama;
    Node prev, next;
    
    Node(Node prev, int noAntrian, String nama, Node next){
        this.prev=prev;
        this.noAntrian=noAntrian;
        this.nama=nama;
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

    void addFirst(int noAntrian, String nama){
        if(isEmpty()){
           head=new Node(null,noAntrian, nama,null);
        }else{
           Node newNode=new Node(null,noAntrian, nama, head);
           head.prev=newNode;
           head=newNode;
        }
        size ++;
    }

    void addLast(int noAntrian, String nama){
        if(isEmpty()){
           addFirst(noAntrian, nama);
        }else{
            Node current=head;
            while(current.next!=null){
            current=current.next;
        }
            Node newNode=new Node(current,noAntrian, nama ,null);
            current.next=newNode;
            size ++;
        }
    }

    void add(int noAntrian, String nama, int index)throws Exception{
        if(isEmpty()){
            addFirst(noAntrian, nama);
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
            Node newNode=new Node(null, noAntrian, nama, current);
            current.prev=newNode;
            head = newNode;
        }else{
            Node newNode=new Node(current.prev, noAntrian, nama, current);
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

           System.out.println("|No Antrian|Nama\t|");
           while(tmp!=null){
               System.out.println("|    " + tmp.noAntrian+"     |" + tmp.nama + "\t|");
               tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian : " + size);
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
            System.out.println(head.nama + " telah selesai di vaksinasi");
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
  
}



public class vaksinasiMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int noFitur, antrian;
        String nama; 
        
        for(;;){
            tampilMenu();
            noFitur = sc.nextInt();

            if(noFitur==01){
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.println("Nomor Antrian: ");
                antrian = sc.nextInt();
                System.out.println("Nama Antrian: ");
                nama = sc.next();
                dll.addLast(antrian, nama);
            } else if(noFitur==02){
                dll.removeFirst();
            } else if(noFitur==03){
                System.out.println("-----------------------------");
                System.out.println("Daftar Pengantri Vaksin");
                System.out.println("-----------------------------");
                dll.print();
            } else if(noFitur==04){
                break;
            } else{
                System.out.println("Nomor yang diinput tidak valid");
            }
        }
    }

    
    
    static void tampilMenu(){
        System.out.println("=============================================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("=============================================");
        System.out.println("\n(01) Tambah Data Penerima Vaksin\n(02) Hapus Data Pengantri Vaksin\n(03) Daftar Penerima Vaksin\n(04) Keluar");
        System.out.println("\n===========================================");
        
        

    }
} 
