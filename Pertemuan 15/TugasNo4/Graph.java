package TugasNo4;

public class Graph {
    int vertex;
    DoubleLinkedList list[];

    Graph(int vertex){
        this.vertex=vertex; // nilai atribut vrtex sama kaya nilai parameter
        list= new DoubleLinkedList[vertex]; // list sizenya ngikutin prameter vertex
        for(int i =0; i<vertex; i++){
            list[i]=new DoubleLinkedList();// isi dari vertex
        }
    }

    void addEdge(int idx, int idx2, String source, String destination){//tambah edge harus definisikan dari vertex mana ke mana
        list[idx].addFirst(destination);

        list[idx2].addFirst(source);//sambungan : yg awal

    }

    void degree(int source) throws Exception{
        //undirected
        System.out.println("degree vertex " + source + " : " + list[source].size());

        //directed
        int k, totalIn=0, totalOut=0;
        for(int i=0; i<vertex; i++){//melihat semua vertex
            for (int j=0; j<list[i].size(); j++){//diulangan untuk degree vertex
                if(list[i].get(j).equalsIgnoreCase(String.valueOf(source))){//untuk semua size di vertex
                    //4==4
                    ++totalIn;
                }

            }
            //out
            for(k=0; k<list[source].size(); k++){
                list[source].get(k);//mana yang terhubung
            }
            totalOut=k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }
    void removeEdge(int source, String  destination) throws Exception{
        for(int i=0; i<list[source].size(); i++){
            if(list[source].get(i).equalsIgnoreCase(destination)){
                list[source].remove(i);
                break;
            }
        }
    }
    void removeAllEdges(){
        for(int i=0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph sudah kosong");
    }
    public void printGraph() throws Exception{
        for(int i=0; i<vertex; i++){
            if(list[i].size()>0){//vertex ada isinya //0 krna mau nyari dan cetak hubungan dari vertex
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for(int j=0; j<list[i].size(); j++){//list yang mau dicetak
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    boolean graphType(boolean pilih){
        return pilih;
    }
}