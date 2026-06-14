// Last updated: 14/06/2026, 21:47:32
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20class Solution {
21    Map<Node, Node> map = new HashMap<>();
22    public Node cloneGraph(Node node) {
23        if(node == null) return null;
24
25        if(map.containsKey(node)){
26            return map.get(node);
27        }
28
29        Node clone = new Node(node.val);
30
31        map.put(node, clone);
32
33        for(Node neigh : node.neighbors){
34            clone.neighbors.add((cloneGraph(neigh)));
35        }
36        return clone;
37    }
38}