//import Event
var events=require("events")

//create object to events emitter
var eventEmitter=new events.EventEmitter();

//bind event (called)
const dis=()=>{
    console.log("event called")
}
eventEmitter.on("Nisanth",dis)

//fire event (calling)
eventEmitter.emit("Nisanth")
eventEmitter.emit("Nisanth")
eventEmitter.emit("Nisanth")
eventEmitter.emit("Nisanth")