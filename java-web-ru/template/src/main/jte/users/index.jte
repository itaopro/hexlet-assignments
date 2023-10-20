<!-- BEGIN -->
@import exercise.dto.users.UsersPage

@(UsersPage usersPage)

<!DOCTYPE html>
<html>
<head>
    <title>Users List</title>
</head>
<body>
    <h1>Users List</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>View Details</th>
            </tr>
        </thead>
        <tbody>
            @for(User user : usersPage.getUsers()) {
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getName()}</td>
                    <td>${user.getEmail()}</td>
                    <td><a href="/users/${user.getId()}">View</a></td>
                </tr>
            }
        </tbody>
    </table>
</body>
</html>
<!-- END -->
