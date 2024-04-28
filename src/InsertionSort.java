public class InsertionSort {
    void insertionSort(Integer a[]) {
        int i, j, n = a.length;
        Integer item;
        for (j = 1; j < n; j++) { // repeat loop starting from a[1] to a[n-1]
            item = a[j]; // element to be inserted
            i = j - 1;
            while (i >= 0 && item.compareTo(a[i]) < 0) {
                a[i + 1] = a[i]; // shift element to the right
                i = i - 1;
            }
            a[i + 1] = item; // insert element in proper position
        }
    }
    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        Integer a[] = {27, 49, 35, 37, 15, 75, 63, 65};
        sorter.insertionSort(a);
        for(Integer num : a) {
            System.out.print(num + " ");
        }
    }
}
