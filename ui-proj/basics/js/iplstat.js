var players = [];
function loadPlayers(){
    fetch('js/players.json')
    .then(data=>data.json())
    .then(res=>{
        players =res;
        showTeamAmountStat();
    })
}
function showTeamAmountStat(){
   let map = new Map();
   players.forEach(player=>{
       if(map.get(player["team"])){
            list = map.get(player["team"]);
            list.push(player);
            map.set(player["team"],list);
       }else{
        list = []
        list.push(player);
        map.set(player["team"],list);
       }
    })
    teamStatArr = [];
    map.forEach((v,k)=>{
        team = k;
        count = v.length;
        amount = v.map(ele=>ele["price"]).reduce((a,b)=>a+b);
        teamStat = {team:team,count:count,amount:amount};
        teamStatArr.push(teamStat);
    })
    displayTeamStatInformation(teamStatArr);
 }
function displayTeamStatInformation(teamStatArr){
        const teamAmountDetails = document.querySelector("#teamAmountDetails");
       let str=`<table class='table table-striped'>
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Team Name</ th>
      <th scope="col">Player Count</th>
      <th scope="col">Total Amount(INR)</th>
    </tr>
  </thead>
  <tbody>`
    teamStatArr.forEach((team,i,teamStatArr)=>{
        str+=`<tr><td>${i+1}</td><td>${team['team']}</td><td>${team['count']}</td><td>${team['amount']}</td></tr>`;
    })
  str +=`</tbody></table>`
  teamAmountDetails.innerHTML = str;
}
loadPlayers();


// Filter
// Map 
// Reduce

arr = [1,2,3,4,5,6]
names = ["Raj","kiran","Charan"];
res = arr.reduce((a,b)=>a>b?a:b)

even_arr = arr.filter(ele=>ele%2==0);
console.log(even_arr);

square_arr = names.map(ele=>ele.length);
console.log(square_arr);