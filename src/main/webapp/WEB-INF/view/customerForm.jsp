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
<div class="container flex-column d-flex justify-content-center">
    <div class="p-2">
        <div class="d-flex justify-content-center">
            <h1>Add new Customer</h1>
        </div>
    </div>
    <div class="p-2">

        <form action="saveCustomer" method="post">
            <div class="d-flex justify-content-center">
                <div class="p-2">
                    <table class="table">
                        <caption>Customer info</caption>

                        <tbody>
                        <tr>
                            <td><label>First name</label></td>
                            <td>
                                <spring:bind path="customer.firstName">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Last name</label></td>
                            <td>
                                <spring:bind path="customer.LastName">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Middle name</label></td>
                            <td>
                                <spring:bind path="customer.MiddleName">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Sex</label></td>
                            <td>
                                <spring:bind path="customer.Sex">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="p-2">
                    <table class="table">
                        <caption>Registered address info</caption>
                        <tbody>
                        <tr>
                            <td><label>Country</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regContry">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Region</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regRegion">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>City</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regCity">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Street</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regStreet">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>House</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regHouse">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>

                        <tr>
                            <td><label>Flat</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regFlat">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>

                        <tr>
                            <td><label>Created date</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regCreated">
                                    <input disabled name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>

                        <tr>
                            <td><label>Updated date</label></td>
                            <td>
                                <spring:bind path="registeredAddress.regModified">
                                    <input disabled name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="p-2">
                    <table class="table">
                        <caption>Actual address info</caption>
                        <tbody>
                        <tr>
                            <td><label>Country</label></td>
                            <td>
                                <spring:bind path="actualAddress.contry">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Region</label></td>
                            <td>
                                <spring:bind path="actualAddress.region">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>City</label></td>
                            <td>
                                <spring:bind path="actualAddress.city">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Street</label></td>
                            <td>
                                <spring:bind path="actualAddress.street">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>
                        <tr>
                            <td><label>House</label></td>
                            <td>
                                <spring:bind path="actualAddress.house">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>

                        <tr>
                            <td><label>Flat</label></td>
                            <td>
                                <spring:bind path="actualAddress.flat">
                                    <input required name="${status.expression}" value="${status.value}">
                                </spring:bind>
                            </td>
                        </tr>

                        <tr>
                            <td><label>Created date</label></td>
                            <td>
                                <spring:bind path="actualAddress.created">
                                    <input disabled name="${status.expression}" value="${status.value}"><br/>
                                </spring:bind>
                            </td>
                        </tr>

                        <tr>
                            <td><label>Updated date</label></td>
                            <td>
                                <spring:bind path="actualAddress.modified">
                                    <input disabled name="${status.expression}" value="${status.value}"><br/>
                                </spring:bind>
                            </td>
                        </tr>

                        </tbody>
                    </table>
                </div>
            </div>
            <div class="d-flex justify-content-center">
                <input class="btn btn-light rounded m-2 border" type="submit" value="save">
            </div>
        </form>

    </div>
    <div class="p-2">
        <div class="d-flex justify-content-center">
            <a type="button" class="btn btn-light border" href="<c:url value="/customer/list"/>">To main page</a>
        </div>
    </div>


</div>


<script src="<c:url value="/resources/js/jquery.min.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/popper.min.js" />" type="text/javascript"></script>
</body>
</html>