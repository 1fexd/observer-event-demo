package fe.observer.event.base

import kotlin.reflect.KClass

interface Event

interface EventHandler

abstract class EventSender<E : Event, H : EventHandler>(
    val eventClass: KClass<E>,
    val getReceiverFn: (H) -> EventReceiver<E>?
) {
    fun sendEvent(handler: EventHandler, event: Event) {
        getReceiverFn(handler as H)?.send(event as E)
    }
}
