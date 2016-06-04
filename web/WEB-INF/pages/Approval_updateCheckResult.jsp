<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        填写文件审核结果：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="index.html">Home</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">文件审核</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">更改文件审核结果</a></li>
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
                                    <form action="Approval_updateDesignFileCheckRecord.action" target="rightFrame" class="form-horizontal" >
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">设计文件编号 </label>
                                                    <div class="controls">
                                                        <input type="text" name="designFileId" value="${sessionScope.designFileCheck.designFileId}" class="m-wrap large" style="width: 320px;height: 34px" readonly/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">设计单位</label>
                                                    <div class="controls">
                                                        <input type="text" name="designUnit" value="${sessionScope.designFileCheck.designUnit}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">设计资质</label>
                                                    <div class="controls">
                                                        <input type="text" name="designLevel" value="${sessionScope.designFileCheck.designLevel}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">报送单位</label>
                                                    <div class="controls">
                                                        <input type="text" name="submittedUnit" value="${sessionScope.designFileCheck.submittedUnit}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">报送日期 </label>
                                                    <div class="controls">
                                                        <input type="text" name="submittedTime" value="${sessionScope.designFileCheck.submittedTime}" class="m-wrap large" style="width: 320px;height: 34px" readonly/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">接收人</label>
                                                    <div class="controls">
                                                        <input type="text" name="accPerId" value="${sessionScope.designFileCheck.accPerId}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">审核人 </label>
                                                    <div class="controls">
                                                        <input type="text" name="checkPerId" value="${sessionScope.designFileCheck.checkPerId}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">审核日期</label>
                                                    <div class="controls">
                                                        <input type="text" name="checkTime" readonly value="${sessionScope.designFileCheck.checkTime}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">土建图纸份数 </label>
                                                    <div class="controls">
                                                        <input type="text" name="civilDrawingNum" value="${sessionScope.designFileCheck.civilDrawingNum}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">线路图纸份数</label>
                                                    <div class="controls">
                                                        <input type="text" name="lineDrawingNum" value="${sessionScope.designFileCheck.lineDrawingNum}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">变电图纸份数 </label>
                                                    <div class="controls">
                                                        <input type="text" name="eleDrawingNum" value="${sessionScope.designFileCheck.eleDrawingNum}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">审核意见</label>
                                                    <div class="controls">
                                                        <select class="large m-wrap" tabindex="1" name="checkOpinion">

                                                            <c:if test="${sessionScope.designFileCheck.checkOpinion=='通过'}">
                                                                <option value="通过">通过</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.designFileCheck.checkOpinion=='未通过'}">
                                                                <option value="未通过">未通过</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.designFileCheck.checkOpinion=='通过'}">
                                                                <option value="未通过">未通过</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.designFileCheck.checkOpinion=='未通过'}">
                                                                <option value="通过">通过</option>
                                                            </c:if>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">登记人 </label>
                                                    <div class="controls">
                                                        <input type="text" name="registerPerId" value="${sessionScope.designFileCheck.registerPerId}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">登记时间</label>
                                                    <div class="controls">
                                                        <input type="text" name="registerTime" readonly value="${sessionScope.designFileCheck.registerTime}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">新装单号 </label>
                                                    <div class="controls">
                                                        <input type="text" name="newId" value="${sessionScope.designFileCheck.newId}" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">状态</label>
                                                    <div class="controls">
                                                        <select class="large m-wrap" tabindex="1"  name="status">
                                                            <c:if test="${sessionScope.designFileCheck.status=='1'}">
                                                                <option value="1">审核未结束</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.designFileCheck.status=='2'}">
                                                                <option value="2">审核结束</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.designFileCheck.status=='1'}">
                                                                <option value="2">审核结束</option>
                                                            </c:if>
                                                            <c:if test="${sessionScope.designFileCheck.status=='2'}">
                                                                <option value="1">审核未结束</option>
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