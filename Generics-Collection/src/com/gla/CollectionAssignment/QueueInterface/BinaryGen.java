class BinaryGen {
    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.println(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}