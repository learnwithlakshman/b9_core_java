function showTable() {
    let inputNum = document.querySelector("#inputNum");
    let str = "";

    if (inputNum.value.trim() != "") {
        let num = Number.parseInt(inputNum.value);
        let mulTableContent = document.querySelector("#mulTableContent");
        for (let i = 1; i <= 10; i++) {
            str += `${num} &nbsp; * &nbsp; ${i} &nbsp; =  &nbsp;${
                num * i
            } <br>`;
        }
        mulTableContent.innerHTML = str;

    } else {
        mulTableContent.innerHTML = str;
    }
}



document.querySelector("#idSum").addEventListener('click', () => calc('+'))
document.querySelector("#idSub").addEventListener('click', () => calc('-'))
document.querySelector("#idMul").addEventListener('click', () => calc('*'))
document.querySelector("#idDiv").addEventListener('click', () => calc('/'))

function calc(ope) {
    let num1 = Number.parseInt(document.querySelector("#num1").value);
    let num2 = Number.parseInt(document.querySelector("#num2").value);
    let str = "";
    if (ope === "+") 
        str = `${num1} + ${num2} = ${num1 + num2}`;
     else if (ope === "-") 
        str = `${num1} - ${num2} = ${num1 - num2}`;
     else if (ope === "*") 
        str = `${num1} * ${num2} = ${num1 * num2}`;
     else if (ope === "/") 
        str = `${num1} / ${num2} = ${num1 / num2}`;
    
    let res = document.querySelector("#res");
    res.value = str;
}


function reduce(arr,f){
    let val = arr[0];
    for(let i=1;i<arr.length;i++){
        val = f(val,arr[i]);
    }
    return val;

}


let arr =[1,2,3,4,5,6,7,8,9,10]

console.log(reduce(arr,(a,b)=>a+","+b));


function gcd(num1, num2){
    if(num1 == num2){
        return num1;
    }
    if(num1 > num2){
        return gcd(num1-num2,num2);
    }else{
        return gcd(num1,num2-num1);
    }
}

console.log(gcd(45,27))