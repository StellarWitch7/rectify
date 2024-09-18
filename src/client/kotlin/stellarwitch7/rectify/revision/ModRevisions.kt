package stellarwitch7.rectify.revision

import dev.enjarai.trickster.revision.Revision
import dev.enjarai.trickster.revision.Revisions
import dev.enjarai.trickster.spell.Pattern

object ModRevisions {
    val zero: Revision = Revisions.register(NumericRevision(Pattern.of(1, 4, 3), 0.0))
    val one: Revision = Revisions.register(NumericRevision(Pattern.of(1, 4, 5), 1.0))
    val ten: Revision = Revisions.register(NumericRevision(Pattern.of(3, 4, 5), 10.0))

    fun register() {

    }
}