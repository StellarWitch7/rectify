package stellarwitch7.rectify

import net.fabricmc.api.ClientModInitializer
import stellarwitch7.rectify.revision.ModRevisions

object RectifyClient : ClientModInitializer {
	override fun onInitializeClient() {
		ModRevisions.register()
	}
}