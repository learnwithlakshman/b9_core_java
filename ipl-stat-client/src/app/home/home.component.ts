import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {


  message = "Welcome to Angular world";
  imgUrl = "https://angular.io/generated/images/guide/architecture/databinding.png";
  todo:string = "";
  todos:string[] = [];
  index = -1;
  servers = [
             {"ip":"192.168.1.1","location":"US","status":true},
             {"ip":"192.168.13.1","location":"UK","status":false},
             {"ip":"192.168.12.1","location":"IND","status":true},
             {"ip":"192.168.1.2","location":"US","status":true}
            ]
  
  username = "Test User";
  colNum = 4;
  constructor() { }

  ngOnInit(): void {
    setTimeout(() => {
        this.username = "Hello user, please enter your name";
    }, 5000);
  }

  convertCase(){
    this.message = this.message.toUpperCase();
  }

  getStatus(status:boolean){
    return status ? "ON" : "OFF";
  }
  getColor(server:any){
      return server['status'] ? "gray":"pink";
  }
  addTodo(){
    if(this.todo != "" && this.todo.trim().length> 0){
      if(this.index == -1){
          this.todos.push(this.todo);
       }else{
          this.todos[this.index] = this.todo;
          this.index = -1;
      }
      this.todo = "";
    }
  }
  editTodo(ele:string,index:number){
      this.index = index;
      this.todo = ele;
  }
  deleteTodo(ele:string,index:number){
     this.todos.splice(index,1);
    
  }
}
