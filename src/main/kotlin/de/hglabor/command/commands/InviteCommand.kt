package de.hglabor.command.commands

import de.hglabor.command.SlashCommand
import dev.kord.common.Color
import dev.kord.common.annotation.KordPreview
import dev.kord.core.behavior.interaction.followUp
import dev.kord.core.entity.interaction.Interaction
import dev.kord.rest.builder.message.EmbedBuilder

@KordPreview
object InviteCommand : SlashCommand(
    name = "invite",
    description = "Erhalte den Link um den Bot zu deinem Server einzuladen"
) {
    override suspend fun handleCommand(interaction: Interaction) {
        interaction.ackowledgePublic().followUp {
            embed {
                title = "Einladungslink"
                description = "Klicke [hier](https://discord.com/api/oauth2/authorize?client_id=821126948419534868&permissions=2147609664&scope=bot%20applications.commands) um den Bot in deinen Server einzuladen."
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