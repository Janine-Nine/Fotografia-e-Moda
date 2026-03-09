const API = "http://localhost:8080/api"

async function carregarFotos(){

const res = await fetch(API + "/fotos")

const fotos = await res.json()

const galeria = document.getElementById("galeria")

galeria.innerHTML = ""

fotos.forEach(foto => {

galeria.innerHTML += `
<div class="col-md-3">

<div class="card">

<img src="${foto.urlImagem}" class="card-img-top">

<div class="card-body">

<h5>${foto.titulo}</h5>

<p>${foto.descricao}</p>

<button class="btn btn-danger" onclick="deletar(${foto.id})">

Excluir

</button>

</div>

</div>

</div>
`

})

}

document.getElementById("fotoForm").addEventListener("submit", async e => {

e.preventDefault()

const titulo = document.getElementById("titulo").value
const descricao = document.getElementById("descricao").value
const imagem = document.getElementById("imagem").files[0]

const form = new FormData()

form.append("file", imagem)

const upload = await fetch(API + "/upload", {

method:"POST",
body:form

})

const urlImagem = await upload.text()

await fetch(API + "/fotos", {

method:"POST",

headers:{
"Content-Type":"application/json"
},

body: JSON.stringify({

titulo,
descricao,
urlImagem

})

})

carregarFotos()

})

async function deletar(id){

await fetch(API + "/fotos/" + id,{
method:"DELETE"
})

carregarFotos()

}

function logout(){

localStorage.removeItem("token")

window.location.href = "login.html"

}

carregarFotos()