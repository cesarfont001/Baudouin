

package model;

import java.util.List;



/**
 *
 * @author Fontaine César
 */
public class Compte implements Comparable{
    
    
    private String name;
    private List<Carton> cartonList;
    private double total;

    public Compte(String name, List<Carton> cartonList, double total) {
        this.name = name;
        this.cartonList = cartonList;
        this.total = total;
    }
    
    
    
    @Override
    public int compareTo(Object o) {
        
        return 0;
    }
}

