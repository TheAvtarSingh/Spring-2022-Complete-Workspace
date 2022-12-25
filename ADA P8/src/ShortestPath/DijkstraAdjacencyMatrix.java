package ShortestPath;

class Graph_Shortest_Path { 
     
    int vertices = 6; 
    int FindminDistanceDistance(int distance[], Boolean visitedVertex[])   {  
        int minDistance = Integer.MAX_VALUE, distanceValue = -1; 
        for (int v = 0; v < vertices; v++) 
            if (visitedVertex[v] == false && distance[v] <= minDistance) { 
                minDistance = distance[v]; 
                distanceValue = v; 
            } 
   
        return distanceValue; 
    } 
   
    void printminDistancepath(int distance[])   { 
        System.out.println("Vertex \t Distance from Source"); 
        for (int i = 0; i < vertices; i++) 
            System.out.println(i + " \t\t\t " + distance[i]); 
    }
    
    void algo_dijkstra(int graph[][], int source)  { 
        int distance[] = new int[vertices]; 
        Boolean visitedVertex[] = new Boolean[vertices]; 
   
        for (int i = 0; i < vertices; i++) { 
            distance[i] = Integer.MAX_VALUE; 
            visitedVertex[i] = false; 
        } 
   
        distance[source] = 0;  
        for (int i = 0; i < vertices - 1; i++) { 
            int u = FindminDistanceDistance(distance, visitedVertex); 
            visitedVertex[u] = true; 
            for (int v = 0; v < vertices; v++) 
    
                if (visitedVertex[v]==false && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][v] < distance[v]) 
                            distance[v] = distance[u] + graph[u][v]; 
        } 
   
        printminDistancepath(distance); 
    } 
}
public class DijkstraAdjacencyMatrix{
    public static void main(String[] args) 
    { 
        int graph[][] = new int[][] { { 0, 2, 1, 0, 0, 0}, 
                                      { 2, 0, 7, 0, 8, 4}, 
                                      { 1, 7, 0, 7, 0, 3}, 
                                      { 0, 0, 7, 0, 8, 4}, 
                                      { 0, 8, 0, 8, 0, 5}, 
                                      { 0, 4, 3, 4, 5, 0} }; 
        Graph_Shortest_Path g = new Graph_Shortest_Path(); 
        g.algo_dijkstra(graph, 0); 
    } 
}