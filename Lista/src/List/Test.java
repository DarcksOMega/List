package List;

/**
 *
 * @author Darcks OMega
 */

public class Test {
    
    public static void main (String args[]){
        
        List L = new List();
        
        L.add(1, 0);
        L.add(5, 1);
        L.add(10, 2);
        L.add(4, 3);
        L.add(2, 4);
        L.add(15, 5);
        
        System.out.print(" Initial Elements:  ");
        L.print();
        
    }
    
}
