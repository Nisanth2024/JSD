const {MongoClient} = require("mongodb")
var exp=require('express')
var app=new exp()

app.get("/pwdfun",async(request,response)=>{
    var client=new MongoClient("mongodb://127.0.0.1:27017/");
    client.connect()
    const data={"usr":request.query.un};
    response.write("<h1>Your Password Is : </h1>")
    try{
        const result= await client.db("jsd").collection("login").find(data).toArray()
        console.log(result)
        var len=result.length;
        if(len==1){
            response.write("<h1>"+result[0].pwd+"</h2>")
        }
        else{
            response.write("<h1>No Data Found!!</h2>")
        }
    }
    catch{
        console.log("Error")
        response.write("<h1>Data Reading Error</h2>")
    }
    response.end()

}).listen(8993)
console.log("Port lisitining at 8993......")