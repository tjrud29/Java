package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 9;//그래프 노드의 수를 5로 나타냄
		Graph graph = new Graph(ver);
		
		//addEdge 간선 추가
		graph.addEdge(1, 2);//노드0에서 노드1로 방향이 있는 엣지를 추가
		graph.addEdge(1, 3);//노드0에서 노드2로 방향이 있는 엣지를 추가
		graph.addEdge(1, 4);	
		graph.addEdge(1, 6);
		graph.addEdge(2, 3);
		graph.addEdge(2, 5);
		graph.addEdge(2 ,6);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		graph.addEdge(4, 7);
		graph.addEdge(6, 8);
		
		
		
		System.out.println("DFS 탐색 결과 :" );
		
		//DFS 탐색을 시작할 노드의 번호를 전달
		//0으로 시작함
		graph.DFS(4);
		
		
		
	}

}



/*
 DFS 탐색을 시작하여 그 결과를 출력 
 탐색 결과는 시작 노드에서 출발하여 깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
 * */
 