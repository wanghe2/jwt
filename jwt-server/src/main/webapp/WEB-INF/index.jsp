<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <title>首页</title>
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<script type="text/javascript">
$(function(){
	var token_val=$("input[name='jwt_token']").val();
	var token=$.cookie('jwt_token');
	if(token==null||token==undefined){
		$.cookie('jwt_token',token_val, { expires: 7 })
	}
});
function getData(){
	var token=$.cookie('jwt_token');
	window.location.href="http://localhost:8080/getinfo?jwt_token="+token;
}
</script>
</head>
<body>
	<h1>大厅首页</h1>
	<h2>恭喜你登录成功</h2>
	<a href="javascript:getData()">访问权限页面</a>
	<input type="hidden" name="jwt_token" value="${jwt_token}" />
</body>
</html>
