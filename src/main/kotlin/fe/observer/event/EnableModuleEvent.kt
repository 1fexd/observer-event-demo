package fe.observer.event

import fe.observer.event.base.Event
import fe.observer.event.base.EventHandler
import fe.observer.event.base.EventReceiver
import fe.observer.event.base.EventSender

object EnableModuleEvent : Event

interface EnableModuleEventHandler : EventHandler {
    val enable: EventReceiver<EnableModuleEvent>?

    companion object : EventSender<EnableModuleEvent, EnableModuleEventHandler>(
        EnableModuleEvent::class,
        EnableModuleEventHandler::enable
    )
}
