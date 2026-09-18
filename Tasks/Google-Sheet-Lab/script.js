const API_URL = "https://script.google.com/macros/s/AKfycbzcZWZQfDQJNnvXmiMhNJBVrSoLW6EiSjCGba2CZp3LhoKiHjWSrswQWuA_WI4Dp0YQ/exec";

// POST - Send data to Google Sheet
async function sendData() {
  const data = {
    name: "Pavya",
    email: "pavya@example.com",
    course: "React.js"
  };

  try {
    const response = await fetch(API_URL, {
      method: "POST",
      body: JSON.stringify(data)
    });

    const result = await response.json();

    document.getElementById("output").innerText =
      "Data sent successfully!";

    console.log(result);
  } catch (error) {
    console.error("POST Error:", error);
  }
}

// GET - Retrieve data from Google Sheet
async function getData() {
  try {
    const response = await fetch(API_URL);

    const data = await response.json();

    document.getElementById("output").innerText =
      JSON.stringify(data, null, 2);

    console.log(data);
  } catch (error) {
    console.error("GET Error:", error);
  }
}

document
  .getElementById("sendBtn")
  .addEventListener("click", sendData);

document
  .getElementById("getBtn")
  .addEventListener("click", getData);