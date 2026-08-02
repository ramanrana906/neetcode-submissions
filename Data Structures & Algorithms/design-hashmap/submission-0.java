class MyHashMap {

    // Node class for Linked List
    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    Node[] buckets;
    int capacity;
    int size;

    public MyHashMap() {
        capacity = 16;
        buckets = new Node[capacity];
        size = 0;
    }

    // Hash Function
    private int hash(int key) {
        return key % capacity;
    }

    // Insert or Update
    public void put(int key, int value) {

        int index = hash(key);

        // Bucket is empty
        if (buckets[index] == null) {
            buckets[index] = new Node(key, value);
            size++;
            return;
        }

        Node current = buckets[index];

        // Check if key already exists
        while (current != null) {

            if (current.key == key) {
                current.value = value;
                return;
            }

            // Reached last node
            if (current.next == null) {
                break;
            }

            current = current.next;
        }

        // Insert new node at end
        current.next = new Node(key, value);
        size++;
    }

    // Get value
    public int get(int key) {

        int index = hash(key);

        Node current = buckets[index];

        while (current != null) {

            if (current.key == key) {
                return current.value;
            }

            current = current.next;
        }

        return -1;
    }

    // Remove key
    public void remove(int key) {

        int index = hash(key);

        Node current = buckets[index];
        Node previous = null;

        while (current != null) {

            if (current.key == key) {

                // First node in bucket
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                size--;
                return;
            }

            previous = current;
            current = current.next;
        }
    }
}