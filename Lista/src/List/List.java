package List;

/**
 *
 * @author Darcks OMega
 */
public class List {

    private int data;
    private int top;

    public List() {

        data = new data [100];
        top = 0;
        
    }

    public void add(int d) {

        data = [d];
        top++;
        
    }

    public void remove() {

        
        
    }

    public void print() {

        for(int i = 0; i < top; i++){
            
            System.out.print(" " + data[i]);
            
        }
        
        System.out.println();
        
    }

}
