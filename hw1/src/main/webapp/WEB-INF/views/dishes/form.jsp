<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form</title>
</head>
<body>

<form:form action="/addDish" modelAttribute="dish" method="post">
    <input type="hidden" name="menu" value="${menu.id}" />
    Name:
    <form:input path="name"/>

    Description:
    <form:input path="description"/>

    Dietary:
    <form:input path="dietary"/>

    Price:
    <form:input path="price"/>

    <input type="submit"/>
</form:form>
</body>
</html>
