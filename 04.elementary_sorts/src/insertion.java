public class insertion {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; i ++){
            for (int j = i; j > 0; j --){
                if (less(j, j-1)){
                    exch(a, j, j-1);
                }
                // we have already ensured the former part is sorted
                else{
                    break;
                }
            }
        }
    }

    public static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
