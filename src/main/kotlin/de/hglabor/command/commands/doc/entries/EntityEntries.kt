package de.hglabor.command.commands.doc.entries

import de.hglabor.command.commands.doc.DocEntry

object GravestoneEntry : DocEntry(
    "Gravestones",
    "Am 27.03.2021 wurde die Leichen funktion durch diese Grabstein funktion ausgetauscht. Sollte ein Spieler sterben, wird an seiner Todesstelle ein Schild platziert welches Informationen über den Tod zeigt und zuletzt die ID. Die ID ist nicht wichtig für dich, sondern nur dafür da die Items auf den Block zu binden. Sollte jemand dieses Schild abbauen, dropped der Stuff, des toten.",
    "Am 27.03.2021 wurde die Leichen funktion durch eine Grabstein funktion ausgetauscht...",
    "https://cdn.discordapp.com/attachments/804656969281175602/825636706874556436/unknown.png",
    "MooZiii",
    arrayListOf("gravestones", "gravestone", "grabstein", "grabsteine")
)

object HeadEntry : DocEntry(
    "HeadDrops",
    "Mobs können zu gewisser Wahrscheinlichkeit ihre Köpfe droppen. Looting beeinflusst die Drop-Rate dabei nicht. Wenn ein Mob \"NQRMAN\" heißt, droppt es nicht seinen Kopf, sondern einen Garfield Kopf. Diese Funktion wird in Season 2 (1.17 Patch) nicht mehr unterstützt.",
    "Informationen zu den HeadDrops auf Survival",
    "https://i.imgur.com/vcwsSm8.gif",
    "MooZiii, DrSoho",
    arrayListOf("heads", "headdrops")
)

object LootableBodiesEntry : DocEntry(
    "LootableBodies",
    "Am 18.03.2021 wurde die Funktion \"Lootable Bodies\" hinzugefügt. Dabei handelt es sich ursprünglich um eine Mod bei der gestorbene Spieler eine Leiche zurücklassen. Anstatt, dass alle Items fallen gelassen werden, werden sie im Inventar der Leiche gespeichert, sodass man sie später durch anklicken der Leiche plündern kann (XP-Level ausgeschlossen). Leichen können daraufhin mit einer Schaufel beseitigt werden. Link zur Mod: https://www.curseforge.com/minecraft/mc-mods/drcyanos-lootable-bodies Link zum Plugin: https://github.com/mooziii/LootableBodies. ~~Dieses Feature wurde am 27.03.2021 durch Grabsteine ersetzt.~~",
    "Erhalte Informationen zur LootableBodies Funktion",
    "https://cdn.discordapp.com/attachments/804656969281175602/822035516261138482/unknown.png",
    "MooZiii, DrSoho",
    arrayListOf("leichen", "lootablebodies")
)