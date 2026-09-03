const {MongoClient} = require("mongodb")
var exp=require('express')
var app=new exp()

app.get("/updatefun",async(request,response)=>{
    var client=new MongoClient("mongodb://127.0.0.1:27017/");
    client.connect()
    const data={usr:request.query.un};
    const update={$set:{pwd:request.query.pw}};
    response.write("<h1>Update Record</h1>")
    try{
        const result= await client.db("jsd").collection("login").updateOne(data, update)
        console.log(result)
        if(result.modifiedCount===1){
             response.write("<h1>Updated Successfully</h1>")
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

}).listen(8995)
console.log("Port lisitining at 8995......")