import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//var sname="Nisanth";
//var marks=[77,88,99,100,90];
//var stud={rno:1,sname:"Nisanth",mark:98,result:"Pass",iselegible : true};
var stud={
  rno:1001,
  sname:"Nisanth",
  mark:[99,77,10],
  result:"Null"
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App data={stud}/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
