//todo list variable
//DOM
//add item input
const addInput = document.getElementById("add_input");

//add item button
const addButton = document.getElementById("add_button");

//todo task (ul)
const todoTask = document.getElementById("todo_task");

//complete list (ul)
const completeList = document.getElementById("complete_list");

//#### CREATE #######
// list item
let createNewTask = function (valueData) {
    //checkbox
    let checkBox = document.createElement("input");
    checkBox.type = "checkbox";

    //label
    let label = document.createElement("label");
    label.innerText = valueData;

    //edit Input Text
    let editInput = document.createElement("input");
    editInput.type = "text";

    //edit Button
    let editButton = document.createElement("button");
    editButton.innerText = "Edit";
    editButton.className = "edit";

    //delete Button
    let deleteButton = document.createElement("button");
    deleteButton.innerText = "Delete";
    deleteButton.className = "delete";

    //append
    let listItem = document.createElement("li");
    listItem.appendChild(checkBox);
    listItem.appendChild(label);
    listItem.appendChild(editInput);
    listItem.appendChild(editButton);
    listItem.appendChild(deleteButton);
    return listItem;
}


//#### ADD #######
let addTask = () => {
    //input içine yazılan veriyi aşağıdaki liste eklemek
    let listItem = createNewTask(addInput.value);

    //ul içine list datası eklemek
    todoTask.appendChild(listItem);

    //bind
    bindData(listItem, taskTodoCompleted);

    //input verisinin içini boşalttım
    addInput.value = "";
}

//#### EDIT #######
let editTask = () => {
    //bulunduğumuz liste
    let listItem = this.parentNode;

    let label = listItem.querySelector("label");
    let editInput = listItem.querySelector("input[type=text]");

    let editListEquals = listItem.classList.contains("edit_list");

    //contitional
    if (editListEquals)
        label.innerText = editInput.value;
    else
        editInput.value = label.innerText;
    listItem.classList.toggle("edit_test");
}


//#### DELETE #######
let deleteTask = () => {
    let listItem = this.parentNode;
    let ulList = listItem.parentNode;
    ulList.removeChild(listItem);
}

//#### BIND DATA ###
let bindData = (listItem, checkBoxHandle) => {

    let checkBoxData = listItem.querySelector("input[type=checkbox]");
    checkBoxData.onchange = checkBoxHandle;

    let editButtonData = listItem.querySelector("button.edit");
    editButtonData.onclick = editTask;

    let deleteButtonData = listItem.querySelector("button.delete");
    deleteButtonData.onclick = deleteTask
}

//#### COMPLETE #######

//#### Task Todo Completed ###
let taskTodoCompleted = () => {

}

//Add butonuna tıklandığında
addButton.onclick = addTask;
//addButton.addEventListener("click",addTask);

