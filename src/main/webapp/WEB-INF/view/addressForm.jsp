<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link type="text/css" href="<c:url value="/resources/css/saveCustomer.css" />" rel="stylesheet">
    <title>Add customer</title>
</head>
<body>
<div class="container d-flex justify-content-center">
    <div class="row">
        <div class="col-12">
            <div class="d-flex justify-content-center">
                <h1>Add new Customer</h1>
            </div>
            <div>
                <form:form action="saveAddress" modelAttribute="registeredAddress" method="post">

                    <!-- saving customer id to not lose it-->
                    <form:hidden path="id"/>

                    <table class="table">
                        <tbody>
                        <tr>
                            <td><label>Contry</label></td>
                            <td><form:input path="contry" required="true"/></td>
                        </tr>
                        <tr>
                            <td><label>Region</label></td>
                            <td><form:input path="region" required="true"/></td>
                        </tr>
                        <tr>
                            <td><label>City</label></td>
                            <td><form:input path="city" required="true"/></td>
                        </tr>
                        <tr>
                            <td><label>Street</label></td>
                            <td><form:input path="street" required="true"/></td>
                        </tr><tr>
                            <td><label>House</label></td>
                            <td><form:input path="house" required="true"/></td>
                        </tr>
                        <tr>
                            <td><label>Flat</label></td>
                            <td><form:input path="flat" required="true"/></td>
                        </tr>
                        <tr>
                            <td class="saveCustomer" colspan="2">
                                <input class="btn btn-light rounded m-2 border" type="submit" value="save">
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </form:form>
            </div>
            <div class="d-flex justify-content-center">
                <a type="button" class="btn btn-light border" href="<c:url value="/customer/list"/>">To main page</a>
            </div>
        </div>

    </div>

</div>

<script src="<c:url value="/resources/js/jquery.min.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/popper.min.js" />" type="text/javascript"></script>
</body>
</html>