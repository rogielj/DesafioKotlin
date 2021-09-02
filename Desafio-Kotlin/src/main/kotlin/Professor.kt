class Professor (
    var nome: String,
    var sobrenome: String,
    var tempoDeCasa: Int,
    var codProfessor: Int
)
{
    override fun equals(other: Any?): Boolean {
        return (other is Professor && other.codProfessor == this.codProfessor)
    }
}
open class ProfessorTitular(professor: Professor) {
    var especialidade: String = ""
}
open class ProfessorEfetivo(professor: Professor) {
    var qtdHorasMonitoria: Int = 0
}