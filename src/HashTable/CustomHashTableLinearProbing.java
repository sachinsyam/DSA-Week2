package HashTable;

public class CustomHashTableLinearProbing {
    public static void main(String[] args) {
        CustomHashTableLinearProbing table = new CustomHashTableLinearProbing(10);
        table.put(1,"Hello");
        table.put(2,"Hello2");
        table.put(3,"Hello3");
        table.put(15,"Hello15");
        table.put(25,"Hello25");

        table.printTable();
        System.out.println(table.get(25));
    }
    private class Node{
        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    int size;
    Node [] table = new Node[size];

    public CustomHashTableLinearProbing(int size) {
        this.size = size;
        table = new Node[size];
        for (int i = 0; i <size ; i++) {
            table[i] = null;
        }
    }
    public int put(int key, String value){
        int hash = key%10;
        int probes=0;
        if(table[hash] == null || table[hash].key == key) {
            table[hash] = new Node(key, value);
            return ++probes;
        }
        else{
            int i=0;
            while(i<size){
                probes++;
                if (table[(hash + i) % size] == null || table[(hash + i) % size].key == key) {
                    table[(hash + i) % size] = new Node(key, value);
                    System.out.printf("Added at pos:"+(hash + i) % size);
                    break;
                }
                i++;
            }
            if(i==size)
                System.out.println("Not able to insert");
            return probes;
        }
    }
    public String get(int key){
        int hash = key%10;
        if(table[hash].key == key)
            return table[hash].value;
        else{
            for (int i = 0; i <size ; i++) {
                try{
                    if (table[i].key == key)
                        return table[i].value;
                }catch (Exception e){
                    //System.out.println("null");
                }
            }
            return "Not Found";
        }
    }
    public void printTable(){
        for (int i = 0; i < size; i++) {
           try{
               System.out.println("Key:"+table[i].key+" Value:"+table[i].value);
           }
           catch (Exception e){
               System.out.println("null");
           }
        }
    }
}
