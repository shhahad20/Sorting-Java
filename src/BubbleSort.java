public class BubbleSort {
    static Integer a[] = {27, 49, 35, 37, 15, 75, 63, 65};
    public static void main(String[] args) {
        bubbleSort(a);
        for(Integer num : a) {
            System.out.print(num + " ");
        }
    }
    static void bubbleSort(Integer[] a) {
        int i, pass, exch, n = a.length;
        Integer tmp;
        for (pass = 0; pass < n; pass++) {
            exch = 0;
            for (i = 0; i < n - pass - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    exch++;
                }
            }
            if (exch == 0) {
                return; // sorting finished – return early
            }
        }
    }
}
