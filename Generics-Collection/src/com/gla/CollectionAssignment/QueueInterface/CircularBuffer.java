class CircularBuffer {
    int[] buffer;
    int size, start = 0, count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    void add(int val) {
        buffer[(start + count) % size] = val;

        if (count < size) count++;
        else start = (start + 1) % size;
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(start + i) % size] + " ");
        }
    }
}