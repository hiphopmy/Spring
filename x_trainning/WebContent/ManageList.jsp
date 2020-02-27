<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.ManageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	ManageService manageService = new ManageService();
	ArrayList manageList = (ArrayList)manageService.findManageAll();
	request.setAttribute("manageList", manageList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h4>번호 이름 나이</h4>
	<form action="ManageView.jsp">	
	<c:forEach var="manage" items="${manageList}">
	${manage.no}, ${manage.name}, ${manage.age}	<input type="submit" name="no" value="자세히보기"><br> 
	</c:forEach>	
	<input type="hidden" name="no" value="${manage.no}">
	</form>
	
</div>
</body>
</html>