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
                        勘查派工信息列表：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="">主页</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">勘查派工</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">勘查派工信息管理</a></li>
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
                                <th style="width:8px;"><input type="checkbox" class="group-checkable"
                                                              data-set="#table_InvestigationWork .checkboxes"/></th>
                                <th>勘查派工单号</th>
                                <th class="hidden-480">新装单号</th>
                                <th class="hidden-480">派工时间</th>
                                <th class="hidden-480">创建时间</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${sessionScope.teacherList}" var="tea">
                                <tr class="odd gradeX">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td class="hidden-480">${tea.teaId}</td>
                                    <td class="hidden-480">${tea.teaName}</td>
                                    <td class="center hidden-480">${tea.teaEmail}</td>
                                    <c:if test="${tea.teaStatus == 1}">
                                        <td><span class="label label-success">正在使用</span></td>
                                    </c:if>
                                    <c:if test="${tea.teaStatus == 0}">
                                        <td><span class="label label-info">已注销</span></td>
                                    </c:if>
                                    <td class="hidden-480">

                                        <c:if test="${tea.teaStatus == 1}">
                                            <a href="adminShowTeacher.action?teaId=${tea.teaId}"
                                               class="btn mini blue"><i class="icon-share"></i> 查看</a>
                                            <a href="adminEditTeacher.action?teaId=${tea.teaId}"
                                               class="btn mini purple"><i class="icon-edit"></i> 修改</a>
                                            <a href="javascript:if(confirm('确认重置密码吗?'))window.location='resetPasswordTeacher.action?teaId=${tea.teaId}'"
                                               class="btn mini red"><i class="icon-edit"></i> 重置密码</a>
                                            <a href="javascript:if(confirm('确认注销该用户吗?'))window.location='cancelTeacher.action?teaId=${tea.teaId}'"
                                               class="btn mini black"><i class="icon-trash"></i> 注销</a>
                                        </c:if>
                                        <c:if test="${tea.teaStatus == 0}">
                                            <a href="javascript:if(confirm('确认启用该用户吗?'))window.location='passTeacher.action?teaId=${tea.teaId}'"
                                               class="btn mini blue"><i class="icon-edit"></i> 启用</a>
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
    <!-- BEGIN FOOTER -->
    <!-- END FOOTER -->
    <!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
    <!-- BEGIN CORE PLUGINS -->
    <script src="js/backstage/jquery-1.10.1.min.js" type="text/javascript"></script>
    <script src="js/backstage/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
    <script src="js/backstage/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
    <script src="js/backstage/bootstrap.min.js" type="text/javascript"></script>
    <!--[if lt IE 9]>
    <script src="js/backstage/excanvas.min.js"></script>
    <script src="js/backstage/respond.min.js"></script>
    <![endif]-->
    <script src="js/backstage/jquery.slimscroll.min.js" type="text/javascript"></script>
    <script src="js/backstage/jquery.blockui.min.js" type="text/javascript"></script>
    <script src="js/backstage/jquery.cookie.min.js" type="text/javascript"></script>
    <script src="js/backstage/jquery.uniform.min.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <script type="text/javascript" src="js/backstage/select2.min.js"></script>
    <script type="text/javascript" src="js/backstage/jquery.dataTables.js"></script>
    <script type="text/javascript" src="js/backstage/DT_bootstrap.js"></script>
    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN PAGE LEVEL SCRIPTS -->
    <script src="js/backstage/app.js"></script>
    <script src="js/backstage/table-managed.js"></script>
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
