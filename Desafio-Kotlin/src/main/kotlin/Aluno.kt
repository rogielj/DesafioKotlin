class Aluno

    (
        var nome: String,
        var sobrenome: String,
        val codAluno: Int
    ) {

        override fun equals(other: Any?): Boolean {
            return (other is Aluno && other.codAluno == this.codAluno)
        }

    init {
            if (codAluno == 0){
                println("*** Codigo do Aluno não pode ser um Numero negativo ***\n")
            }
    }


//    fun verificarAlunos (): Int {
//        return codAluno
//    }

}