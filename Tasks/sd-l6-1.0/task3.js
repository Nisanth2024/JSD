import { getServerURL } from "./task1.js";

export async function addUser(first_name, last_name, email) {
  try {
    const newUser = {
      id: "6",
      first_name: first_name,
      last_name: last_name,
      email: email
    };

    const response = await fetch(`${getServerURL()}/users`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(newUser)
    });

    if (!response.ok) {
      throw new Error("Failed to create user");
    }

    return await response.json();
  } catch (error) {
    console.error("Error:", error.message);
  }
}