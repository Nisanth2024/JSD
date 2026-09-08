buf =new Buffer.alloc(250)
//Syntax : Buffer.alloc(size, Fill, Encoding)
console.log(buf); //Output : default all value 00
len=buf.write("Welcome to The Great Kirigalan Magic Show")
console.log(len)
console.log(buf)
console.log(buf.toString())
