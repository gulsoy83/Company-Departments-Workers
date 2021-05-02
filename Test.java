
package mylab2;


public class Test {
    
    public static void main (String[] args){
        Company sirket = new Company("Bilisim Firmasi");
		
		Worker c[] = new Worker[12];
		c[0]= new Programmer("Yazılımcı-1", 6,3, 7500);
		c[1]= new Analyst("Analist-1", 5,6500);
		c[2]= new Analyst("Analist-2", 6, 6500);
		c[3]= new Programmer("Yazılımcı-2", 6,4, 7500);
		c[4]= new Programmer("Yazılımcı-3",5 ,5, 7500);
		c[5]= new Programmer("Yazılımcı-4", 6,4, 7500);
		c[6]= new Programmer("Yazılımcı-5", 6,3, 7500);
		c[7]= new Analyst("Analist-3", 6, 6500);
		c[8]= new Analyst("Analist-4", 6, 6500);
		c[9]= new Programmer("Yazılımcı-6", 9, 7, 7500);
		c[10]= new Analyst("Analist-5", 9, 6500);
		
		
		System.out.println(c[8]);
		System.out.println(c[9].introduceSelf());
		System.out.println("**********************************");
		
		System.out.println("increasing salaries...");
		for(int i=0; i<c.length; i++){
			if(c[i]!=null)
				c[i].increaseSalary();
		}
		
		System.out.println("**********************************");
		System.out.println(c[8].introduceSelf());
		System.out.println(c[9].introduceSelf());
		System.out.println("**********************************");
		
		System.out.println("Workers are placing to departments...");
		for(int i=0; i<c.length; i++){
			sirket.addWorker(c[i]);
		}
		
		System.out.println("**********************************");
		sirket.depAvgSalary(3); 
		
		System.out.println("**********************************");
		System.out.println("Max yeared workers' names:");
		sirket.maxYearedWorkers();
		
		System.out.println("**********************************");
		sirket.introduceCompany();
    }
    
}
