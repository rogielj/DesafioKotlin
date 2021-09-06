// Classe Curso com os atributos
class Curso(
    val nome: String,
    val codCurso: Int,
    val qtdMaximaDeAlunos: Int,
    var profEfetivo: MutableList<ProfessorAdjunto> = mutableListOf(),
    var profTitular: MutableList<ProfessorTitular> = mutableListOf()
) {
    var listaAlunos = ArrayList<Aluno>()

    override fun equals(other: Any?): Boolean { // Implantação do equals para testes na main
        return (other is Curso && other.codCurso == this.codCurso)
    }

    fun adicionarUmAluno(umAluno: Aluno) {
        listaAlunos.add(umAluno)
    }

    fun excluirAluno(umAluno: Aluno) {// Um Aluno ou Int
        println("\n***** Excluindo Aluno(a) ${umAluno.nome} ******")
        listaAlunos.remove(umAluno)
//Método permite excluir um aluno da lista de aluno

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

