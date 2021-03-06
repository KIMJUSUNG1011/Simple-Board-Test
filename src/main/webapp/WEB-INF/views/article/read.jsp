<%--
  Created by IntelliJ IDEA.
  User: kjs
  Date: 2021/07/20
  Time: 8:40 오후
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%@ page isELIgnored="false" %>
<%@ include file="../include/head.jsp" %>

<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <%@ include file="../include/main_header.jsp" %>

    <!-- Left side column. contains the logo and sidebar -->
    <%@ include file="../include/left_column.jsp"%>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Page Header
                <small>Optional description</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
                <li class="active">Here</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content container-fluid">
            <div class="col-lg-12">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">글 제목 : ${article.title}</h3>
                    </div>
                    <div class="box-body" style="height: 700px">
                        ${article.content}
                    </div>
                    <div class="box-footer">
                        <div class="user-block">
                            <img class="img-circle img-bordered-sm" src="${path}/article/dist/img/user1-128x128.jpg" alt="user image">
                            <span class="username">
                            <a href="#">${article.writer}</a>
                        </span>
                            <span class="description"><fmt:formatDate pattern="yyyy-MM-dd a HH:mm" value="${article.regDate}"/></span>
                        </div>
                    </div>
                    <div class="box-footer">
                        <form role="form" method="post">
                            <input type="hidden" name="articleNo" value="${article.articleNo}">
                        </form>
                        <button type="submit" class="btn btn-primary listBtn"><i class="fa fa-list"></i>목록</button>
                        <div class="pull-right">
                            <button type="submit" class="btn btn-warning modBtn"><i class="fa fa-edit"></i>수정</button>
                            <button type="submit" class="btn btn-danger delBtn"><i class="fa fa-trash"></i>삭제</button>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <%@ include file="../include/main_footer.jsp"%>

</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->
<%@ include file="../include/plugin_js.jsp"%>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
<script type="text/javascript">
    $(document).ready(function() {
        let formObj = $("form[role='form']");
        $(".modBtn").on("click", function () {
            formObj.attr("action", "/article/modify");
            formObj.attr("method", "get");
            formObj.submit();
        });
        $(".delBtn").on("click", function () {
            formObj.attr("action", "/article/remove");
            formObj.submit();
        });
        $(".listBtn").on("click", function () {
            self.location = "/article/list"
        });
    });
</script>
</html>
