package fe.observer.module

import fe.observer.event.EnableModuleEvent
import fe.observer.event.base.EventReceiver
import fe.observer.module.base.Module

object ChestStealerModule : Module("ChestStealer") {
    override val enable = EventReceiver<EnableModuleEvent> {
        println("Enable ChestStealer")
    }
}
