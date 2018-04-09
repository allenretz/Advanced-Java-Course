<html>
<head><title>Insert into DB</title></head>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="java.io.*" %>
<body>
  <p>The following values have been inserted into the DB</p>
  <ul>
	 <li><p><b>Index:</b>
		<%= request.getParameter("number")%>
	 </p></li>
	 <li><p><b>First Name:</b>
		<%= request.getParameter("first_name")%>
	 </p></li>
	 <li><p><b>Last  Name:</b>
		<%= request.getParameter("last_name")%>
	 </p></li>
  </ul>
<table>
<% 

java.sql.Connection con;
java.sql.Statement s;
java.sql.ResultSet rs;
java.sql.PreparedStatement pst;

con=null;
s=null;
pst=null;
rs=null;

// Remember to change the next line with your own environment 
String url= 
"jdbc:jtds:sqlserver://acaddb/RJB_GG";
String id= "sa";
String pass = "";
try{

Class.forName("net.sourceforge.jtds.jdbc.Driver");
con = java.sql.DriverManager.getConnection(url, id, pass);

}catch(ClassNotFoundException cnfex){
cnfex.printStackTrace();

}
String sql = "INSERT INTO PERSONS VALUES("+request.getParameter("number")+", '"+request.getParameter("first_name")+"', '"+request.getParameter("last_name")+"')";
try{
s = con.createStatement();
s.executeUpdate(sql);
}
catch(Exception e){
	
	e.printStackTrace();
	StringWriter sw = new StringWriter();
	e.printStackTrace(new PrintWriter(sw));
	String exceptionAsString = sw.toString();


%><tr>
<td><%= 



exceptionAsString %></td>

</tr>
<%
	}
finally{
if(rs!=null) rs.close();
if(s!=null) s.close();
if(con!=null) con.close();
}

%>

</body>
</html>