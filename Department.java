/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylab2;

/**
 *
 * @author Muhammed
 */
public class Department {
    private final int wQuantity=3;
    private Worker[] depworkers = new Worker[wQuantity];

    public int getWQuantity() {
        return wQuantity;
    }

    public Worker[] getDepworkers() {
        return depworkers;
    }

    public void depInfo(int dno){
        int aNo=0,yNo=0;
        for (int i=0; i<wQuantity; i++){
            if(depworkers[i] instanceof Analyst)
                aNo++;
            else if(depworkers[i] instanceof Programmer)
                yNo++;
            
        }
        
        System.out.println("There are "+aNo+" analysts and "+yNo+" programmers in "+dno +". department.");
    }
    
    public double avgSalary(){
        double total=0;
        int count = 0;
        for(int i=0; i< depworkers.length; i++){
            if(depworkers[i]!=null){
                total+=depworkers[i].getSalary();
                count++;
            }
        }
        return total/count;
    }
    
    
}
