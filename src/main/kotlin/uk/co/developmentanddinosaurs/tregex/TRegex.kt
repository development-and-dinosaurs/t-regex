package uk.co.developmentanddinosaurs.tregex

fun TRegex(block: TRegexBuilder.() -> Unit): Regex {
    val builder = TRegexBuilder()
    builder.block()
    return Regex(builder.buildRegexString())
}

class TRegexBuilder {
    private val tokens = mutableListOf<RegexToken>()

    fun literally(text: String) {
        tokens.add(LiteralToken(text))
    }

    internal fun buildRegexString(): String {
        return tokens.joinToString("") { it.toRegexString() }
    }
}
