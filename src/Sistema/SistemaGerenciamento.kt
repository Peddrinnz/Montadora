package Sistema

import Carros.Carros
import Motos.Motos

class SistemaGerenciamento {
    private val listaMotos = mutableListOf<Motos>()
    private val listaCarros = mutableListOf<Carros>()

    fun adicionarMoto(moto: Motos) {
        listaMotos.add(moto)
    }

    fun adicionarCarro(carro: Carros) {
        listaCarros.add(carro)
    }

    fun mostrarCarrosAzuis() {
        val carrosAzuis = listaCarros.filter { it.cor.equals("Azul", ignoreCase = true) }
        if (carrosAzuis.isNotEmpty()) {
            println("Carros de cor Azul:")
            carrosAzuis.forEach { println(it) }
        } else {
            println("Nenhum carro de cor Azul encontrado.")
        }
    }

    fun mostrarMotosRosas() {
        val motosRosas = listaMotos.filter { it.cor.equals("Rosa", ignoreCase = true) }
        if (motosRosas.isNotEmpty()) {
            println("Motos de cor Rosa:")
            motosRosas.forEach { println(it) }
        } else {
            println("Nenhuma moto de cor Rosa encontrada.")
        }
    }

    fun mostrarCarroMaisCaro() {
        val carroMaisCaro = listaCarros.maxByOrNull { it.valor }
        if (carroMaisCaro != null) {
            println("Carro mais caro: $carroMaisCaro")
        } else {
            println("Nenhum carro cadastrado.")
        }
    }

    fun mostrarMotoMaisCara() {
        val motoMaisCara = listaMotos.maxByOrNull { it.valor }
        if (motoMaisCara != null) {
            println("Moto mais cara: $motoMaisCara")
        } else {
            println("Nenhuma moto cadastrada.")
        }
    }

    fun alterarValorCarro(modelo: String, novoValor: Double) {
        val carro = listaCarros.find { it.modelo.equals(modelo, ignoreCase = true) }
        if (carro != null) {
            carro.valor = novoValor
            println("Valor do carro $modelo alterado para R$$novoValor")
        } else {
            println("Carro não encontrado.")
        }
    }

    fun removerMoto(modelo: String) {
        val moto = listaMotos.find { it.modelo.equals(modelo, ignoreCase = true) }
        if (moto != null) {
            listaMotos.remove(moto)
            println("Moto $modelo removida.")
        } else {
            println("Moto não encontrada.")
        }
    }

    fun exibirMenu() {
        println("\n------ Menu ------")
        println("1. Adicionar Carro")
        println("2. Adicionar Moto")
        println("3. Mostrar Carros Azuis")
        println("4. Mostrar Motos Rosas")
        println("5. Mostrar Carro Mais Caro")
        println("6. Mostrar Moto Mais Cara")
        println("7. Alterar Valor de um Carro")
        println("8. Remover Moto")
        println("9. Sair")
    }
}