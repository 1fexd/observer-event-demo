package fe.observer

import fe.observer.event.EnableModuleEvent
import fe.observer.event.EnableModuleEventHandler
import fe.observer.event.RotationUpdateEvent
import fe.observer.event.RotationUpdateEventHandler
import fe.observer.event.base.EventManager
import fe.observer.module.ChestStealerModule
import fe.observer.module.KillauraModule
import fe.observer.module.SpeedModule

fun main() {
    val eventManager = EventManager(
        listOf(SpeedModule, KillauraModule, ChestStealerModule),
        listOf(EnableModuleEventHandler, RotationUpdateEventHandler)
    )

    eventManager.sendEvent(EnableModuleEvent)
    eventManager.sendEvent(SpeedModule, EnableModuleEvent)
    eventManager.sendEvent(RotationUpdateEvent(0.0, 1.0))
}
