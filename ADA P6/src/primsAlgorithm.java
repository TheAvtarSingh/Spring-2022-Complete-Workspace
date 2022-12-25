

public class primsAlgorithm {

  public void Prim(int G[][], int V) {

   
    int no_edge; // number of edge

    boolean[] selected = new boolean[V];


    no_edge = 0;

 
    selected[0] = true;

    // print for edge and weight
    System.out.println("Edge : Weight");

    while (no_edge < V - 1) {


      int min = 9999999;
      int x = 0; // row number
      int y = 0; // col number

      for (int i = 0; i < V; i++) {
        if (selected[i] == true) {
          for (int j = 0; j < V; j++) {
            // not in selected and there is an edge
            if (selected[j]==false && G[i][j] != 0) {
              if (min > G[i][j]) {
                min = G[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }
      System.out.println(x + " -> " + y + " :  " + G[x][y]);
      selected[y] = true;
      no_edge++;
    }
  }

  public static void main(String[] args) {
	  primsAlgorithm g = new primsAlgorithm();

    // number of vertices in graph
    int V = 5;


    // adjacency matrix
    int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
        { 0, 42, 66, 31, 0 } };

    g.Prim(G, V);
  }
}