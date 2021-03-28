package de.hglabor.command.commands

import de.hglabor.command.SlashCommand
import dev.kord.common.Color
import dev.kord.common.annotation.KordPreview
import dev.kord.core.behavior.followUp
import dev.kord.core.entity.interaction.Interaction
import dev.kord.rest.builder.message.EmbedBuilder

@KordPreview
object ContributeCommand : SlashCommand(
    "contribute",
    "Erhalte den Link zur GitHub Repository vom Bot"
) {
    override suspend fun handleCommand(interaction: Interaction) {
        interaction.acknowledge().followUp {
            embed {
                title = "GitHub Repository"
                description = "Klicke [hier](https://github.com/mooziii/HGLaborSurvivalBot) um zum GitHub Repository des Bots zu gelangen."
                val thumb = EmbedBuilder.Thumbnail()
                thumb.url = interaction.kord.getSelf().avatar.url
                thumbnail = thumb
                val foot = EmbedBuilder.Footer()
                foot.icon = interaction.kord.getSelf().avatar.url
                foot.text = "HGLaborSurvival Bot"
                footer = foot
                color = Color(0, 251, 255)
            }
        }
    }
}
