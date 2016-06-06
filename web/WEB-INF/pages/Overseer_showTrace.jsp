<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        进程进度跟踪记录：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="#">Home</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">进度跟踪</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">全部进程进度跟踪记录</a></li>
                    </ul>
                </div>
            </div>
            <!-- END PAGE HEADER-->
            <!-- BEGIN EXAMPLE TABLE PORTLET-->
            <div class="portlet-body">
                <table class="table table-striped table-bordered table-hover" id="table_showTrace">
                    <thead>
                    <tr>
                        <th style="width:8px;">
                            <input type="checkbox" class="group-checkable" data-set="#table_showTrace .checkboxes"/>
                        </th>
                        <th>跟踪记录编号</th>
                        <th class="hidden-480">创建时间</th>
                        <th class="hidden-480">新装单号</th>
                        <th class="hidden-480">状态</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${traceTables}" var="traceTables">
                        <tr class="odd gradeX">
                            <td><input type="checkbox" class="checkboxes" value="1"/></td>
                            <td class="hidden-480">${traceTables.traceId}</td>
                            <td class="hidden-480">${traceTables.createTime}</td>
                            <td class="hidden-480">${traceTables.newId}</td>
                            <c:if test="${traceTables.status == '1'}">
                                <td><span class="label label-warning">未完成跟踪</span></td>
                            </c:if>
                            <c:if test="${traceTables.status == '2'}">
                                <td><span class="label label-info">完成跟踪</span></td>
                            </c:if>
                            <td class="hidden-480">
                                <a href="Overseer_queryTraceTableRecordByID.action?traceId=${traceTables.traceId}" target="rightFrame" class="label label-success">查看</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <!-- END EXAMPLE TABLE PORTLET-->

        </div>
        <!-- END PAGE CONTAINER-->
    </div>
    <!-- END PAGE -->
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
<script src="js/jquery.uniform.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="js/select2.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.js"></script>
<script type="text/javascript" src="js/DT_bootstrap.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="js/app.js"></script>
<script src="js/table-managed.js"></script>
<script>
    jQuery(document).ready(function () {
        App.init();
        TableManaged.init();
    });
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>