package de.hglabor.command.commands.doc.entries

import de.hglabor.command.commands.doc.DocEntry

object BiomeEntry : DocEntry(
    "Biome",
    "Es wurde fast jedes Biom überarbeitet, da es sehr viel ist, schau einfach selbst nach und erkunde die Welt, macht auch mehr Spaß plus du hast einen sicheren Platz zum bauen. Außerdem wurden Caves stark überarbeitet und der Nether generiert nun in voller größe (0-256). Ein Biom möchte ich euch aber trotzdem zeigen, da es sehr gefährlich ist. **Toxic Forest** Hier spawnen mehr feindliche Mobs, viele Bienen und random Gasgebiete. Solltest du ein solches Gasgebiet finden, heißt es, dass sich in der Nahe im Untergrund ein Ancient Debris (oder Emerald) Erz befindet. In diesem Biom spawnen extrem viele Erze. Doch pass auf, diese Gasgebiete kannst du nur mit genug filtern & einer Gasmaske betreten.",
    "Es wurde fast jedes Biom überarbeitet, da es sehr viel ist, schau einfach selbst nach und erkunde die Welt, macht auch mehr Spaß plus du hast einen sicheren Platz zum bauen.",
    "https://camo.githubusercontent.com/31d87fab37f4dd5abbfdf2a479ed894d5d79868eddb98c573c9df77a260803ff/68747470733a2f2f692e696d6775722e636f6d2f316e533059444c2e706e67",
    "mooziii",
    arrayListOf("biomes", "toxic-forest")
)

object StructuresEntry : DocEntry(
    "Structures",
    "Strukturen wie Dörfer, Pillager Outposts oder Mansions wurden komplett überarbeitet. Die Mansions, wie ihr sie kennt wurden ganz entfernt und durch eine Burg ausgetauscht. Dort findet ihr neuen Loot, neue Spawner und mehr. Neue Dörfer wurden hinzugefügt & alte überarbeitet. Zum Beispiel gibt es ein neues Dschungel Dorf und ein neues Quartz-Dorf. Andere Structures könnt ihr auch jederzeit finden",
    "Strukturen wie Dörfer, Pillager Outposts oder Mansions wurden komplett überarbeitet...",
    "",
    "mooziii",
    arrayListOf("villages", "structures", "mansions")
)

object LootDropsEntry : DocEntry(
    "LootDrops",
    "Alle 2 Stunden kann ein Lootdrop spawnen, wo dieser spawnt und was darin ist, ist komplett random und jedes mal anders. Ihr erfahrt mehr Infos dazu im Chat. Diese Lootdrops werden mit Sounds & Explosionen dargestellt, nach einer Zeit hört dieser Effekt auf. Sobald der Effekt aufhört dauert es nicht mehr lange bis der Lootdrop dort erscheint!",
    "Alle 2 Stunden kann ein Lootdrop spawnen...",
    "",
    "mooziii",
    arrayListOf("lootdrops")
)

object JetpackEntry : DocEntry(
    "Jetpack",
    "Das Jetpack hat eine Item-Beschreibung, wie ihr es bedient. Außerdem verbraucht es Blaze-Rods aus deinem Inventar.\n \n**Sprinten** - Steigen\n**Sneaken** - Sinken\n**Still stehen** - hovern.",
    "Lerne wie du das Jetpack steuerst.",
    "https://camo.githubusercontent.com/e9f5c8591be08bf295fb81244782781a3f2e2b476e1e84367c697215d393473d/68747470733a2f2f692e696d6775722e636f6d2f727435334b4a502e706e67",
    "mooziii",
    arrayListOf("jetpack")
)

object ParachuteEntry : DocEntry(
    "Parachute",
    "Der Fallschirm aktiviert sich von ganz automatisch, sobald ihr mehr als 30 Blöcke herunterfallt",
    "Lerne mehr über den Fallschirm in HGLaborSurvival.",
    "https://camo.githubusercontent.com/b997507b0b11c5bc6b2df168c973fb95053f8358a85e4db51ded4d968445eb35/68747470733a2f2f692e696d6775722e636f6d2f375675557570692e706e67",
    "mooziii",
    arrayListOf("parachute", "fallschirm")
)

object TemperatureObject : DocEntry(
    "Temperature",
    "Ein großer Teil des Survivals ist auch die neue Temperatur. Euer aktuelles Temperaturlevel seht ihr in der Action-Bar, je höher das Level, desto höher ist die Wahrscheinlichkeit dass ihr sterbt. Kühlen könnt ihr euch in kalten Biomen, Wasser (ihr müsst ganz im Wasser sein), auf Eis und auf Clay. Wenn ihr Feuer Resistenz habt, wird diese Temperatur ignoriert solange der Effekt läuft. Wichtig ist noch: Die Temperaturen zählen auch im Nether.",
    "Ein großer Teil des Survivals ist auch die neue Temperatur...",
    "",
    "mooziii",
    arrayListOf("temperatures", "temperature", "temperaturen")
)

object GasEntry : DocEntry(
    "Gas",
    "Wie schon mehrmals erwähnt gibt es jetzt Gas. In dem Gas sterbt ihr recht schnell, weshalb ihr eine Gasmaske zum überleben braucht. Siehe `Gasmask` & `Gasfilter`",
    "Wie schon mehrmals erwähnt gibt es jetzt Gas...",
    "https://camo.githubusercontent.com/28acfa6bbd0033009ad7dd14096c410c0deabd085f558bda88ba42cec179222e/68747470733a2f2f692e696d6775722e636f6d2f48725149356f742e706e67",
    "mooziii",
    arrayListOf("gas")
)

object GasmaskEntry : DocEntry(
    "Gasmask",
    "Diese Gasmaske verbraucht 2 Gasfilter pro m3 Gas. Siehe auch `Gas` & `Gasfilter`",
    "Lerne mehr über die Gasmaske von HGLaborSurvival.",
    "https://camo.githubusercontent.com/fc1a805d515c5e01a082ac46dfeb303e275e27bcdfc31f49b67a247241cdb1df/68747470733a2f2f692e696d6775722e636f6d2f705433396159372e706e67",
    "mooziii",
    arrayListOf("gasmask", "gasmaske")
)

object GasfilterEntry : DocEntry(
    "Gasfilter",
    "Siehe auch `Gasmask` & `Gas`",
    "Diese Gasfilter filtern Gas.",
    "https://camo.githubusercontent.com/4ecb7180dc396edc2822ac9e4ea845522fbf5969c340575d57f7206489667a8f/68747470733a2f2f692e696d6775722e636f6d2f5a76386a4c61712e706e67",
    "mooziii",
    arrayListOf("gasfilter")
)

object FishingEntry : DocEntry(
    "Fishing",
    "Das Fishing System von Minecraft wurde auch überarbeitet. Es gibt viele neue Fische, mehr Trades bei Villagern & mehrere Fishing-Rods!",
    "Das Fishing System von Minecraft wurde auch überarbeitet.",
    "https://i.imgur.com/msxsOqI.png",
    "mooziii",
    arrayListOf("fishing", "fisch")
)

