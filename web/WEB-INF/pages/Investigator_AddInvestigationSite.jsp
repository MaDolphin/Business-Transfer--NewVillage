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
    <link href="style-responsive.css" rel="stylesheet" type="text/css"/>
    <link href="css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
    <link href="css/uniform.default.css" rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
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
                        现场勘查信息：
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
                        <li><a href="#">填写现场勘查信息</a></li>
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
                                    <form action="Investigator_AddInvestigationSite.action" target="rightFrame"
                                          method="post" class="form-horizontal">
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group ">
                                                    <label class="control-label">新装单号</label>
                                                    <div class="controls">
                                                        <select name="investigationSite.newId" style="width: 320px;height: 34px">
                                                            <option value="" selected>新装单号...</option>
                                                            <c:forEach items="${sessionScope.InvestigationWorkListByEmpID}" var="inves">
                                                                <option value=${inves.newId}>${inves.newId}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group ">
                                                    <label class="control-label">核定容量</label>
                                                    <div class="controls">
                                                        <input type="text" name="investigationSite.appCapacity"
                                                               placeholder="" class="m-wrap large"
                                                               style="width: 320px;height: 34px"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group ">
                                                    <label class="control-label">供电方式</label>
                                                    <div class="controls">
                                                        <input type="text" name="investigationSite.supplyMode"
                                                               placeholder="" class="m-wrap large"
                                                               style="width: 320px;height: 34px"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group ">
                                                    <label class="control-label">电压等级</label>
                                                    <div class="controls">
                                                        <input type="text" name="investigationSite.voltageLevel"
                                                               placeholder="" class="m-wrap large"
                                                               style="width: 320px;height: 34px"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group ">
                                                    <label class="control-label">供电单位</label>
                                                    <div class="controls">
                                                        <input type="text" name="investigationSite.powerComp"
                                                               placeholder="" class="m-wrap large"
                                                               style="width: 320px;height: 34px"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group ">
                                                    <label class="control-label">勘查情况</label>
                                                    <div class="controls">
                                                        <textarea type="text" name="investigationSite.invesSituation"
                                                                  placeholder="" class="m-wrap large"
                                                                  style="width: 320px;height: 150px">

                                                        </textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-actions">
                                            <button type="submit" class="btn blue"><i class="icon-ok"></i>保存</button>
                                            <button type="reset" class="btn">重置</button>
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
<script src="media/js/app.js"></script>
<script>
    jQuery(document).ready(function () {
        // initiate layout and plugins
        App.init();
    });
</script>
<!-- END JAVASCRIPTS -->
<script type="text/javascript">  var _gaq = _gaq || [];
_gaq.push(['_setAccount', 'UA-37564768-1']);
_gaq.push(['_setDomainName', 'keenthemes.com']);
_gaq.push(['_setAllowLinker', true]);
_gaq.push(['_trackPageview']);
(function () {
    var ga = document.createElement('script');
    ga.type = 'text/javascript';
    ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';
    var s = document.getElementsByTagName('script')[0];
    s.parentNode.insertBefore(ga, s);
})();</script>
</body>
<!-- END BODY -->
</html>
