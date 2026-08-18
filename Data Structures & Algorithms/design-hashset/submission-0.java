class MyHashSet {
    private ArrayList<Integer> data;
    public MyHashSet(){
        data=new ArrayList<>();
    }
    
    
    public void add(int key) {
        if(!data.contains(key)){
            data.add(key);
        }
    }
    
    public void remove(int key) {
        if(data.contains(key)){
            data.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        if(data.contains(key)){
            return true;
        }else{
            return false;
        }
    }
}