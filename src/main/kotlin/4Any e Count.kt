fun main() {
    val data = geraDados()

    // Tenho receitas na lista? caso do any(se temos alguma coisa), se temos "any > 0" é true, caso contrario, false.
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")
    // Quantas receitas tenho na coleção? temos 6 elementos, 6 receitas.
    println("Tenho ${data.count()} elementos.")

    // First & Last = Qual a primeira e última receita?
    println("A primeira receita é ${data.first().nome}.")
    println("A ultima receita é ${data.last().nome}.")

    // Caso a lista possa ser vazia e queiramos ver o primeiro e o ultimo.
    // data.firstOrNull()
    // data.lastOrNull()

    // soma = qual a soma das calorias de todas as receitas juntas, soma dados numericos. sumOf e conseguimos trabalhar com 1 atributo do objt usamos o "it"
    val sumCalorias = data.sumOf { it.calorias }
    println("A soma das calorias é: ${sumCalorias}.")

    // filter = se existe algum elemento na sua lista cujo é dito ali como exemplo "lasanha". O outro ex é usando .any() no final
    println(data.filter { it.nome == "Lasanha" })
    println(data.any { it.calorias > 500 })

    //take & takelast = pega o primeiro e o ultimo elemento de uma lista.
    val firstReceita = data.take(1)
    for (x in firstReceita.withIndex()) {
        // o index é valor 0, por isso o +1, pra ficar 1 no println
        println("${x.index + 1} - {${x.value.nome}}")
    }
    val lastReceita = data.takeLast(1)
    for (y in lastReceita.withIndex()) {
        println("${y.index + 2} - {${y.value.nome}}")
    }

    // forEach =  Quais são as comidas com mais de 500 calorias?
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // max & min = Qual a receita mais calórica? E a menos calórica?
    // maxByOrNull ira retornar o objeto inteiro da caloria
    println(data.maxByOrNull { it.calorias })
    // maxOf vai retornar somente o numero das calorias
    println(data.maxOf { it.calorias })
    // um jeito mais legal de se mostrar no println das calorias junto com o nome do objeto.
    val maisCal = data.maxByOrNull { it.calorias }
    println("Mais calorias: ${maisCal?.nome}")
    // igual o de cima.
    val minCal = data.minByOrNull { it.calorias }
    println("Menos Calorias: ${minCal?.nome}")

    // Map = faça uma lista com os nomes das receitas
    println(data.map { it.nome })

    // average = (ela procura a Média), qual a media de calorias de todas as receitas?
    val media = data.map { it.calorias }.average()
    println("A média de todas as calorias é: $media.")

    // Lista de dados simples
    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}.")

    // Eliminar receitas com mesmo nome ou seja, nao mostra nomes duplicados no priontln
    println(data.distinctBy { it.nome })

    // Ordenar uma lista, ordem crescente.
    println(listaInteiros.sorted())
    // ordem decrescente
    println(listaInteiros.sortedDescending())
    // Inverter uma lista
    println(listaInteiros.reversed())
}

private fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)