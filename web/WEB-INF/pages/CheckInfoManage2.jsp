<%--
  Created by IntelliJ IDEA.
  User: Brown
  Date: 2016/6/4
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
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
    <link rel="stylesheet" type="text/css" href="css/select2_metro.css"/>
    <link rel="stylesheet" href="css/DT_bootstrap.css"/>
    <!-- END PAGE LEVEL STYLES -->
    <link rel="shortcut icon" href="images/favicon.ico"/>
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
                        中间检查信息记录：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="">主页</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">信息管理</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">信息查看</a></li>
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
                                <th>检查信息单号</th>
                                <th class="hidden-480">新装单号</th>
                                <th class="hidden-480">检查人</th>
                                <th class="hidden-480">检查日期</th>
                                <th class="hidden-480">状态</th>
                                <th class="hidden-480">操作</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${Inspectlistion}" var="Inspectlist">
                                <tr class="odd gradeX">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td class="hidden-480">${Inspectlist.checkId}</td>
                                    <td class="hidden-480">${Inspectlist.newId}</td>
                                    <td class="hidden-480">${Inspectlist.checkPerId}</td>
                                    <td class="hidden-480">${Inspectlist.checkTime}</td>
                                    <c:if test="${Inspectlist.status == '0'}">
                                        <td><span class="label label-warning">未审批</span></td>
                                    </c:if>
                                    <c:if test="${Inspectlist.status == '1'}">
                                        <td><span class="label label-info">已审批</span></td>
                                    </c:if>
                                    <td class="hidden-480">
                                        <c:if test="${Inspectlist.status =='0'}">
                                            <a href="javascript:if(confirm('确认填写报验信息?'))window.location='Inspect.action?cid=${Inspectlist.checkId}&nid=${Inspectlist.newId}'" class="btn btn-warning btn-sm"><i class="icon-trash"></i> 填写信息</a>
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
