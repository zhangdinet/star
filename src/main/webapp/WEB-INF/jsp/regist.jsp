<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/lib/bootstrap/css/bootstrap.css">
    <!-- script标签须配对 -->
    <script src="<%=request.getContextPath()%>/static/lib/jquery/jquery.js"></script>
    <title>star主页</title>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="">Star</a>

            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li class="">
                        <a href="">Dashboard</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div style="margin-top: 100px">
    <form action="insert" method="post">
        姓名<input type="text" id="name"/><br>
        邮箱<input type="text" id="email"/><br>
        密码<input type="password" id="password"/><br>
        确认密码<input type="password" id="confirmPassword"/><br>
        <input type="submit" value="提交">

    </from>
</div>
</body>
</html>