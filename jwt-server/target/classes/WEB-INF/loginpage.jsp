<%@page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <title>自定义登录页</title>
</head>
<body>
		<form id="loginform" action="/checklogin" method="GET">
			<table>
				<tbody>
				<tr><td>姓名 ：</td><td> <input name="username" type="text" /></td></tr>
				<tr><td>密码 ：</td><td><input name="password" type="text" /></td> </tr>
				<tr><td><input name="submit" type="submit" value="登录" /></td></tr>
				</tbody>
			</table>
		</form>
</body>
</html>
