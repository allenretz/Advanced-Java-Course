<html>
<head><title>Search DB</title></head>
<body>
<table>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="java.io.*" %>
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
String sql = "SELECT * FROM dbo.PERSONS where FIRSTNAME like '"+request.getParameter("query")+"' OR LASTNAME like '"+request.getParameter("query")+"'";
try{
s = con.createStatement();
rs = s.executeQuery(sql);
%>
<tr><th>ID&nbsp;&nbsp;</th><th>FIRSTNAME&nbsp;&nbsp;</th><th>LASTNAME&nbsp;&nbsp;</th></tr>
<%
while( rs.next() ){
%><tr>
<td><%= rs.getString("IDNUMBER") %></td>
<td><%= rs.getString("FIRSTNAME") %></td>
<td><%= rs.getString("LASTNAME") %></td>

</tr>
<%
}
%>

<%

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
<a href="jsp_index.html">Back</a>
</body>
</html>

