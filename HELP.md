## Angular
- To start an angular application, go the angular project root
Run the following command
The platform allows port 3000 for frontend applications and we need to turn host check off to run the site over https  
`ng serve --port 3000 --disable-host-check` 
- To see the browser preview you can click on the `Open browser preview` option in the extension named "WeCP Projects".
- When connecting to the backend, you will need to provide the complete url of the backend server in order to connect. You can get the backend server url by clicking on the `Show backend server url` option in the extension named "WeCp Projects" or you can run the command `echo "$domain_5000"` in terminal to get the backend url

</br>
</br>

## Java
- Only port 5000 is allowed for backend servers, please set `server.port=5000` in `application.properties` to run the server at 5000
- use `Ctrl+Shift+P` to open the panel to view all available commands for STS (spring starter kit).

</br>
</br>

## MySQL
- The mysql database is by default running in localhost at port 3306
  Database credentials are `username=root, password=root`
- You can use the extension names `Database` to connect to the mysql database via gui interface or use the cli application `mysql` to connect
