package List;

/**
 *
 * @author Darcks OMega
 */
public class List {

    private int data[];
    private int top;

    public List() {

        data = new int [100];
        top = 0;
        
    }

    public void add(int d, int p) {

        data [p] = d;
        top++;
        
    }

    public void remove(int p) {

        int d = data [p];
        
        for(int i= 0; i < top; i++){
            
            data [d] = data[d + 1];
            
        }
        
    }

    public void print() {

        for(int i = 0; i < top; i++){
            
            System.out.print(" " + data[i]);
            
        }
        
        System.out.println();
        
    }

}
