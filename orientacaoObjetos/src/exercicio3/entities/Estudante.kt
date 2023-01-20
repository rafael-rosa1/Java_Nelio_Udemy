package exercicio3.entities

class Estudante {
    var nome = ""
    var n1 = 0.0
    var n2 = 0.0
    var n3 = 0.0

    fun notaFinal() = n1 + n2 + n3

    fun pasoou() {
        if(notaFinal() >= 60.0) {
            println("PASS")
        } else {
            println("FAILED")
            val faltou = 60.0 - notaFinal()
            println("MISSING $faltou POINTS")
        }
    }

}