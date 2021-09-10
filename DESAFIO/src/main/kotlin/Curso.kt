// Classe Curso com os atributos
class Curso(
    val nome: String,
    val codCurso: Int,
    val qtdMaximaDeAlunos: Int,
    ) {
    var profAdjunto = mutableListOf<ProfessorAdjunto>()
    var profTitular = mutableListOf<ProfessorTitular>()
    var listaAlunos = ArrayList<Aluno>()

    override fun equals(other: Any?): Boolean { // Implantação do equals para testes na main
        return (other is Curso && other.codCurso == this.codCurso)
    }

    fun adicionarUmAluno(umAluno: Aluno) { // Método para adicionar aluno na lista de alunos
        listaAlunos.add(umAluno)
    }

    fun excluirAluno(umAluno: Aluno) {//Método permite excluir um aluno da lista de alunos
        println("\n***** Excluindo Aluno(a) ${umAluno.nome} ******")
        listaAlunos.remove(umAluno)
    }

    fun verificandoCapacidadeCurso() { // Não consegui usar da mesma forma do exercício
        // Verificando a capacidade do curso e Imprimindo a Relação de Alunos Adicionados
        for (i in listaAlunos) {
            i.nome
        }
        if (listaAlunos.size > qtdMaximaDeAlunos) {
            println("Capacidade máxima ultrapassada")
        } else {
            listaAlunos.forEach {
                println("Nome Completo: $it.nome $it.sobrenome Código: $it.codAluno")
            }
        }
    }
}

