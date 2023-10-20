<!-- BEGIN -->
@import exercise.dto.users.UserPage

@(UserPage userPage)

<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h1>User Details</h1>
    <table border="1">
        <tbody>
            <tr>
                <td>ID</td>
                <td>${userPage.getUser().getId()}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td>${userPage.getUser().getName()}</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>${userPage.getUser().getEmail()}</td>
            </tr>
        </tbody>
    </table>
    <a href="/users">Back to Users List</a>
</body>
</html>
<!-- END -->
