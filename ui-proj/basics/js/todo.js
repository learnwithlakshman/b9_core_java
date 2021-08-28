const todoInput = document.querySelector("#todoInput");
const todoContent = document.querySelector("#todoContent");
const todos = [];

var updateIndex = -1;

todoInput.addEventListener('keyup',(event)=>{
    if(event.target.value !="" && event.keyCode==13){
        let todo = event.target.value;
        if(updateIndex == -1){
               todos.push(todo);
        }else{
            todos[updateIndex] = todo;
            updateIndex = -1;
        }
        todoInput.value="";
        showTodos(todos);
    }
})
function showTodos(listTodos){
    todoContent.innerHTML = "";
    let str = "<ol class='list-group list-group-numbered'>";
    for(let i=0;i<listTodos.length;i++){
        str +=`<li class="list-group-item">${listTodos[i]} <span style="float:right"><i class="fa fa-edit" onclick="editTodo(${i})"></i> | <i class="fa fa-trash" onclick="deleteTodo(${i})"></i></span></li>`
    }
    str +="</ol>";
    todoContent.innerHTML = str;

}
function editTodo(index){
    let todo = todos[index];
    todoInput.value=todo;
    updateIndex = index;
}
function deleteTodo(index){
    let res=confirm("Are you sure do want to delete todo :"+todos[index]+"?");
    if(res){
        todos.splice(index,1);
        showTodos(todos);
    }
}



