import java.util.LinkedList;
import java.util.Queue;

public class BFS3 {

    public static void bfs(UndirectedGraph1 graph1,int startIndex)
    {
        boolean[] marked=new boolean[graph1.v];
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(startIndex);
        while (!queue.isEmpty())
        {
            int node=queue.poll();
            System.out.println(node);
            marked[node]=true;
            for(Integer adj:graph1.getAdjList(node))
            {
                queue.add(adj);
            }
        }

    }
}


