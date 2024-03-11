fun main() {

    /*
    - set tambem é uma Collection, mas ele nao é um sequencia ordenada. Ou seja, ele é diferente da "list", o set pode ser desordenado.
    - set nao permite valores duplicados.
    - set é somente um conjunto, ou seja, nao é um conjunto ordenado igual o list.
    */

    // Ex: set que nao pode ser duplicados. ele vai imprimir somente 1 madri.
    val set1: Set<String> = setOf<String>("Paris", "Berlin", "Madri", "Madri")
    val set2: MutableSet<String> = mutableSetOf<String>("oi")

    // set tambem implementa as funcionalidades do Collection.
    set2.add(" tudo bem")
    set2.remove("bem")
    set2.contains(" tudo bem")
    set2.clear()
    set2.size

    //como o set é desordenado, entao nao conseguimos acessar o index do set, porq nao tem o index. como no exemplo abaixo.
//    set2[0]
    // tambem nao existe o removeAt() por causa que nao existe index.
//    set2.removeAt()
}