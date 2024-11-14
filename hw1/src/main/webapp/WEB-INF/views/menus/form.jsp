<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form</title>
</head>
<body>
<form:form action="/addMenu" modelAttribute="menu">
    ID:
    <form:input path="id"/>

    Type:
    <form:input path="type"/>

    Restaurant:
    <form:input path="restaurant"/>

    <input type="submit"/>
</form:form>
</body>
</html>
