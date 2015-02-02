<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function doLogin(){
		if(frm.j_username.value == ""){
			alert("아이디를 입력해주세요.");
			return;
		}
		if(frm.j_password.value == ""){
			alert("패스워드를 입력해주세요.");
			return;
		}
		frm.submit();
	}
</script>
</head>
<body>
<form name="frm" action="j_spring_security_check" method="post">
<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="j_username"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="j_password"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="로그인" onclick="doLogin()"></td>
		</tr>
</table>
</form>
</body>
</html>