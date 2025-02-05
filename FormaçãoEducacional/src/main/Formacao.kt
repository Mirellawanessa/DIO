class Formacao(
    val nome: String,
    val nivel: String,
    val conteudos: List<ConteudoEducacional>,
) {
    private val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
        println("Aluno ${aluno.nome} matriculado com sucesso na formação $nome!")
    }

    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println("- ${it.nome}") }
    }
}
