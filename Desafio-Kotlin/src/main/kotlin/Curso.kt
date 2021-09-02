class Curso(
    var nome: String,
    val codCurso: Int,
    val qtdMaximaDeAlunos: Int,
    val professorEfetivo: ProfessorEfetivo,
    val professorTitular: ProfessorTitular,
    val listaAlunos: List<Aluno>

) {

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codCurso == this.codCurso)
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        return (qtdMaximaDeAlunos>0)
    //O método retornará true se o aluno puder ser adicionado ou false caso não haja vagas disponíveis.
    }
    fun excluirAluno(umAluno: Aluno){
/*        remove(umAluno)
Método permite excluir um aluno da lista de aluno
 */
    }

}