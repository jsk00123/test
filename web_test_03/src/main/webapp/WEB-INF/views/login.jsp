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
			alert("���̵� �Է����ּ���.");
			return;
		}
		if(frm.j_password.value == ""){
			alert("�н����带 �Է����ּ���.");
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
			<td>���̵�</td>
			<td><input type="text" name="j_username"></td>
		</tr>
		<tr>
			<td>��й�ȣ</td>
			<td><input type="password" name="j_password"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="�α���" onclick="doLogin()"></td>
		</tr>
</table>
</form>
</body>
</html>