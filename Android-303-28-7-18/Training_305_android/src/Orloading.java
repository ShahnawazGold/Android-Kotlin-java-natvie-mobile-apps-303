
public class Orloading {
	
	
	
	Orloading(){
		
		  System.out.println("constructor" );
		  
	}
	
	
	 public static int mainFunction (int n1, int n2){
		  
		  int min ;
		  
		  if(n1 > n2){
			  
			  min = n2;
		  }else{
			min=  n1;
		  
		  }
		  return min;
		 
	 }
	 
	 public static double  mainFunction(double n1, double n2 ){
		 
		  
		 double min ;
		  
		  if(n1 > n2){
			  
			  min = n2;
		  }else{
			min=  n1;
		  
		  }
		  return min;
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orloading obj = new Orloading();
		
		int a =2;
		int b =4;
		
		double c = 2.6;
		double d = 4.6;
		
		int result =mainFunction(a,b);
		double results =mainFunction(c,d);
		
	    System.out.println("int parm   = " + result);
	    System.out.println("int double   = " + results);

	}

}
