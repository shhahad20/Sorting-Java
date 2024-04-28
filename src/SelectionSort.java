class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 49, 27, 65, 37, 15, 75, 63, 60 };
        System.out.print("\n Unsorted array: ");
        display(arr);
        selectionSort(arr);
        System.out.print("\n Sorted array: ");
        display(arr);
    }

    static void selectionSort(int a[]) {
        int n = a.length;
        for (int pass = 0; pass < n - 1; pass++) {
            int min = pass;
            for (int i = pass + 1; i < n; i++)
                if (a[i] < a[min])
                    min = i;
            if (min != pass) {
                int tmp = a[min];
                a[min] = a[pass];
                a[pass] = tmp;
            }
        }
    }

    static void display(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}