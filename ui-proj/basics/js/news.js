//https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=5c636a468a90465aa7cab199265d7299

const apiKey="5c636a468a90465aa7cab199265d7299";
const idCountry = document.querySelector("#idCountry");
const idCategory = document.querySelector("#idCategory");
const idContent = document.querySelector("#idContent");
getDefaultNews();

idCategory.addEventListener('change',(event)=>{
    getDefaultNews();
})
idCountry.addEventListener('change',(event)=>{
    getDefaultNews();
})

function getDefaultNews(){
    let country = idCountry.value;
    let category = idCategory.value;
    let apiUrl = `https://newsapi.org/v2/top-headlines?country=${country}&category=${category}&apiKey=${apiKey}`;
    fetch(apiUrl)
        .then(response=>response.json())
        .then(res=>{
        let articles = res["articles"];
        let newsItems = [];
        articles.forEach(ele => {
               let item = {"title":ele["title"],"description":ele["description"],"imageUrl":ele["urlToImage"]};
               newsItems.push(item);
        })
        showNewsItems(newsItems);
    }).catch(error=>{
        alert("Site is down,please wait for sometime");
    });    
}

function showNewsItems(newsItems){
        let str = '';
        newsItems.forEach(ele=>{
            str +=`<div class="card">
            <img src=${ele['imageUrl']} class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">${ele['title']}</h5>
              <p class="card-text">${ele['description']}</p>
              <a href="#" class="btn btn-primary">More...</a>
            </div>
          </div>`
        })
        idContent.innerHTML = str;
}   


 