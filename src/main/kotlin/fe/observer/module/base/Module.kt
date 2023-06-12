package fe.observer.module.base

import fe.observer.event.EnableModuleEvent
import fe.observer.event.EnableModuleEventHandler
import fe.observer.event.base.EventReceiver

abstract class Module(val name: String) : EnableModuleEventHandler {
    override val enable: EventReceiver<EnableModuleEvent>? = null
}
