fun main() {

    var nomeProduto: String = "cimento"
    var precoUnitario: Float = 26.99F
    var quantProdutos: Int = 67
    var taxaImposto: Float = 0.04F
    var margemLucro: Double = 2.0


    fun valorTotal (a: Float =precoUnitario, b: Int =quantProdutos): Float {
        return a * b
    }

    fun valorComImposto (a: Float =taxaImposto, b: Float =valorTotal()): Float {
        return a * b
    }

    fun valorTotalImposto (a: Float =valorTotal(), b: Float =valorComImposto()): Float {
        return a - b
    }

            println("0 valor total é ${valorTotal()}")
            println("0 valor do imposto sobre o valor total ${valorComImposto()}")
            println("0 valor total com imposto é ${valorTotalImposto()}")

}
