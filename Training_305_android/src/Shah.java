
public class Shah {
	
	public String name;
	
	
	
	     public void setNAME (String Sname){
		 
			this.name= Sname;
			
		}
		 
		 String getName (){  
			 
			 return name;
			 
		 }
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shah obj = new Shah();
		obj.setNAME("shah");
		System.out.println("name  = "+obj.getName());
		
		///2nd obj
		
		Home2 obj2 =new Home2();
		obj2.setid(5655);
		obj2.getID();
		
		System.out.println("id  = "+obj2.getID());

	}
	
}

class Home2 extends Shah{
	
	public int id;
	
    public void setid (int Sname){
		 
			this.id= Sname;
			
		}
		 
		 int getID (){  
			 
			 return id;
			 
		 }
	
}
