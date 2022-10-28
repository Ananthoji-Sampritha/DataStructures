public class SearchIndex {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int target = 4;
        System.out.println(indexPos(a, target));
    }

    static int indexPos(int[] a, int key) {
        int l = 0, h = a.length;
        int mid = l + (h - l) / 2;
        int pos = mid + 1;
        while (l < h) {
            mid = l + (h - l) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                h = mid;
                pos = mid;
            } else {
                l = mid + 1;
                pos = mid + 1;
            }

        }
        return pos;
    }
}



