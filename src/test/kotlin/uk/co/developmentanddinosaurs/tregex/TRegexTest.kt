package uk.co.developmentanddinosaurs.tregex

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class TRegexTest : BehaviorSpec({

    Given("a T-Regex builder") {
        
        When("we provide a literal string") {
            val pattern = TRegex {
                literally("hello world")
            }

            Then("it generates the raw string as the regex pattern") {
                pattern.pattern shouldBe "hello world"
            }

            Then("it successfully matches the target string") {
                pattern.matches("hello world") shouldBe true
            }
        }
    }

})
