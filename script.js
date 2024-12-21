const taskList = document.getElementById("taskList");

window.onload = loadTasks;

function addTask() {
    const taskName = document.getElementById("taskName").value;
    const dueDate = document.getElementById("dueDate").value;
    const dueTime = document.getElementById("dueTime").value;
    const priority = document.getElementById("priority").value;

    if (!taskName || !dueDate || !dueTime) {
        alert("Please fill in the task name, due date, and due time.");
        return;
    }

    const task = { name: taskName, date: dueDate, time: dueTime, priority: priority };

    saveTask(task);
    displayTask(task);

    document.getElementById("taskName").value = "";
    document.getElementById("dueDate").value = "";
    document.getElementById("dueTime").value = "";
    document.getElementById("priority").value = "High";
}

function saveTask(task) {
    const tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks.push(task);
    localStorage.setItem("tasks", JSON.stringify(tasks));
}

function loadTasks() {
    const tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks.forEach(displayTask);
}

function displayTask(task) {
    const taskDiv = document.createElement("div");
    taskDiv.classList.add("task");

    // Assign priority class based on task's priority
    if (task.priority === "Low") {
        taskDiv.classList.add("low-priority");
    } else if (task.priority === "Medium") {
        taskDiv.classList.add("medium-priority");
    } else if (task.priority === "High") {
        taskDiv.classList.add("high-priority");
    }

    const taskTitle = document.createElement("h3");
    taskTitle.textContent = task.name;

    const taskPriority = document.createElement("p");
    taskPriority.classList.add("priority");
    taskPriority.textContent = `Priority: ${task.priority}`;

    const taskDueDate = document.createElement("p");
    taskDueDate.classList.add("due-date");
    taskDueDate.textContent = `Due: ${new Date(task.date).toLocaleDateString()} at ${task.time}`;

    const deleteBtn = document.createElement("button");
    deleteBtn.classList.add("delete-btn");
    deleteBtn.textContent = "Delete";
    deleteBtn.onclick = () => deleteTask(taskDiv, task);

    taskDiv.appendChild(taskTitle);
    taskDiv.appendChild(taskPriority);
    taskDiv.appendChild(taskDueDate);
    taskDiv.appendChild(deleteBtn);
    taskList.appendChild(taskDiv);
}

function deleteTask(taskDiv, task) {
    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks = tasks.filter(t => t.name !== task.name || t.date !== task.date || t.time !== task.time || t.priority !== task.priority);
    localStorage.setItem("tasks", JSON.stringify(tasks));

    taskList.removeChild(taskDiv);
}
