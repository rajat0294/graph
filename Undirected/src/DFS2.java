public class DFS2 {

    public void printDFS(UndirectedGraph1 graph1,int startindex)
    {
       boolean[] marked=new boolean[graph1.v];
       marked[startindex]=true;
       for(Integer n:graph1.getAdjList(startindex))
       {
           if(!marked[n])
           {
               System.out.println(n);
               printDFS(graph1,n);


           }
       }

    }
}
