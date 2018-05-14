package pcgen.cdom.facet.event;

import java.util.EventObject;

public abstract class EventObjectBase extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventObjectBase(Object source) {
        super(source);
    }
}
