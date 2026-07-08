class MyHashSet {

    private static final int SIZE = 1009;

    private static final int EMPTY = 0;
    private static final int OCCUPIED = 1;
    private static final int DELETED = 2;

    private int[] table;
    private int[] state;

    public MyHashSet() {
        table = new int[SIZE];
        state = new int[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {

        int index = hash(key);

        while (state[index] != EMPTY) {

            // Key already exists
            if (state[index] == OCCUPIED && table[index] == key) {
                return;
            }

            index = (index + 1) % SIZE;
        }

        table[index] = key;
        state[index] = OCCUPIED;
    }

    public void remove(int key) {

        int index = hash(key);

        while (state[index] != EMPTY) {

            if (state[index] == OCCUPIED && table[index] == key) {
                state[index] = DELETED;
                return;
            }

            index = (index + 1) % SIZE;
        }
    }

    public boolean contains(int key) {

        int index = hash(key);

        while (state[index] != EMPTY) {

            if (state[index] == OCCUPIED && table[index] == key) {
                return true;
            }

            index = (index + 1) % SIZE;
        }

        return false;
    }
}