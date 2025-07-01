class GfG {
    /* Insert an entry with key x and value y in map */
    void add_Value(TreeMap<Integer, Integer> hm, int x, int y) {
        hm.put(x, y);
    }
    
    /* Return the value with key x from the map 
       if the map contains key x, else return -1 */
    int find_value(TreeMap<Integer, Integer> hm, int x) {
        int s = -1;
        if (hm.containsKey(x))
            s = hm.get(x);
        
        return s;
    }
    
    /* Return the size of the map */
    int getSize(TreeMap<Integer, Integer> hm) {
        return hm.size();
    }
        
    /* Remove the entry with key x from the map */        
    void removeKey(TreeMap<Integer, Integer> hm, int x) {
        hm.remove(x);
    }
    
    /* Print map sorted by key using Iterator for traversing */
    void sorted_By_Key(TreeMap<Integer, Integer> hm) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(hm);
        Set set1 = map.entrySet();
        Iterator itr = set1.iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.print(me.getKey() + " ");
        }
    }
}
