<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="mbean" class="boarddb.UserBean">
		<jsp:setProperty name="mbean" property="*" /> <!-- 맵핑시키세요 -->
	</jsp:useBean>
	
	
	
</body>
</html>