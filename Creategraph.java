import java.util.*;
public class Creategraph {
    public static class Edge{
        int source;
        int destination;
        int weight;

         public Edge(int source,int destination,int weight){
            this.source=source;
            this.destination=destination;
            this.weight=weight;
         }
    }

    public static void main(String[] args) {
        int value=5;
        ArrayList<Edge>[] graph=new ArrayList[value];

        for(int i=0; i<value; i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        graph[4].add(new Edge(4,2,2));

        // 2's neighbour
        for(int i=0; i<graph[2].size(); i++){
            Edge edge = graph[2].get(i);
            System.out.println(edge.destination);
        }

    }
}
