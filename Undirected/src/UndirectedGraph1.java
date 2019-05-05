import java.util.LinkedList;

public class UndirectedGraph1 {

    public UndirectedGraph1(int v)
    {
        this.adjList=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
           this.adjList[i]=new LinkedList<Integer>();
        }
    }

    int v;

    LinkedList<Integer>[] adjList;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

   public void addEdge(int source,int destination)
   {
       this.adjList[source].add(destination);
       this.adjList[destination].add(source);
   }

   public LinkedList<Integer> getAdjList(int v)
   {
       return this.adjList[v];
   }

}
