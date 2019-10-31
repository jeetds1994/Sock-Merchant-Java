import java.util.HashMap;
import java.util.Iterator;

public class SockMerchant {
    
    public static void main(String[] args) {

        int[] example = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.print(sockMerchant(example.length, example) == 3);
    }


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int el = ar[i];
            if (store.containsKey(el)) {
                store.put(el, store.get(el) + 1);
            } else {
                store.put(el, 1);
            }
        }

        int totalPairs = 0;

        Iterator<Integer> vals = store.values().iterator();

        while (vals.hasNext()) {
            int el = vals.next();
            totalPairs += el / 2;
        }

        return totalPairs;

    }
}