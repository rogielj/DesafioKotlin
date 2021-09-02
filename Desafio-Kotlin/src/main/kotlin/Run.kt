fun main() {
    println("-------Verificando se os código são iguais------")

        val aluno1 = Aluno("Matias", "K", 1234)
        val aluno2 = Aluno("João", "Almeida", 1235)
        val aluno3 = Aluno("Maria", "Antonieta", 1234)

    val l = listOf(aluno1)
    val l2 = listOf(aluno2)
    val l3 = listOf(aluno3)

    if (l.contains(aluno2)){
        println("Cuidado")
    } else if (l.contains(aluno3)){
        println("Cuidado2")
    }

}
