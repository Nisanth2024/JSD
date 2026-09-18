// Task 2: listUsers()

import { getServerURL } from "./task1.js";

export async function listUsers() {
  try {
    const response = await fetch(getServerURL() + "/users");

    if (!response.ok) {
      throw new Error("Failed to retrieve users");
    }

    const users = await response.json();
    console.log(users);
  } catch (error) {
    console.error("Error:", error.message);
  }
}