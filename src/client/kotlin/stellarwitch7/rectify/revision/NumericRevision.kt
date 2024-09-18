package stellarwitch7.rectify.revision

import dev.enjarai.trickster.spell.Pattern
import dev.enjarai.trickster.spell.fragment.NumberFragment

class NumericRevision(pattern: Pattern, value: Double) : FragmentRevision(pattern, NumberFragment(value))