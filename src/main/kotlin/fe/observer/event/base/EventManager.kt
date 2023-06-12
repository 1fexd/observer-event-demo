package fe.observer.event.base

class EventManager(handlers: List<EventHandler>, senders: List<EventSender<out Event, out EventHandler>>) {

    private val eventToHandlersMap = senders.associate { sender ->
        sender.eventClass to Pair(sender, handlers.filter { it::class.java.declaringClass.isAssignableFrom(it::class.java) })
    }

    fun sendEvent(handler: EventHandler, event: Event) {
        val (sender, handlers) = getSenderAndHandlers(event)
        if (handlers.contains(handler)) {
            sender.sendEvent(handler, event)
        }
    }

    fun sendEvent(event: Event) {
        val (sender, handlers) = getSenderAndHandlers(event)
        handlers.forEach { handler -> sender.sendEvent(handler, event) }
    }

    private fun getSenderAndHandlers(
        event: Event
    ): Pair<EventSender<out Event, out EventHandler>, List<EventHandler>> {
        return eventToHandlersMap[event::class] ?: error("Event $event is not registered!")
    }
}
