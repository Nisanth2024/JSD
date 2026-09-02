const {MongoClient} = require("mongodb")
var exp=require('express')
var app=new exp()
var usr,pwd;

//get method api

app.get("/testfun",async(request,response)=>{

    usr=request.query.un;
    pwd=request.query.pw;
    const data={"usr":usr,"pwd":pwd}

    var client=new MongoClient("mongodb://127.0.0.1:27017/");
    client.connect()
    response.write("<h1>Express And MongoDB Connection Success</h1>")
    try{
        const result= await client.db("jsd").collection("login").insertOne(data)
        console.log(result)
        response.write("Data Successfully Inserted")
    }
    catch{
        console.log("Error")
        response.write("Insertion Error")
    }


    
    response.end()

}).listen(8991)

console.log("Port lisitining at 8991......")