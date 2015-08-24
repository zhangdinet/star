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
                    <li class="active">
                        <a href="/regist">注册</a>
                    </li>
                    <li class="">
                        <a href="www.baidu.jsp">百度</a>
                    </li>
                    <li class="">
                        <a href="">Customize</a>
                    </li>
                    <li>
                        <a href="www.baidu.com">注册页标记</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<h1 style="margin-top: 50px;">${message}</h1>

<div>
    <%
        System.out.println(request.getServletPath());
    %>
</div>

<h1>中文测试</h1>

<div>
    <img src="/static/images/google.png">
</div>
</body>
</html>