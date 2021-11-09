<html>
<head>
    <title>Title</title>
    <link href="/css/static.css" rel="stylesheet" type="text/css">
</head>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <#list usersFromServer as user>
            <tr>
                <td>${user.getFirstName()}</td>
                <td>${user.getLastName()}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>