object Acronym {
    fun generate(phrase: String): String {
        val cleanPhrase = phrase
            .replace(Regex("[^\\w\\s-]+|_"), "")
            .replace("-", " ")
            .replace(Regex("\\s+"), " ");

        return cleanPhrase
            .split(" ")
            .filter { x -> x.isNotBlank() }
            .map { x -> x.first().uppercaseChar() }
            .joinToString("")
    }
}
