<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Login page</h1>
<img src="../img/beach.jpg" />
<div>${param.msg}</div>
<form method="post" action="login_ok">
    사용자 ID : <input type="text" name="userid" /><br/>
    암호 : <input type="password" name="password" /><br/>
    <input type="submit" value="login"/>
</form>
</body>
</html>