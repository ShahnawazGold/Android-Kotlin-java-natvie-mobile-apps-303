
public class Methods {
	
	public String  name  ;
	
	
	
	 public void setNAME (String Sname){
		 
		this.name= Sname;
		
	}
	 
	 String getName (){  
		 
		 return name;
		 
	 }
	 
	 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods obj = new Methods();
		obj.setNAME("shah");
		obj.getName();
		
		System.out.println("name  = "+obj.getName());

	}
	
	

}
