fun main() {
    // Criando conteúdos educacionais
    val kotlinBasico = ConteudoEducacional(
        nome = "Introdução ao Kotlin",
        duracao = 120,
    )
    val poo = ConteudoEducacional(
        nome = "Programação Orientada a Objetos",
        duracao = 180,
    )
    val colecoes = ConteudoEducacional(
        nome = "Trabalhando com Coleções em Kotlin",
        duracao = 90,
    )

    // Criando uma formação
    val formacaoKotlin = Formacao(
        nome = "Formação Kotlin Developer",
        nivel = "Básico",
        conteudos = listOf(kotlinBasico, poo, colecoes),
    )

    // Criando alunos
    val aluno1 = Aluno(
        nome = "João Silva",
        email = "joao@gmail.com",
    )
    val aluno2 = Aluno(
        nome = "Maria Oliveira",
        email = "maria@gmail.com",
    )
    val aluno3 = Aluno(
        nome = "Carlos Souza",
        email = "carlos@gmail.com",
    )

    // Matriculando alunos na formação
    formacaoKotlin.matricular(aluno1)
    formacaoKotlin.matricular(aluno2)
    formacaoKotlin.matricular(aluno3)

    // Exibindo detalhes da formação
    println()
    formacaoKotlin.exibirDetalhes()

    // Listando alunos inscritos
    println()
    formacaoKotlin.listarInscritos()
}

