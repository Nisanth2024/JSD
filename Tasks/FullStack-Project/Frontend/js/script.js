const API_URL = "http://localhost:8080/api/tasks";

const taskForm = document.getElementById("taskForm");
const taskList = document.getElementById("taskList");

document.addEventListener("DOMContentLoaded", loadTasks);

taskForm.addEventListener("submit", async function (event) {
    event.preventDefault();

    const taskName = document.getElementById("taskName");
    const description = document.getElementById("description");
    const assignedTo = document.getElementById("assignedTo");
    const dueDate = document.getElementById("dueDate");
    const status = document.getElementById("status");

    let isValid = true;

    if (taskName.value.trim() === "") {
        taskName.classList.add("is-invalid");
        isValid = false;
    } else {
        taskName.classList.remove("is-invalid");
    }

    if (description.value.trim() === "") {
        description.classList.add("is-invalid");
        isValid = false;
    } else {
        description.classList.remove("is-invalid");
    }

    if (assignedTo.value.trim() === "") {
        assignedTo.classList.add("is-invalid");
        isValid = false;
    } else {
        assignedTo.classList.remove("is-invalid");
    }

    if (dueDate.value === "") {
        dueDate.classList.add("is-invalid");
        isValid = false;
    } else {
        dueDate.classList.remove("is-invalid");
    }

    if (status.value === "") {
        status.classList.add("is-invalid");
        isValid = false;
    } else {
        status.classList.remove("is-invalid");
    }

    if (!isValid) {
        return;
    }

    const task = {
        name: taskName.value,
        description: description.value,
        assignedTo: assignedTo.value,
        dueDate: dueDate.value,
        status: status.value
    };

    try {
        const response = await fetch(API_URL, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(task)
        });

        if (!response.ok) {
            throw new Error("Failed to create task");
        }

        taskForm.reset();

        loadTasks();

    } catch (error) {
        console.error(error);
        alert("Unable to add task. Please check the backend server.");
    }
});

async function loadTasks() {
    try {
        const response = await fetch(API_URL);

        if (!response.ok) {
            throw new Error("Failed to load tasks");
        }

        const tasks = await response.json();

        taskList.innerHTML = "";

        tasks.forEach(task => {
            createTaskCard(task);
        });

    } catch (error) {
        console.error(error);
        taskList.innerHTML =
            `<p class="text-danger">Unable to load tasks.</p>`;
    }
}

function createTaskCard(task) {
    const listItem = document.createElement("div");

    listItem.className = "list-group-item mb-3";

    let badgeClass = "text-bg-secondary";

    if (task.status === "IN PROGRESS") {
        badgeClass = "text-bg-primary";
    } else if (task.status === "REVIEW") {
        badgeClass = "text-bg-warning";
    } else if (task.status === "DONE") {
        badgeClass = "text-bg-success";
    }

    listItem.innerHTML = `
        <div class="card border-0">
            <div class="card-body">

                <h5 class="card-title">
                    ${task.name}
                </h5>

                <p class="card-text">
                    ${task.description}
                </p>

                <p>
                    <strong>Assigned To:</strong>
                    ${task.assignedTo}
                </p>

                <p>
                    <strong>Due Date:</strong>
                    ${formatDate(task.dueDate)}
                </p>

                <span class="badge ${badgeClass}">
                    ${task.status}
                </span>

                <button
                    class="btn btn-danger btn-sm float-end"
                    onclick="deleteTask(${task.id})"
                >
                    Delete
                </button>

            </div>
        </div>
    `;

    taskList.appendChild(listItem);
}

async function deleteTask(id) {
    try {
        const response = await fetch(`${API_URL}/${id}`, {
            method: "DELETE"
        });

        if (!response.ok) {
            throw new Error("Failed to delete task");
        }

        loadTasks();

    } catch (error) {
        console.error(error);
        alert("Unable to delete task.");
    }
}

function formatDate(dateValue) {
    const dateParts = dateValue.split("-");

    return `${dateParts[2]}-${dateParts[1]}-${dateParts[0]}`;
}