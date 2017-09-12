<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/favicon.ico">

    <title>注册</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/signin.css" rel="stylesheet">
    <link href="css/background.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <%--<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->--%>
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="js/jquery-1.9.1.min.js" ></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <!--<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>-->
    <!--<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>-->
    <%--<![endif]-->--%>
</head>

<body>

<div class="container" >
    <form class="form-signin" method="post" href="">
        <h2 class="form-signin-heading" align="center">注册</h2>
        <br>
        <label for="username" class="sr-only">用户名</label>
        <input type="text" id="username" class="form-control" placeholder="请输入用户名"  required autofocus >
        <br>
        <label for="inputEmail" class="sr-only">邮箱</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="请输入邮箱" required autofocus>
        <br>
        <label for="password" class="sr-only">密码</label>
        <input type="password" id="password" class="form-control" placeholder="请输入密码" required>
        <br>
        <label for="inputPassword" class="sr-only">确认密码</label>
        <input type="password" id="inputPassword" class="form-control" onblur="checkPassword()" placeholder="请再次输入密码" required>
        <span id="message" hidden="hidden" style="color: #c7254e">两次输入的密码不一致</span>
        <br>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
    </form>
</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/js/ie10-viewport-bug-workaround.js"></script>
</body>
<script type="text/javascript">
    function checkPassword() {
        //第一次输入密码
        var  psd1=$("#password").val();
        //第二次输入密码
        var  psd2=$("#inputPassword").val();
        //校验
        if(psd1==psd2){
            $("#message").attr("hidden","hidden");
        }else {
            $("#message").removeAttr("hidden");
        }
    }

</script>
</html>
