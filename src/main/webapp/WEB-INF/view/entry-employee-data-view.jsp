<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Please enter your personal details</h2>

<form:form action="outputData" modelAttribute="employee">

    Name: <form:input path="name"/> <br><br>
    Surname: <form:input path="surname"/> <br><br>
    Salary: <form:input path="salary"/> <br><br>

    Department: <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select> <br><br>

    English proficiency: <form:radiobuttons path="language" items="${employee.languages}"/> <br><br>

    <input type="submit" value="OK">

</form:form>

</body>

</html>