// Classe Aluno com os atributos
class Aluno
    (
    var nome: String,
    var sobrenome: String,
    val codAluno: Int
) {

    override fun equals(other: Any?): Boolean { // Implantação do equals para testes na main
        return (other is Aluno && other.codAluno == this.codAluno)
    }
// Init para não permite valor menor ou igual a zero ao código do aluno
    init {
        if (codAluno <= 0) {
            println("*** Codigo do Aluno não pode ser um Numero negativo ***\n")
        }
    }
}