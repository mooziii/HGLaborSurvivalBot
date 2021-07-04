package de.hglabor.command.commands

import de.hglabor.command.CommandManager
import de.hglabor.command.SlashCommand
import dev.kord.common.Color
import dev.kord.common.annotation.KordPreview
import dev.kord.core.behavior.interaction.followUp
import dev.kord.core.entity.interaction.Interaction
import dev.kord.rest.builder.message.EmbedBuilder

@KordPreview
object HelpCommand : SlashCommand(
    name = "help",
    description = "Get help about every command"
) {
    override suspend fun handleCommand(interaction: Interaction) {
        interaction.ackowledgePublic().followUp {
            embed {
                title = "Hilfe"
                val thumb = EmbedBuilder.Thumbnail()
                thumb.url = interaction.kord.getSelf().avatar.url
                thumbnail = thumb
                val foot = EmbedBuilder.Footer()
                foot.icon = interaction.kord.getSelf().avatar.url
                foot.text = "HGLaborSurvival Bot"
                footer = foot
                color = Color(0, 251, 255)
                for (slashCommand in CommandManager.commands.values) {
                    field {
                        name = "/${slashCommand.name}"
                        value = slashCommand.description
                    }
                }
            }
        }
    }


}