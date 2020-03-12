<%@page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <title>资源访问页面</title>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<script type="text/javascript">
$(function(){
	var token=$.cookie('jwt_token');
	alert(token);
});
</script>
</head>
<body>
	<h1>jwt权限</h1>
	<h2>带有tocken信息，可以访问</h2>
</body>
</html>
