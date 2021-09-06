fun main() {
    val professorT1 = ProfessorTitular("João","José",5,152,"Web")
    val professorT2 = ProfessorTitular("Carla","Souza",5,167,"Java")

    val professorA1 = ProfessorAdjunto("Maria","Silva",3,456,220)
    val professorA2 = ProfessorAdjunto("Pedro","Antonio",8,467,100)

    val curso1 = Curso("Full Stack",20001,3)
    val curso2 = Curso("Android",20002,2)

    val aluno1 = Aluno("Caio","Jorge",1340)
    val aluno2 = Aluno("Paula","Guilherme",8340)
    val aluno3 = Aluno("Milton","Leite",1237)

//    if (aluno1 == aluno2){
//        println("${aluno1.nome} e ${aluno2.nome} são iguais, pois possuem o mesmo código")
//    } else(
//            println("${aluno1.nome} e ${aluno2.nome} Não são iguais")
//    )

//    curso2.adicionarUmAluno(aluno1)
//    curso2.adicionarUmAluno(aluno2)
//
//    curso2.verificandoCapacidadeCurso()
//    curso2.excluirAluno(aluno2)
//    curso2.verificandoCapacidadeCurso()


    val matriculaFS1 = Matricula(aluno1,curso1)
    val matriculaFS2 = Matricula(aluno2,curso1)
    val matriculaFS3 = Matricula(aluno3,curso1)

    val processo = DigitalHouseManager()

    processo.registrarCurso(curso2)
    processo.registrarCurso(curso1)
//    processo.imprimirRelacaoCurso()
    processo.registrarProfessorAdjunto(professorA1)
    processo.registrarProfessorAdjunto(professorA2)
    processo.registrarProfessorTitular(professorT1)
    processo.registrarProfessorTitular(professorT2)
//    processo.imprimirRelacaoProfessores()
    processo.matricularAlunos(aluno1)
    processo.matricularAlunos(aluno2)
    processo.matricularAlunos(aluno3)


    processo.matricularAlunoEmUmCurso(1340,20001,matriculaFS1)
    processo.matricularAlunoEmUmCurso(8340,20001,matriculaFS2)
    processo.matricularAlunoEmUmCurso(1237,20001,matriculaFS3)

    processo.imprimirMatriculas()
//    processo.alocarProfessores(20001,152,456)


//    matriculaFS1.criarMatricula(matriculaFS1)
//    println()
//    matriculaFS2.criarMatricula(matriculaFS2)
//    println()
//    matriculaFS3.criarMatricula(matriculaFS3)
//    println()
//
//    val matriculaA1 = Matricula(aluno1,curso2)
//    val matriculaA2 = Matricula(aluno3,curso2)
//    matriculaA1.criarMatricula(matriculaA1)
//    println()
//    matriculaA2.criarMatricula(matriculaA2)

}
