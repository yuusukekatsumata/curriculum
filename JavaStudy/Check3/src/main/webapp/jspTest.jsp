<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<%@ include file="header.jsp" %>
<!-- name、idの入力エリアを作成しなさい -->
	<div class = "main">
		<table>
			<tr>
			<td><label for = "name">name</label></td><td><input type="text" name= "name" id="name"/></td>
			</tr>
			<tr>
			<td><label for = "id">			id</label></td><td><input type="text" name="id" id="id"/></td>
			</tr>
		</table>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>