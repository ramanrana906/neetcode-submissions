class MyHashSet {

    private LinkedList<Integer> [] buckets = new LinkedList[769];

    public MyHashSet() {
      for (int i = 0; i < 769; i++) {
    buckets[i] = new LinkedList<>();
        }
    }
    
    private int hash(int key) {
    return key % 769;
    }

   public void add(int key) {
    int index = hash(key);

    if (!buckets[index].contains(key)) {
        buckets[index].add(key);
    }
  }
    
    public void remove(int key) {
       int index = hash(key);
    buckets[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
      int index = hash(key);
        if (!buckets[index].contains(key)) {
          return false;
          }
          return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */