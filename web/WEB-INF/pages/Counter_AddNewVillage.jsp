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
                        小区新装申请：
                    </h3>
                    <ul class="breadcrumb">
                        <li>
                            <i class="icon-home"></i>
                            <a href="">主页</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li>
                            <a href="#">小区新增申请</a>
                            <span class="icon-angle-right"></span>
                        </li>
                        <li><a href="#">填写小区新装申请</a></li>
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
                                    <form action="Counter_AddNewVillage.action" target="rightFrame" method="post" class="form-horizontal" >
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">用户名称</label>
                                                    <div class="controls">
                                                        <input type="text" name="newVillage.vilName" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">联系人</label>
                                                    <div class="controls">
                                                        <input type="text" name="newVillage.userName" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">行政区域</label>
                                                    <div class="controls">
                                                        <input type="text" name="newVillage.adminArea" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">证件类型</label>
                                                    <div class="controls">
                                                        <select name="newVillage.userPtype" id="userPtype" style="width: 320px;height: 34px">
                                                            <option value="0" selected>身份证</option>
                                                            <option value="1" >军官证</option>
                                                            <option value="2" >护照</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">用电地址</label>
                                                    <div class="controls">
                                                        <input type="text" name="newVillage.eleAddress" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">证件号</label>
                                                    <div class="controls">
                                                        <input type="text" name="newVillage.userPid" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">用电类别</label>
                                                    <div class="controls" >
                                                        <select name="newVillage.eleType" id="eleType" style="width: 320px;height: 34px">
                                                            <option value="0" selected>居住</option>
                                                            <option value="1" >商业</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">联系方式</label>
                                                    <div class="controls">
                                                        <input type="text" name="newVillage.userTel" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">用电容量</label>
                                                    <div class="controls">
                                                        <select name="newVillage.eleCapacity" id="eleCapacity" style="width: 320px;height: 34px">
                                                            <option value="0" selected>300M</option>
                                                            <option value="1" >400M</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span6 ">
                                                <div class="control-group " >
                                                    <label class="control-label">居民数量</label>
                                                    <div class="controls">
                                                        <input type="text" name="newVillage.residentNum" placeholder="" class="m-wrap large" style="width: 320px;height: 34px" />
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
