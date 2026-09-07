var fs = require("fs")
var data=fs.readFileSync("test.txt")
console.log("Answer : "+data.toString())
console.log("Program End")