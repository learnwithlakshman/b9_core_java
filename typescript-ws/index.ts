

function hello(message:string){
    console.log(message)
}

function add(num1:number,num2:number):number{
    return num1 + num2;
}

hello("Welcome to TS world");
let num1 = 10, num2 = 20;
let res = add(num1,num2);
console.log(`The sum of ${num1} + ${num2} = ${res}`)


export class Player{
 
    constructor(private name:string, private team:string, private amount:number){
      
    }
    showInfo(){
        console.log(`${this.name}-${this.name}-${this.amount}`);
    }
}

export interface Person {
    firstName: string;
    lastName: string;
}

let p:Person={'firstName':'Hello','lastName':'Krish'};

function hi(person:Person){

}

hi({'firstName':'Krish ','lastName':'T'})