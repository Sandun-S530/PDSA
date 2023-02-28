<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.*" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Linked List</title>
</head>
<body>
	<jsp:useBean id="list" class="beans.LinkedList" scope="session"></jsp:useBean>
	
    <h1>Linked List</h1>
    <form method="post" action="AddNodeServlet">
        <label for="data">Data:</label>
        <input type="text" id="data" name="data">
        <button type="submit">Add Node</button>
    </form>

    <h2>Nodes:</h2>
    <%
        LinkedList linkedList = (LinkedList) request.getAttribute("linkedList");
    if(linkedList != null){
        List<Node> nodes = linkedList.getAllNodes();

        for (Node node : nodes) {
        	
        	if(node== null){
        		
        	}
        	else{
    %>
        <p><%= node.getData() %></p>
    <%
        }
        }
    }
    %>
    
</body>
</html>

