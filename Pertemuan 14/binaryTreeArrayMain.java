class binaryTreeArray{
    int[]data;
    int idxLast;

    public binaryTreeArray(){

        data= new int [10];
    }
    void populateData(int data[], int idxLast){
        this.data=data;
        this.idxLast=idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void add(int key){
        idxLast++;
        data[idxLast]=key;
    }
    void traversePreOrder(int idxStart){
        if(idxStart<=idxLast){
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
        }

    }
    void traversePostOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }

    }
}

public class binaryTreeArrayMain {
    public static void main(String[] args) {
        binaryTreeArray bnta = new binaryTreeArray();
        int[] data ={6,4,8,3,5,7,9,0,0,0};
        int idxLast=6;
        bnta.populateData(data, idxLast);
        System.out.println("INORDER");
        bnta.traverseInOrder(0);
        System.out.println("");

        //Tugas No5
        System.out.println("Tugas No 5");
        bnta.add(10);
        bnta.add(15);
        bnta.add(11);
        System.out.println("INORDER");
        bnta.traverseInOrder(0);
        System.out.println("");

        System.out.println("PREORDER");
        bnta.traversePreOrder(0);
        System.out.println("");

        System.out.println("POSTORDER");
        bnta.traversePostOrder(0);
    }
}