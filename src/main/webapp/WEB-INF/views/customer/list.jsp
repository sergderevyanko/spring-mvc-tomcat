<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List Customer</title>
</head>
<body>
    <h1>Customer List - coming soon</h1>
    <div id="container">
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td> ${customer.firstName}</td>
                    <td> ${customer.lastName}</td>
                    <td> ${customer.email}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
