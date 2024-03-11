fun main() {

    /*
    - Map = é uma collection. Ela é do tipo chave = valor, significa que ela funciona em pares.
    - para cada chave que voce passa, voce tem um valor associado.
    - map funciona similar ao set, voce nao pode adicionar 2 valores diferentes para mesma chave, a chave tem que ser unica.
        ex: 987 -> 10
            987 -> 11 = oque vale é o 11, porq é o ultima chave informada.
    - para criar uma chamada no map, necessita de um "Pair"
    - exemplo do map1, ali o "xpto" vai ser printado porq ele foi o sobrescrevido um novo valor da Alemanha.
     */

    // map1 é imutavel - map
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "xpto"))
    //map2 é mutavel - mutableMap
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Brasil", "Brasilia"), Pair("oi", "oi"), Pair("q", "a"))

    // todas as entradas (chaves)
    println(map1.entries)
    // todos os valores associados com as chaves.
    println(map1.values)

    // adicionamos nova chaves e valores
    map2["a"] = "b"
    println(map2)

    map2.remove("Brasil")
    // verifica se contem um determinado elemento, e retorna em true ou false.
    map2.contains("Brasil")
    map2.clear()
}