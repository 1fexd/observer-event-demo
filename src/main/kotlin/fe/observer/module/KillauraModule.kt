package fe.observer.module

import fe.observer.event.EnableModuleEvent
import fe.observer.event.RotationUpdateEvent
import fe.observer.event.RotationUpdateEventHandler
import fe.observer.event.base.EventReceiver
import fe.observer.module.base.Module

object KillauraModule : Module("Killaura"), RotationUpdateEventHandler {
    override val enable = EventReceiver<EnableModuleEvent> {
        println("Enable Killaura")
    }

    override val rotationUpdate = EventReceiver<RotationUpdateEvent> { event ->
        println("Killaura rotationUpdate: $event")
    }
}
