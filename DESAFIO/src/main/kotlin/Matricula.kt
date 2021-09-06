import java.util.*
// Classe Matrícula com os atributos
class Matricula(
    var aluno: Aluno,
    var curso: Curso,
) {
    var data = Date()

    fun criarMatricula(matricula: Matricula){ // Criando Matrícula com data e hora do dia
        println("""
            Aluno(a) ${aluno.nome} matriculado(a) no curso ${curso.nome} em: $data
        """.trimIndent())
    }
}

