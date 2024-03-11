fun main() {
    /*
     - List é uma Collections
     - listof é imutavel, uma vez que voce define, voce nao consegue modificar os valores.
     */
    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    /*
     - voce pode ou nao definir o tipo
     - mutablelist é mutavel, vc consegue modificar os valores. Isso seria como se fosse o val e var, listof seria o var (imutavel) e o mutablelist val (mutavel).
     */
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(lst1[0])
    println(lst1.size)

    lst2.add(8)
    lst2.add(10)
    // remove o elemento 8
    lst2.remove(8)
    //remove a posição do elemento.
    lst2.removeAt(0)
    // verifica se contem um determinado elemento, e retorna em true ou false.
    lst2.contains(1)
    // limpa a lista, limpa oque eu tenho
    lst2.clear()

    println(lst2)

}