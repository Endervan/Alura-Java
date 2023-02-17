const alunos = ['Joaõ', 'Juliana', 'Caio', 'Ana'];

const mediaDosAlunos = [10, 7, 9, 6];

let listaDeNotasAlunos = [alunos, mediaDosAlunos];

const exibeNomeNota = (nomeDoAluno) => {

    if (listaDeNotasAlunos[0].includes(nomeDoAluno)) {
        indice = listaDeNotasAlunos[0].indexOf(nomeDoAluno)
        return listaDeNotasAlunos[0][indice] + ' sua media e ' + listaDeNotasAlunos[1][indice]
    } else {
        return "Aluno não esta cadastrado"
    }
}

console.log(exibeNomeNota("Ana"));


