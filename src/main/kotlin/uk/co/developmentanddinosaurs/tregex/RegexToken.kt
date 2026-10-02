package uk.co.developmentanddinosaurs.tregex

sealed interface RegexToken {
    fun toRegexString(): String
}

class LiteralToken(val text: String) : RegexToken {
    override fun toRegexString(): String = text
}
