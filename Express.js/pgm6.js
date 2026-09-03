const {MongoClient} = require("mongodb")
var exp=require('express')
var app=new exp()

app.get("/delfun",async(request,response)=>{
    var client=new MongoClient("mongodb://127.0.0.1:27017/");
    client.connect()
    const data={"usr":request.query.un};
    response.write("<h1>Delete Record</h1>")
    try{
        const result= await client.db("jsd").collection("login").deleteOne(data)
        console.log(result)
        if(result.deletedCount===1){
            response.write("<h1>Successfully Deleted</h1>")
        }
        else{
            response.write("<h2>Data Not Found!!</h1>")
        }
    }
    catch{
        console.log("Error")
        response.write("<h1>Data Reading Error</h2>")
    }
    response.end()

}).listen(8994)
console.log("Port lisitining at 8994......")