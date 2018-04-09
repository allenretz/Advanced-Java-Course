import java.sql.*;  

public class dbconn {  

   public static void main(String[] args) {  

 
      String connectionUrl = "jdbc:sqlserver://acaddb;" +  
         "databaseName=RJB_GG;user=sa;password=Op4SQLclass";  

  
      Connection con = null;  
      Statement stmt = null;  
      ResultSet rs = null;  

      try {  
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         con = DriverManager.getConnection(connectionUrl);  

         // Create and execute an SQL statement that returns some data.  
         String SQL = "SELECT * from sale";  
         stmt = con.createStatement();  
         rs = stmt.executeQuery(SQL);  


         while (rs.next()) {  
            System.out.println(rs.getString(1) );  
         }  
      }  


      catch (Exception e) {  
         e.printStackTrace();  

      }  
      finally {  
         if (rs != null) try { rs.close(); } catch(Exception e) {}  
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
         if (con != null) try { con.close(); } catch(Exception e) {}  
      }  
   }  
}  