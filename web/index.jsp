<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
  <meta charset="utf-8" />
  <title>Klass | 登录</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport" />
  <meta content="" name="description" />
  <meta content="" name="author" />
  <!-- BEGIN GLOBAL MANDATORY STYLES -->
  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
  <link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
  <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
  <link href="css/style-metro.css" rel="stylesheet" type="text/css"/>
  <link href="css/style.css" rel="stylesheet" type="text/css"/>
  <link href="css/style-responsive.css" rel="stylesheet" type="text/css"/>
  <link href="css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
  <link href="css/uniform.default.css" rel="stylesheet" type="text/css"/>
  <!-- END GLOBAL MANDATORY STYLES -->
  <!-- BEGIN PAGE LEVEL STYLES -->
  <link href="css/login.css" rel="stylesheet" type="text/css"/>
  <!-- END PAGE LEVEL STYLES -->
  <link rel="shortcut icon" href="images/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
<!-- BEGIN LOGO -->
<div class="logo">
  <img src="images/logo-big.png" alt="" />
</div>
<!-- END LOGO -->
<!-- BEGIN LOGIN -->
<div class="content">
  <!-- BEGIN LOGIN FORM -->
  <form class="form-vertical login-form" action="AdminTeacherLogin.action" method="post">
    <h3 class="form-title" style="font-family: 微软雅黑;text-align: center">登录</h3>
    <div class="control-group">
      <div class="controls">
        <div class="input-icon left">
          <i class="icon-user"></i>
          <input class="m-wrap placeholder-no-fix" style="height: 30px;width: 280px" type="text" placeholder="工号" name="id" id="id"/>
        </div>
      </div>
    </div>
    <div class="control-group">
      <label class="control-label visible-ie8 visible-ie9">Password</label>
      <div class="controls">
        <div class="input-icon left">
          <i class="icon-lock"></i>
          <input class="m-wrap placeholder-no-fix" style="height: 30px;width: 280px" type="password" placeholder="密码" name="password" id="password"/>
        </div>
      </div>
    </div>
    <div class="form-actions">
      <label class="checkbox" style="font-family: 微软雅黑;margin-left: 20px">
        <input type="checkbox" name="remember" value="1"/> 记住我
        <a href="home.action">GO!</a>
      </label>
      <button type="submit" class="btn green pull-right" style="font-family: 微软雅黑">
        登录 <i class="m-icon-swapright m-icon-white"></i>
      </button>
    </div>
  </form>
  <!-- END LOGIN FORM -->
</div>
<!-- END LOGIN -->
</body>
<!-- END BODY -->
</html>
