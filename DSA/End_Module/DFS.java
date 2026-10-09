package com.file.dsa;

public class DFS {
	
    static int graph[][] = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };

      static boolean visited[] = new boolean[6];
      
      public static void dfs(int vertex) {
    	  
    	  visited[vertex] = true;
    	  
    	  //Convert index to vertex number
    	  System.out.println((vertex + 1) + " ");
    	  
    	  for(int i = 0; i<graph.length; i++) {
    		  
    		  if(graph[vertex][i]==1 && !visited[i]) {
    			  dfs(i);
    		  }
    	  }
      }

	public static void main(String[] args) {
		 System.out.print("DFS Traversal:");
		 
		 dfs(0); //vertex 1 has index 0

	}

}
