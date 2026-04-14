class RotateList {
    public static <T> void rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;

        List<T> temp = new ArrayList<>(list.subList(0, k));
        for (int i = 0; i < n - k; i++) {
            list.set(i, list.get(i + k));
        }
        for (int i = 0; i < k; i++) {
            list.set(n - k + i, temp.get(i));
        }
    }
}