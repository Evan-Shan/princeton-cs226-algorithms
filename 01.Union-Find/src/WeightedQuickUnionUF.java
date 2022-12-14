public class WeightedQuickUnionUF {
    private int[] id;
    private int[] size;

    public WeightedQuickUnionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i ++){
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int pRoot = root(p);
        int qRoot = root(q);
        if (size[pRoot] >= size[qRoot]){
            id[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }else {
            id[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        }
    }
}
