// Task 4: delUser(number)

import { getServerURL } from "./task1.js";

export async function delUser(number) {
  try {
    const response = await fetch(
      getServerURL() + "/users/" + number,
      {
        method: "DELETE"
      }
    );

    if (!response.ok) {
      throw new Error("Failed to delete user");
    }

    return await response.json();
  } catch (error) {
    console.error("Error:", error.message);
  }
}