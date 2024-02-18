public class SecondLarge {
    static int findSecondLargest(int a[], int n) {
        int fl = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (fl < a[i])
                fl = a[i];
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (a[i] > sl && a[i] < fl)
                sl = a[i];
        return sl;
    }
    public static void main(String[] args) {
        int a[] = { 12, 35, 1, 10, 34, 1 };
        int n = a.length;
        int answer = findSecondLargest(a, n);
        System.out.println("Second largest element is: " + answer);
    }
}