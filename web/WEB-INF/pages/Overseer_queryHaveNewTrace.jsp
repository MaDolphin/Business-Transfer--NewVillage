<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        勘查派工信息列表：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="">主页</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">进程跟踪</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">查看是否需创建新进程</a></li>
                    </ul>
                </div>
            </div>
            <!-- END PAGE HEADER-->
            <!-- BEGIN PAGE CONTENT-->
            <div class="row-fluid">
                <div class="span12">
                    <!-- BEGIN EXAMPLE TABLE PORTLET-->
                    <div class="portlet-body">
                        <table class="table table-striped table-bordered table-hover" id="table_InvestigationWork">
                            <thead>
                            <tr>
                                <th style="width:8px;">
                                    <input type="checkbox" class="group-checkable" data-set="#table_InvestigationWork .checkboxes"/>
                                </th>
                                <th>答复单号</th>
                                <th class="hidden-480">答复人</th>
                                <th class="hidden-480">答复时间</th>
                                <th class="hidden-480">新装单号</th>
                                <th class="hidden-480">状态</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${powerDesignReplys}" var="powerDesignReply">
                                <tr class="odd gradeX">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td class="hidden-480">${powerDesignReply.replyId}</td>
                                    <td class="hidden-480">${powerDesignReply.replyPerId}</td>
                                    <td class="hidden-480">${powerDesignReply.replyTime}</td>
                                    <td class="hidden-480">${powerDesignReply.newId}</td>
                                    <c:if test="${powerDesignReply.status == '1'}">
                                        <td><span class="label label-warning">完成回复</span></td>
                                    </c:if>
                                    <c:if test="${powerDesignReply.status == '2'}">
                                        <td><span class="label label-info">完成记录</span></td>
                                    </c:if>
                                    <td class="hidden-480">
                                        <c:if test="${powerDesignReply.status =='1'}">
                                            <a href="javascript:if(confirm('确认完成记录该回复信息?'))window.location='Overseer_updatePowerDesignReplyStatus.action?replyId=${powerDesignReply.replyId}'" class="label label-success">记录完成</a>
                                            <a href="javascript:if(confirm('确认创建新进度跟踪记录?'))window.location='Overseer_addTraceTableRecord.action?newId=${powerDesignReply.newId}'" class="label label-info">创建进程</a>
                                        </c:if>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <!-- END EXAMPLE TABLE PORTLET-->
                </div>
            </div>
            <!-- END PAGE CONTAINER-->
        </div>
        <!-- END PAGE -->
    </div>
</div>
<!-- END CONTAINER -->



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