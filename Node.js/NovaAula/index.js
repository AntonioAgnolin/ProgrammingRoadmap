function hello() {
    let nome = "Antônio"
    console.log(nome)
}

hello()

function repete(numero) {
    for (let i = 0; i < numero; i++) {
        console.log(i)        
    }
}

repete(10)

function repeteDeNovo(numero) {
    let i = 0
    while (i < numero) {
        console.log("repete")
        i++
    }
}

repeteDeNovo(5)

let listaDeAlunos = [
{
    nome: "Fernanda",
    idade: 25
},
{
    nome: "Jorge",
    idade: 19
},
{
    nome: "Tereza",
    idade: 23
}
]

function printAlunos(listaDeAlunos) {
    const listaComRA = listaDeAlunos.map((aluno) => {
        return console.log(aluno.nome.toUpperCase())
    })
    console.log(listaDeAlunos)
}

printAlunos(listaDeAlunos)

let idades = [13, 18, 98, 20, 31, 42, 46, 27, 22, 31]

function filtrandoIdades(listaDeIdades) {
    const velhos = listaDeIdades.filter((valor) => valor > 40)
    return console.log(velhos)
}

const trezeAnos = idades.find((item) => item === 13)
console.log(trezeAnos)

filtrandoIdades(idades)