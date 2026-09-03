const {MongoClient} = require("mongodb")
var exp=require('express')
var app=new exp()

app.get("/showall",async(request,response)=>{

    var client=new MongoClient("mongodb://127.0.0.1:27017/");
    client.connect()
    response.write("<h1>Read All Datas from MongoDB</h1>")
    try{
        const result= await client.db("jsd").collection("login").find({}).toArray()
        console.log(result)
        var len=result.length;
        response.write("<h1>Total Records Available : "+len+"</h1>")
        response.write("<table border='2' cellpadding='20' bgcolor='red'>")
        response.write("<tr><th>S.no</th><th>User Name</th><th>Password</th></tr>")
        for(i=0;i<len;i++){
            response.write("<tr><td>"+(i+1)+"</td><td>"+result[i].usr+"</td><td>"+result[i].pwd+"</td></tr>")
        }
        response.write("</table>")
        response.write("<h2>Data's Retrived Successfully</h2>")
    }
    catch{
        console.log("Error")
        response.write("<h1>Data Reading Error</h2>")
    }
    response.end()

}).listen(8992)
console.log("Port lisitining at 8992......")