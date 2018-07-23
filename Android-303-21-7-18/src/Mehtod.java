
public class Mehtod {
	
	
	public String name;
	public int age;
	
	public  void setNAME(String Sname){
		
		this.name=Sname;
		
	}
	
	
	String getNAME (){
		return this.name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mehtod obj = new Mehtod();
		
		obj.setNAME("shah");
		obj.getNAME();
		
		System.out.println(" name  ="+obj.getNAME());
		

	}

}
