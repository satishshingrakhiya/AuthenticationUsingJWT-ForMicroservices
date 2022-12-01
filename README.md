# AuthenticationUsingJWT-ForMicroservices
This Project represent how to use JWT token for authentication in Microservices

###Prerequisite
1. Java 11 
2. MYSQL
3. Configure MYSQL connection in application.properties file
4. Postman for Testing

###How to Install and Run Project
1. Clone the repository
2. Open the project in Intellij (or your favourite IDE)
3. Go to AuthenticatorService and run AuthenticatorServiceApplication (path: AuthenticatorService/src/main/java/com.manage.employee/AuthenticatorServiceApplication)
4. Go to TestAuthentication and run TestAuthenticationApplication (path: TestAuthentication/src/main/java/com.manage.employee/TestAuthenticationApplication)
5. Go to endpoints using postman http://localhost:8082/api/v1/test/unrestricted and http://localhost:8082/api/v1/test/restricted you will be able to access only unrestricted end point, restricted endpoint will throw exception.

###How to use appllication
1. After starting both the application and use Postman to send Post request to http://localhost:8081/api/v1/user/register, in Body select raw and JSON format and add following payload
{
    "username":"Test",
    "password":"Password"
}
This will create user with username Test.
2. Now send post request to http://localhost:8081/api/v1/user/login, in Body select raw and JSON format and add following payload
{
    "username":"Test",
    "password":"Password"
}
This will send back HTTP OK response and follwing 
{
    "message": "Token Generated Successfully",
    "token": "==Generated Token Value=="
}
3. Now send Get request to http://localhost:8082/api/v1/test/restricted with following changes
    a. Add new Header "Authorization"
    b. Set its value as "Bearer ==Generated Token Value=="
    c. Send request and you will be able to access enpoint now.