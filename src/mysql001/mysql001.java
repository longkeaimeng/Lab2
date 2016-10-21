package mysql001;
//commit
public class mysql001 {
  public static void main(String args[]) { 
    try { 
    	Class.forName("com.mysql.jdbc.Driver");   
    	System.out.println("Success loading Mysql Driver!"); 
    } 
    catch (Exception e) { 
     System.out.print("Error loading Mysql Driver!"); 
     e.printStackTrace(); 
    }
  } 
}