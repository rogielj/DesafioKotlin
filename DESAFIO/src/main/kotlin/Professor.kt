abstract class Professor( // Classe Professor abstrata que não pode ser instanciada
    var nome: String,
    var sobrenome: String,
    var tempoDeCasa: Int,
    var codProfessor: Int
) {
    override fun equals(other: Any?): Boolean { // Implantação do equals para testes na main
        return (other is Professor && other.codProfessor == this.codProfessor)
    }
}

class ProfessorTitular( // Classe Professor Titular que herda de Professor
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codProfessor: Int,
    var especialidade: String
) : Professor(nome, sobrenome, tempoDeCasa, codProfessor)

class ProfessorAdjunto(  // Classe Professor Adjunto que herda de Professor
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codProfessor: Int,
    var qtdHorasMonitoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codProfessor)
