/* Classe DigitalHouseManager com lista de:
professores adjuntos, professores titulares,
alunos, cursos e matrícula e posteriores métodos
*/
class DigitalHouseManager {
    val profAdjunto = mutableListOf<ProfessorAdjunto>()
    val profTitular = mutableListOf<ProfessorTitular>()
    val listaAlunos = mutableListOf<Aluno>()
    val listaDeCurso = mutableListOf<Curso>()
    val listaDeMatriculas = mutableListOf<Matricula>()

    fun registrarCurso( // Registrando Curso
        curso: Curso
    ) {
        listaDeCurso.add(curso)
    }

    fun excluirCurso(codCurso: Int) { // Excluindo Curso
        listaDeCurso.removeAt(codCurso)
    }

    // Imprimindo a Relação de Cursos Registrados
    fun imprimirRelacaoCurso() {
        for (i in listaDeCurso) {
            println(
                """
                *****************************************
                Registrando Curso de: ${i.nome}
                Código do Curso: ${i.codCurso}
                Quantidade Máxima de Alunos: ${i.qtdMaximaDeAlunos} 
        """.trimIndent()
            )
        }
    }

    fun registrarProfessorAdjunto(professorA: ProfessorAdjunto) { // Registrando Professor Adjunto
        profAdjunto.add(professorA)
    }

    fun registrarProfessorTitular(professorT: ProfessorTitular) { // Registrando Professor Titular
        profTitular.add(professorT)
    }

    fun excluirProfessor(codProfessor: Int) { // Excluindo Professor
        profTitular.removeAt(codProfessor)
        profAdjunto.removeAt(codProfessor)
    }

    fun imprimirRelacaoProfessores() { // Imprimindo Relação de Professores Registrados
        println("******* Professores Adjuntos *******")
        profAdjunto.forEach {
            println(
                "Prof: ${it.nome} ${it.sobrenome}\nTempo de Casa ${it.tempoDeCasa} anos " +
                        "\nCódigo: ${it.codProfessor}\nHoras de Monitoria: ${it.qtdHorasMonitoria}hs"
            )
        }
        println("\n*****Professores Titulares *******")
        profTitular.forEach {
            println(
                "Prof: ${it.nome} ${it.sobrenome}\nTempo de Casa ${it.tempoDeCasa} anos " +
                        "\nCódigo: ${it.codProfessor}\nEspecilidade: ${it.especialidade}"
            )
        }
    }

    fun matricularAlunos( // Adicionando um aluno na lista de matrículas
        aluno: Aluno
    ) {
        listaAlunos.add(aluno)
    }

    // Encontrar o aluno na lista de alunos.
    // Alocando o aluno e o matriculando a um curso.
    fun matricularAlunoEmUmCurso(codAluno: Int, codCurso: Int, matricula: Matricula) {

        var a = ""
        var b = ""
        listaDeCurso.map {
            if (it.codCurso == codCurso)
                a = it.nome
        }
        listaAlunos.map {
            if (it.codAluno == codAluno)
                b = it.nome
        }
        listaDeMatriculas.add(matricula)
    }

    fun imprimirMatriculas() {
        listaDeMatriculas.map { it ->
            if (listaDeMatriculas.size > it.curso.qtdMaximaDeAlunos) {
                println("Capacidade Máxima Ultrapassada")
            } else {
                println("${it.aluno.nome} matriculado no curso de ${it.curso.nome} ")
            }
        }
    }
    // Encontrar o professor titular e adjunto na lista de professores.
    // Alocar ambos professores aos cursos.
    fun alocarProfessores(
        codigoCurso: Int, codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {

        var c = ""
        var d = ""
        var e = ""
        var f = ""

        profAdjunto.map {
            if (it.codProfessor == codigoProfessorAdjunto)
                c = it.nome
        }
        listaDeCurso.map {
            if (it.codCurso == codigoCurso)
                d = it.nome
        }
        print("Alocando professor Adjunto.......\n")
        print("Professor $c alocado(a) no curso $d\n")
        println()

        for (i in profTitular){
            if (i.codProfessor == codigoProfessorTitular)
                e = i.nome
        }

        for (x in listaDeCurso){
            if (x.codCurso == codigoCurso)
                f = x.nome
        }
        print("Alocando professor Titular.......\n")
        print("Professor $e alocado(a) no curso $f")
    }
}
