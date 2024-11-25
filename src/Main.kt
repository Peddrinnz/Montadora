import Carros.Carros
import Motos.Motos
import Sistema.SistemaGerenciamento

fun main() {
    val sistema = SistemaGerenciamento()
    var opcao: Int

    do {
        sistema.exibirMenu()
        println("Escolha uma opção:")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> {
                println("Digite o modelo do carro:")
                val modelo = readLine()!!
                println("Digite a quantidade de portas:")
                val portas = readLine()!!.toInt()
                println("Digite o câmbio (automatico ou convencional):")
                val cambio = readLine()!!
                println("Digite a cor do carro:")
                val cor = readLine()!!
                println("Direção hidráulica? (sim ou nao):")
                val direcao = readLine()!!
                println("Digite o valor do carro:")
                val valor = readLine()!!.toDouble()

                val carro = Carros(modelo, portas, cambio, cor, direcao, valor)
                sistema.adicionarCarro(carro)
                println("Carro adicionado com sucesso!")
            }
            2 -> {
                println("Digite o modelo da moto:")
                val modelo = readLine()!!
                println("Digite o ano de fabricação:")
                val anoFabricacao = readLine()!!.toInt()
                println("Digite a cor da moto:")
                val cor = readLine()!!
                println("Digite a velocidade máxima:")
                val velocidadeMaxima = readLine()!!.toInt()
                println("Digite o valor da moto:")
                val valor = readLine()!!.toDouble()

                val moto = Motos(modelo, anoFabricacao, cor, velocidadeMaxima, valor)
                sistema.adicionarMoto(moto)
                println("Moto adicionada com sucesso!")
            }
            3 -> sistema.mostrarCarrosAzuis()
            4 -> sistema.mostrarMotosRosas()
            5 -> sistema.mostrarCarroMaisCaro()
            6 -> sistema.mostrarMotoMaisCara()
            7 -> {
                println("Digite o modelo do carro para alterar o valor:")
                val modelo = readLine()!!
                println("Digite o novo valor:")
                val novoValor = readLine()!!.toDouble()
                sistema.alterarValorCarro(modelo, novoValor)
            }
            8 -> {
                println("Digite o modelo da moto para remover:")
                val modelo = readLine()!!
                sistema.removerMoto(modelo)
            }
            9 -> println("Saindo do sistema...")
            else -> println("Opção inválida. Tente novamente.")
        }

    } while (opcao != 9)
}