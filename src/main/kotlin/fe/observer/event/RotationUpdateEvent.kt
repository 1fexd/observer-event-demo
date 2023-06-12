package fe.observer.event

import fe.observer.event.base.Event
import fe.observer.event.base.EventHandler
import fe.observer.event.base.EventReceiver
import fe.observer.event.base.EventSender

data class RotationUpdateEvent(val yaw: Double, val pitch: Double) : Event

interface RotationUpdateEventHandler : EventHandler {
    val rotationUpdate: EventReceiver<RotationUpdateEvent>

    companion object : EventSender<RotationUpdateEvent, RotationUpdateEventHandler>(
        RotationUpdateEvent::class,
        RotationUpdateEventHandler::rotationUpdate
    )
}
