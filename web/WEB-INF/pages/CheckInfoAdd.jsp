<%--
  Created by IntelliJ IDEA.
  User: Brown
  Date: 2016/6/4
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Brown
  Date: 2016/6/4
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/style-metro.css" rel="stylesheet" type="text/css"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link href="style-responsive.css" rel="stylesheet" type="text/css"/>
    <link href="css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
    <link href="css/uniform.default.css" rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
    <link rel="shortcut icon" href="images/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body style="background-color: white">
<!-- BEGIN CONTAINER -->
<div class="page-container row-fluid">
    <!-- BEGIN PAGE -->
    <div class="page-content">
        <!-- BEGIN PAGE CONTAINER-->
        <div class="container-fluid">
            <!-- BEGIN PAGE HEADER-->
            <div class="row-fluid">
                <div class="span12">
                    <h3 class="page-title">
                        竣工验收信息记录：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="index.html">Home</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">信息管理</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">填写验收资料信息表</a></li>
                    </ul>
                </div>
            </div>
            <!-- END PAGE HEADER-->
            <!-- BEGIN PAGE CONTENT-->
            <div class="row-fluid">
                <div class="span12">
                    <div class="portlet-body form" style="margin-top: 40px;">
                        <div class="tabbable portlet-tabs">
                            <div class="tab-content">
                                <div class="tab-pane active" id="portlet_tab1" style="margin-left: -50px">
                                    <!-- BEGIN FORM-->
                                    <form action="CheckInfo_add.action" target="rightFrame" method="post" class="form-horizontal" >

                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">验收次数</label>
                                                    <div class="controls">
                                                        <input type="text" name="checkNum" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>



                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">验收时间</label>
                                                    <div class="controls">
                                                        <input type="date" name="checkInfoTime" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>




                                        </div>
                                        <div class="row-fluid">

                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">是否合格 </label>
                                                    <div class="controls">
                                                        <select name="qualified" id="qualified">
                                                            <option value="合格" selected>合格</option>
                                                            <option value="不合格" >不合格</option>

                                                        </select>
                                                    </div>

                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">状态 </label>
                                                    <div class="controls">
                                                        <select name="inspection.status" id="status">
                                                            <option value="作废" >作废</option>
                                                            <option value="审批" >审批</option>
                                                            <option value="未审批" selected>未审批</option>

                                                        </select>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>




                                        <div class="form-actions">
                                            <button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
                                            <button type="reset" class="btn">Cancel</button>
                                        </div>
                                    </form>
                                    <!-- END FORM-->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END PAGE CONTENT-->
        </div>
        <!-- END PAGE CONTAINER-->
    </div>
    <!-- END PAGE -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<script src="js/jquery-1.10.1.min.js" type="text/javascript"></script>
<script src="js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!--[if lt IE 9]>
<script src="js/excanvas.min.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->
<script src="js/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="js/jquery.blockui.min.js" type="text/javascript"></script>
<script src="js/jquery.cookie.min.js" type="text/javascript"></script>
<script src="js/jquery.uniform.min.js" type="text/javascript" ></script>
<!-- END CORE PLUGINS -->
<script src="media/js/app.js"></script>
<script>
    jQuery(document).ready(function() {
        // initiate layout and plugins
        App.init();
    });
</script>
<!-- END JAVASCRIPTS -->
<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>
<!-- END BODY -->
</html>

