//import Event
var events=require("events")

//create object to events emitter
var eventEmitter=new events.EventEmitter();

//bind event (called)
eventEmitter.on("Nisanth",()=>{
    console.log("Event Called")
})

//fire event (calling)
eventEmitter.emit("Nisanth")
eventEmitter.emit("Nisanth")
eventEmitter.emit("Nisanth")
eventEmitter.emit("Nisanth")