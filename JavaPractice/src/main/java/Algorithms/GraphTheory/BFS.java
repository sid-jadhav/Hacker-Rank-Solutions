package Algorithms.GraphTheory;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph{
	class Edge{
		int v,w;
		public Edge(int v,int w){
			this.v=v;
			this.w=w;
		}
		public String toString(){
			return("["+v+","+w+"]");
		}
	}
	List<Edge>[] g;
	public Graph(int n){
		g=new LinkedList[n];
		for(int i=0;i<g.length;i++){
			g[i]=new LinkedList();
		}
	}
	public void addEdge(int u,int v,int w){
		g[u].add(0, new Edge(v,w));//reduces time complexity
	}
	public boolean isConnected(int u,int v){
		for(Edge e:g[u]){
			if(e.v==v){
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<g.length;i++){
			result+=i+"=>"+g[i]+"\n";
		}
		return result;
	}
}
public class BFS {
	
	public static void main(String[] args) {
		Graph g= new Graph(10);
		g.addEdge(0, 2, 10);
		g.addEdge(0, 5, 15);
		g.addEdge(2, 5, 10);
		g.addEdge(9, 3, 16);
		System.out.println(g);
		System.out.println(g.isConnected(9, 3));
		System.out.println(g.isConnected(0,9));
		
	}

}
