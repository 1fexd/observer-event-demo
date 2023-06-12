package fe.observer.event.base

fun interface EventReceiver<E : Event> {
    fun send(event: E)
}

