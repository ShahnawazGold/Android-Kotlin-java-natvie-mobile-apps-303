
public class Home2 {
	

	
	String name ;
	  
	public void setName (String name ){
		this.name = name;
		
	}
	
	String getName (){
		return this.name;
	}
	

	public static void main(String[] argr) {
		// TODO Auto-generated method stub
		
		Home2 obj = new Home2();
		MAEN obj2 = new MAEN();
		
		obj.setName("shah");
		obj.getName();
		
		System.out.println("  name  "+ obj.getName());

	}
	
	
}

  class MAEN  extends Home2{

	
}