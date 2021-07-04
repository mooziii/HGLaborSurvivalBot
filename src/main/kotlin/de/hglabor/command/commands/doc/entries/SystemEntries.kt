package de.hglabor.command.commands.doc.entries

import de.hglabor.command.commands.doc.DocEntry

object ChatEntry : DocEntry(
    "ChatSystem",
    ":bell: Wenn du jemandem im Chat erwähnen (Pingen) möchtest, kannst du einfach seinen Namen in deine Nachricht einbauen und er bekommt eine Benachrichtigung.\n :paperclips: Wenn deine Nachricht mit `;` startet, kann man diese durch einen Klick darauf in die Zwischenablage kopieren.",
    "Erhalte Informationen über das ChatSystem auf HGLaborSurvival.",
    "https://cdn.discordapp.com/attachments/804656969281175602/825640770417197086/unknown.png",
    "MooZiii",
    arrayListOf("ping", "chat", "chatsystem")
)

object ColorCommandEntry : DocEntry(
    "ColorCommand",
    "Der `/color` Command erlaubt es Spielern ihre Schriftfarbe im Chat zu ändern. Die Syntax ist `/color <color>`.",
    "Der `/color` Command erlaubt es Spielern ihre Schriftfarbe zu ändern...",
    "https://i.imgur.com/Zm01NI0.png",
    "MooZiii",
    arrayListOf("/color", "color", "colorcommand", "/color-command", "color-command")
)

object SpawnEntry : DocEntry(
    "Spawn",
    "Dies ist der Ort an dem du Spawnst wenn du den Server das erste mal betrittst. Durch die Regeln von dem Survival Server, kann man sich sicherlich schon vorstellen, dass der Spawn dort etwas \"anders\" ist. Am Spawn kann jeder bauen, abbauen oder sogar Wither spawnen.",
    "Der Spawn von HGLaborSurvival ist außergewöhnlich..",
    "https://i.imgur.com/qWdE6OT.jpg",
    "MooZiii",
    arrayListOf("spawn")
)

object RulesEntry : DocEntry(
    "Regeln",
    "Auf Survival herrscht Anarchie, das heißt, dass jeder tun und lassen kann was er will, ohne einen Bann zu erhalten.",
    "Zeigt die Regeln vom Survival Server an",
    "",
    "MooZiii",
    arrayListOf("rules", "regeln")
)

object CombatLogEntry : DocEntry(
    "CombatLogging",
    "Dieses Feature verbietet es, sich im Fight auszuloggen. Sobald du einen Spieler schlägst seid ihr beide in einer 5 sekündigen Kampfphase. Sollte sich einer von euch beiden während dieser Kampfphase ausloggen, stirbt er.",
    "Dieses Feature verbietet es, sich im Fight auszuloggen.",
    "https://i.imgur.com/ldTLPzH.png",
    "MooZiii",
    arrayListOf("combatlogging", "anticombatlogging")
)