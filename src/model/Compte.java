

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Carton> getCartonList() {
        return cartonList;
    }

    public void setCartonList(List<Carton> cartonList) {
        this.cartonList = cartonList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
    
    @Override
    public int compareTo(Object o) {
        Compte c = (Compte) o;

    if (this.getName().toUpperCase() == c.getName().toUpperCase())
        return 1;
    else 
        return -1;
    }
        
}

