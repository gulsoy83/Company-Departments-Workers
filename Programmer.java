/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylab2;


public class Programmer extends Worker {
    private int certificateNumber; 
     
    public Programmer(String pname,int wyear,int cnumber ,double salary ){
        super(pname,wyear,salary);
        this.certificateNumber = cnumber;
    }
    
    @Override
    public void increaseSalary() {
        this.setSalary( salary + salary * 0.15 );
        this.setYearsWorked(this.getYearsWorked()+1);
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    
    
    @Override
     public String introduceSelf(){
        String m = " My certificates: "+this.certificateNumber;
        return super.introduceSelf() + m;
    }

    @Override
    public String toString() {
        return this.introduceSelf();
    }
    
     
}
