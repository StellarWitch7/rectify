package stellarwitch7.rectify.revision

import dev.enjarai.trickster.revision.Revision
import dev.enjarai.trickster.revision.RevisionContext
import dev.enjarai.trickster.spell.Fragment
import dev.enjarai.trickster.spell.Pattern
import dev.enjarai.trickster.spell.SpellPart

open class FragmentRevision(private val pattern: Pattern, private val fragment: Fragment) : Revision {
    override fun pattern(): Pattern {
        return pattern
    }

    override fun apply(ctx: RevisionContext, root: SpellPart, drawingPart: SpellPart): SpellPart {
        drawingPart.glyph = fragment
        return root
    }
}