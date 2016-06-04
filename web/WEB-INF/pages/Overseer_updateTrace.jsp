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
                        新建进程进度跟踪记录：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="index.html">Home</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">进度跟踪</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">新建进程进度跟踪记录</a></li>
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
                                    <form action="Overseer_updateTraceTableRecord.action" class="form-horizontal" >
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">进度跟踪记录编号 </label>
                                                    <div class="controls">
                                                        <input type="text" name="traceId" value="${sessionScope.traceTable.traceId}" class="m-wrap large" style="width: 320px;height: 34px" readonly/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">供电工程的负责人</label>
                                                    <div class="controls">
                                                        <input type="text" name="responsiblePerId" value="${sessionScope.traceTable.responsiblePerId}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">供电工程负责单位</label>
                                                    <div class="controls">
                                                        <input type="text" name="responsibleUnit" value="${sessionScope.traceTable.responsibleUnit}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">供电工程监理单位</label>
                                                    <div class="controls">
                                                        <input type="text" name="supervisorUnit" value="${sessionScope.traceTable.supervisorUnit}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">立项设计结果信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="proDesignResult"   rows="4">${sessionScope.traceTable.proDesignResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">设计文件审核信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="proFileResult"  rows="4">${sessionScope.traceTable.proFileResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">工程预算结果信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="budgetResult" rows="4">${sessionScope.traceTable.budgetResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">工程费用收取信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="chargeResult" rows="4"> ${sessionScope.traceTable.chargeResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">设备供应单位信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="equipmentSupResult" rows="4"> ${sessionScope.traceTable.equipmentSupResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">施工单位结果信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="constructionResult"  rows="4">${sessionScope.traceTable.constructionResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">中间检查结果信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="midCheckResult" rows="4">${sessionScope.traceTable.midCheckResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">竣工验收结果信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="finalInsResult" rows="4">${sessionScope.traceTable.finalInsResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">工程决算结果信息</label>
                                                    <div class="controls">
                                                        <textarea class="large m-wrap" name="proAccountsResult"  rows="4">${sessionScope.traceTable.proAccountsResult}</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group">
                                                    <label class="control-label">跟踪状态</label>
                                                    <div class="controls">
                                                        <select class="large m-wrap" tabindex="1" name="status">
                                                            <c:if test="${sessionScope.traceTable.status=='1'}">
                                                                <option value="1">未完成跟踪</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.traceTable.status=='2'}">
                                                                <option value="2">完成跟踪</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.traceTable.status=='1'}">
                                                                <option value="2">完成跟踪</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.traceTable.status=='2'}">
                                                                <option value="1">未完成跟踪</option>
                                                            </c:if>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-actions">
                                            <button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
                                            <button type="button" class="btn">Cancel</button>
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