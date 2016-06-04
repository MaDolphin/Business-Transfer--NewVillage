<%--
  Created by IntelliJ IDEA.
  User: Brown
  Date: 2016/6/3
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html style="margin-top: 10px">
<!-- BEGIN HEAD -->
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
    <link href="css/jquery.gritter.css" rel="stylesheet" type="text/css"/>
    <link href="css/daterangepicker.css" rel="stylesheet" type="text/css"/>
    <link href="css/fullcalendar.css" rel="stylesheet" type="text/css"/>
    <link href="css/jqvmap.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="css/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- END PAGE LEVEL STYLES -->
    <link rel="shortcut icon" href="images/favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body style="background-color: #3d3d3d;width: 225px">
<!-- BEGIN HEADER -->
<!-- END HEADER -->
<!-- BEGIN CONTAINER -->
<div class="page-container">
    <!-- BEGIN SIDEBAR -->
    <div class="page-sidebar nav-collapse collapse">
        <!-- BEGIN SIDEBAR MENU -->
        <ul class="page-sidebar-menu">
            <li>
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                <div class="sidebar-toggler hidden-phone"></div>
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
            </li>
            <li class="start active ">
                <a href="main.action" target="rightFrame">
                    <i class="icon-home"></i>
                    <span class="title">主页</span>
                    <span class="selected"></span>
                </a>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-file-text"></i>
                    <span class="title">小区新增申请</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="CounterShowNewVillage.action" target="rightFrame">新装信息管理</a>
                    </li>
                    <li>
                        <a href="CounterAddNewVillage.action" target="rightFrame">填写新增申请</a>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">勘查派工</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="InvestigatorShowInvestigationWork.action" target="rightFrame">勘查派工信息管理</a>
                    </li>
                    <li>
                        <a href="InvestigatorAddInvestigationSite.action" target="rightFrame">填写现场勘查信息</a>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">电源方案制定</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="PlanGroupShowPowerDesign.action" target="rightFrame">方案信息管理</a>
                    </li>
                    <li>
                        <a href="PlanGroupAddPowerDesign.action" target="rightFrame">制定电源方案</a>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">进程跟踪信息</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="Overseer_QueryAllScheduleCondition.action" target="rightFrame">查看全部进程</a>
                    </li>
                    <li>
                        <a href="Overseer_allPowerDesignReply.action" target="rightFrame">是否创建进程</a>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">电源方案审批</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="Approval_QueryPowerDesign.action" target="rightFrame">电源方案查看</a>
                    </li>
                    <%--<li>
                        <a href="PlanGroupAddPowerDesign.action" target="rightFrame">制定电源方案</a>
                    </li>--%>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">电源方案回复</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="Counter_QueryPowerDesign.action" target="rightFrame">电源方案查看</a>
                    </li>
                    <%--<li>
                        <a href="PlanGroupAddPowerDesign.action" target="rightFrame">制定电源方案</a>
                    </li>--%>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">设计文件审核</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="Approval_QueryAllDesignFileCheckMessage.action" target="rightFrame">查看审核结果</a>
                    </li>
                    <li>
                        <a href="Approval_QueryAllDesignFileCheckMessage.action" target="rightFrame">查看审核结果</a>
                    </li>
                    <li>
                        <a href="Approval_writeDesignFileCheckRecord.action" target="rightFrame">填写审核结果</a>
                    </li>
                    <li>
                        <a href="check.action" target="rightFrame">填写检查表</a>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">中间检查管理</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="CheckManage.action" target="rightFrame">信息管理</a>
                    </li>
                    <li>
                        <a href="check.action" target="rightFrame">填写检查表</a>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">竣工报验管理</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="InspectionManage.action" target="rightFrame">信息管理</a>
                    </li>
                    <li>
                        <a href="Inspect.action" target="rightFrame">填写报验表</a>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="icon-user"></i>
                    <span class="title">竣工验收管理</span>
                    <span class="arrow "></span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="CheckInfoManage.action" target="rightFrame">信息管理</a>
                    </li>
                    <li>
                        <a href="CheckInfo.action" target="rightFrame">填写验收资料信息表</a>
                    </li>
                </ul>
            </li>
        </ul>
        <!-- END SIDEBAR MENU -->
    </div>
    <!-- END SIDEBAR -->
    <!-- BEGIN PAGE -->
    <%--<div class="page-content">--%>
        <%--<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->--%>
        <%--<div id="portlet-config" class="modal hide">--%>
            <%--<div class="modal-header">--%>
                <%--<button data-dismiss="modal" class="close" type="button"></button>--%>
                <%--<h3>Widget Settings</h3>--%>
            <%--</div>--%>
            <%--<div class="modal-body">--%>
                <%--Widget settings form goes here--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->--%>
        <%--<!-- BEGIN PAGE CONTAINER-->--%>
        <%--<div class="container-fluid">--%>
            <%--<!-- BEGIN PAGE HEADER-->--%>
            <%--<div class="row-fluid">--%>
                <%--<div class="span12">--%>
                    <%--<!-- BEGIN PAGE TITLE & BREADCRUMB-->--%>
                    <%--<h3 class="page-title">--%>
                        <%--Dashboard--%>
                        <%--<small>statistics and more</small>--%>
                    <%--</h3>--%>
                    <%--<ul class="breadcrumb">--%>
                        <%--<li>--%>
                            <%--<i class="icon-home"></i>--%>
                            <%--<a href="index.html">主页</a>--%>
                            <%--<i class="icon-angle-right"></i>--%>
                        <%--</li>--%>
                        <%--<li><a href="#">系统状态</a></li>--%>
                        <%--<li class="pull-right no-text-shadow">--%>
                            <%--<div id="dashboard-report-range"--%>
                                 <%--class="dashboard-date-range tooltips no-tooltip-on-touch-device responsive"--%>
                                 <%--data-tablet="" data-desktop="tooltips" data-placement="top"--%>
                                 <%--data-original-title="Change dashboard date range">--%>
                                <%--<i class="icon-calendar"></i>--%>
                                <%--<span></span>--%>
                                <%--<i class="icon-angle-down"></i>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                    <%--</ul>--%>
                    <%--<!-- END PAGE TITLE & BREADCRUMB-->--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<!-- END PAGE HEADER-->--%>
            <%--<div id="dashboard">--%>
                <%--<!-- BEGIN DASHBOARD STATS -->--%>
                <%--<div class="row-fluid">--%>
                    <%--<div class="span3 responsive" data-tablet="span6" data-desktop="span3">--%>
                        <%--<div class="dashboard-stat blue">--%>
                            <%--<div class="visual">--%>
                                <%--<i class="icon-comments"></i>--%>
                            <%--</div>--%>
                            <%--<div class="details">--%>
                                <%--<div class="number">--%>
                                    <%--1349--%>
                                <%--</div>--%>
                                <%--<div class="desc">--%>
                                    <%--New Feedbacks--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<a class="more" href="#">--%>
                                <%--View more <i class="m-icon-swapright m-icon-white"></i>--%>
                            <%--</a>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="span3 responsive" data-tablet="span6" data-desktop="span3">--%>
                        <%--<div class="dashboard-stat green">--%>
                            <%--<div class="visual">--%>
                                <%--<i class="icon-shopping-cart"></i>--%>
                            <%--</div>--%>
                            <%--<div class="details">--%>
                                <%--<div class="number">549</div>--%>
                                <%--<div class="desc">New Orders</div>--%>
                            <%--</div>--%>
                            <%--<a class="more" href="#">--%>
                                <%--View more <i class="m-icon-swapright m-icon-white"></i>--%>
                            <%--</a>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="span3 responsive" data-tablet="span6  fix-offset" data-desktop="span3">--%>
                        <%--<div class="dashboard-stat purple">--%>
                            <%--<div class="visual">--%>
                                <%--<i class="icon-globe"></i>--%>
                            <%--</div>--%>
                            <%--<div class="details">--%>
                                <%--<div class="number">+89%</div>--%>
                                <%--<div class="desc">Brand Popularity</div>--%>
                            <%--</div>--%>
                            <%--<a class="more" href="#">--%>
                                <%--View more <i class="m-icon-swapright m-icon-white"></i>--%>
                            <%--</a>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="span3 responsive" data-tablet="span6" data-desktop="span3">--%>
                        <%--<div class="dashboard-stat yellow">--%>
                            <%--<div class="visual">--%>
                                <%--<i class="icon-bar-chart"></i>--%>
                            <%--</div>--%>
                            <%--<div class="details">--%>
                                <%--<div class="number">12,5M$</div>--%>
                                <%--<div class="desc">Total Profit</div>--%>
                            <%--</div>--%>
                            <%--<a class="more" href="#">--%>
                                <%--View more <i class="m-icon-swapright m-icon-white"></i>--%>
                            <%--</a>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<!-- END DASHBOARD STATS -->--%>
                <%--<div class="clearfix"></div>--%>
                <%--<div class="row-fluid">--%>
                    <%--<div class="span6">--%>
                        <%--<!-- BEGIN PORTLET-->--%>
                        <%--<div class="portlet solid bordered light-grey">--%>
                            <%--<div class="portlet-title">--%>
                                <%--<div class="caption"><i class="icon-bar-chart"></i>Site Visits</div>--%>
                                <%--<div class="tools">--%>
                                    <%--<div class="btn-group pull-right" data-toggle="buttons-radio">--%>
                                        <%--<a href="" class="btn mini">Users</a>--%>
                                        <%--<a href="" class="btn mini active">Feedbacks</a>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<div class="portlet-body">--%>
                                <%--<div id="site_statistics_loading">--%>
                                    <%--<img src="images/loading.gif" alt="loading"/>--%>
                                <%--</div>--%>
                                <%--<div id="site_statistics_content" class="hide">--%>
                                    <%--<div id="site_statistics" class="chart"></div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<!-- END PORTLET-->--%>
                    <%--</div>--%>
                    <%--<div class="span6">--%>
                        <%--<!-- BEGIN PORTLET-->--%>
                        <%--<div class="portlet solid light-grey bordered">--%>
                            <%--<div class="portlet-title">--%>
                                <%--<div class="caption"><i class="icon-bullhorn"></i>Activities</div>--%>
                                <%--<div class="tools">--%>
                                    <%--<div class="btn-group pull-right" data-toggle="buttons-radio">--%>
                                        <%--<a href="" class="btn blue mini active">Users</a>--%>
                                        <%--<a href="" class="btn blue mini">Orders</a>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<div class="portlet-body">--%>
                                <%--<div id="site_activities_loading">--%>
                                    <%--<img src="images/loading.gif" alt="loading"/>--%>
                                <%--</div>--%>
                                <%--<div id="site_activities_content" class="hide">--%>
                                    <%--<div id="site_activities" style="height:100px;"></div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<!-- END PORTLET-->--%>
                        <%--<!-- BEGIN PORTLET-->--%>
                        <%--<div class="portlet solid bordered light-grey">--%>
                            <%--<div class="portlet-title">--%>
                                <%--<div class="caption"><i class="icon-signal"></i>Server Load</div>--%>
                                <%--<div class="tools">--%>
                                    <%--<div class="btn-group pull-right" data-toggle="buttons-radio">--%>
                                        <%--<a href="" class="btn red mini active">--%>
                                            <%--<span class="hidden-phone">Database</span>--%>
                                            <%--<span class="visible-phone">DB</span></a>--%>
                                        <%--<a href="" class="btn red mini">Web</a>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<div class="portlet-body">--%>
                                <%--<div id="load_statistics_loading">--%>
                                    <%--<img src="images/loading.gif" alt="loading"/>--%>
                                <%--</div>--%>
                                <%--<div id="load_statistics_content" class="hide">--%>
                                    <%--<div id="load_statistics" style="height:108px;"></div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<!-- END PORTLET-->--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<!-- END PAGE CONTAINER-->--%>
    <%--</div>--%>
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
<script src="js/jquery.uniform.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="js/jquery.vmap.js" type="text/javascript"></script>
<script src="js/jquery.vmap.russia.js" type="text/javascript"></script>
<script src="js/jquery.vmap.world.js" type="text/javascript"></script>
<script src="js/jquery.vmap.europe.js" type="text/javascript"></script>
<script src="js/jquery.vmap.germany.js" type="text/javascript"></script>
<script src="js/jquery.vmap.usa.js" type="text/javascript"></script>
<script src="js/jquery.vmap.sampledata.js" type="text/javascript"></script>
<script src="js/jquery.flot.js" type="text/javascript"></script>
<script src="js/jquery.flot.resize.js" type="text/javascript"></script>
<script src="js/jquery.pulsate.min.js" type="text/javascript"></script>
<script src="js/date.js" type="text/javascript"></script>
<script src="js/daterangepicker.js" type="text/javascript"></script>
<script src="js/jquery.gritter.js" type="text/javascript"></script>
<script src="js/fullcalendar.min.js" type="text/javascript"></script>
<script src="js/jquery.easy-pie-chart.js" type="text/javascript"></script>
<script src="js/jquery.sparkline.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="js/app.js" type="text/javascript"></script>
<script src="js/index.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
    jQuery(document).ready(function () {
        App.init(); // initlayout and core plugins
        Index.init();
        Index.initJQVMAP(); // init index page's custom scripts
        Index.initCalendar(); // init index page's custom scripts
        Index.initCharts(); // init index page's custom scripts
        Index.initChat();
        Index.initMiniCharts();
        Index.initDashboardDaterange();
        Index.initIntro();
    });
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>

