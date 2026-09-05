const http=require("http")
http.createServer(function(request,response){

    response.end("<h1>Welcome To Node JS </h1>");
}).listen(9887)
console.log("Port Lisitinig at 9887............")