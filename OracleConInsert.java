import java.sql.*;  
class OracleConInsert{  
public static void main(String args[])
{  
try
{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saniya123");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  // Java Program to Establish Connection in JDBC
	
String sql = "insert into student values('7','mgmg','56')";	
// Creating a statement
			 stmt = con.createStatement();
	// Executing insert query

			int m = stmt.executeUpdate(sql);
			if (m==1)
		System.out.println(					"inserted successfully : " + sql);
			else
System.out.println("insertion failed");

//step4 execute select query  

ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
 
//step4 execute Delete query 
String query = "Delete from student where srno = '23'";
      int i = stmt.executeUpdate(query); 
System.out.println("delete  successfully : " + query+" "+i);
// after Delete a element 			
rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

//step5 close the connection object  
con.close();  
  
}
catch(Exception e)
{ 
System.out.println(e);
}
}
}

