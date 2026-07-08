class MyHashSet {

    private LinkedList<Integer>[] buckets;
    private int size = 769;

    public MyHashSet() {
        buckets = new LinkedList[size];

        for (int i = 0; i < size; i++)
            buckets[i] = new LinkedList<>();
    }

    private int hash(int key) {
        return key % size;
    }

    public void add(int key) {

        int index = hash(key);

        if (!buckets[index].contains(key))
            buckets[index].add(key);
    }

    public void remove(int key) {

        int index = hash(key);

        buckets[index].remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {

        int index = hash(key);

        return buckets[index].contains(key);
    }
}