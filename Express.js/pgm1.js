var exp=require('express')
var app=new exp()
var usr,pwd;

//get method api

app.get("/testfun",(request,response)=>{

    usr=request.query.un;
    pwd=request.query.pw;


    //response.send("<h1>Welcome To Express JS</h1>")
    response.write("<h1>user name : "+usr+ "</h1>");
    response.write("<h1>Password : "+pwd+ "</h1>");
    if(usr==="admin" && pwd==="admin@123")
    {
        response.write("<font color ='green' size='7'>Valid User</font>");
    }
    else{
        response.write("<font color ='Red' size='7'>Invalid User!!</font>");
    }
    response.end()

}).listen(8991)

console.log("Port lisitining at 8991......")