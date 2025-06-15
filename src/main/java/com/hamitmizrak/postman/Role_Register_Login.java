package com.hamitmizrak.postman;

public class Role_Register_Login {
    //ROLES cURL
    /*
    cURL
     curl --location 'http://localhost:4444/user/api/v1/roles' \
    --header 'Content-Type: application/json' \
    --header 'Authorization: Basic c3VwZXI6cm9vdA==' \
    --header 'Cookie: JSESSIONID=70649642506F66D6CD2DE81EBA52EA6D' \
    --data '{
        "roleName":"ADMIN"
    }'
    */

    //ROLES HTTP
    // POST => http://localhost:4444/user/api/v1/roles
    /**
     {
     "roleName":"ADMIN"
     }
     */

    /**
     POST /user/api/v1/roles HTTP/1.1
     Host: localhost:4444
     Content-Type: application/json
     Authorization: Basic c3VwZXI6cm9vdA==
     Cookie: JSESSIONID=70649642506F66D6CD2DE81EBA52EA6D
     Content-Length: 28

     {
     "roleName":"ADMIN"
     }
     */

    //REGISTER HTTP
    /**
     http://localhost:4444/user/api/v1/create/1
     {
     "name":"Hamit",
     "surname":"Mızrak",
     "email":"hamitmizrak@gmail.com",
     "password":"Hm123456@."
     }

     POST /user/api/v1/create/1 HTTP/1.1
     Host: localhost:4444
     Content-Type: application/json
     Cookie: JSESSIONID=70649642506F66D6CD2DE81EBA52EA6D
     Content-Length: 117

     {
     "name":"Hamit",
     "surname":"Mızrak",
     "email":"hamitmizrak@gmail.com",
     "password":"Hm123456@."
     }
     */

    // LOGIN HTTP
    /**
     POST => http://localhost:4444/login/api/v1/authentication
     Basic Auth:
     -Username:hamitmizrak@gmail.com
     -Password:Hm123456@.
     * */

} //end login
