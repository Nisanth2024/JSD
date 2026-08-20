import React from 'react'

function App() {
  var arr=[11,22,33,44,55,66,77];
  return (
    <div>
      <h1>Array Demo</h1>
      {arr.map((item)=>item )}
      <br />
      {arr.map((item)=><React.Fragment key={item} >{item} </React.Fragment>)}
      {arr.map((item)=><React.Fragment key={item}><br />{item}</React.Fragment>)}
      <ol type="I">
      {arr.map((item)=><li key={item}>{item}</li>)}
      </ol>
      </div>
  )
}
export default App;








/*
export default function App() {
  var arr=[11,22,33,44,55,66,77];
  return (
    <div>
      <h1>Array Demo</h1>
      <h2>Array value index 0:{arr[0]}</h2>
      <h2>Array value index 1:{arr[1]}</h2>
      <h2>Array value index 2:{arr[2]}</h2>
      <h2>Array value index 3:{arr[3]}</h2>
      <h2>Array value index 4:{arr[4]}</h2>
      <h2>Array value index 5:{arr[5]}</h2>
      <h2>Array value index 6:{arr[6]}</h2>
    </div>
  )
}
*/
/*import React from 'react'
function App() {
  var mark=30;
  //var res="pass"
  var res="fail"
  return (
    <div>
      <h1>if elseif else ladder(nested if)</h1>
      <h1>Grading based on mark</h1>
      <h2>Mark:{mark}</h2>
      <h2>The grade for mark {mark} is {(res==="pass" && ((mark>=85 && "Outstanding") || (mark>=75 && "Excellent")||(mark>=65 && "Very good")||(mark>=55 && "Good")||"Fair"))|| "No grade"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var n=-20;
  return (
    <div>
      <h1>if elseif else ladder</h1>
      <h1>Find positive or negative or zero of a number</h1>
      <h2>Number:{n}</h2>
      <h2>The number {n} is {(n>0 && "Positive") || (n<0 && "Negative")||"zero"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var y=2026;
  return (
    <div>
      <h1>Leap Year or not</h1>
      <h2>Year:{y}</h2>
      <h2>The year {y} is {(y%4===0 && "a leap year") || "not a leap year"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var n=31;
  return (
    <div>
      <h1>Check even or odd</h1>
      <h2>Number:{n}</h2>
      <h2>The number {n} is {(n%2===0 && "Even") || "Odd"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var n1=30;
  var n2=90;
  return (
    <div>
      <h1>Find Greatest number</h1>
      <h2>Number 1:{n1}</h2>
       <h2>Number 2:{n2}</h2>
      <h2>The greatest number is: {(n1>n2 && n1) || n2}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var mark=30;
  return (
    <div>
      <h1>if else statement</h1>
      <h2>Mark:{mark}</h2>
      <h2>Result</h2>
      <h2>{(mark>34 && "Pass") || "Fail"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var mark=40;
  return (
    <div>
      <h1>Simple if</h1>
      <h2>Mark:{mark}</h2>
      <h2>Result</h2>
      <h2>{mark>34 && "Pass"}</h2>
      <h2>{mark<=34 && "Fail"}</h2>
    </div>
  )
}
export default App */


/*import './App.css'
import React from 'react'
import myimg from './Images/waterfalls.jpg'
function App() {
  return (
    <div align="center">
      <img src={myimg} width="50%" alt="not found"></img>
    </div>
  )
}
export default App;*/

/*var App=()=>{
  var a=10
  var b=20
  var c=30
  return(
  <>
  <h1>Adition of three numbers</h1>
  <h2>Value of A:{a}</h2>
  <h2>Value of B:{b}</h2>
  <h2>Value of C:{c}</h2>
  <h2>Total:{a+b+c}</h2>
  </>
  )
}
export default App;*/
/*import React from "react";
class App extends React.Component
{
  render(){
  return(
    <>
  <h1>Welcome to react js of class component</h1>
   <h1>Welcome to react js of class component</h1>
   <h1>Welcome to react js of class component</h1>
   </> 
)
}
}
export default App;*/

/*function App(){
  return(
    <>
  <h1>Welcome to react js</h1>
   <h1>Welcome to react js</h1>
   <h1>Welcome to react js</h1>
   </> 
)
}
export default App;*/

/*
import logo from './logo.svg';
import './App.css';

@@ -23,3 +189,4 @@ function App() {
}
export default App;
*/