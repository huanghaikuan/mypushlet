package com;
import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;
public class HelloWorldPlushlet {   
    static public class HwPlushlet extends EventPullSource {
        // –›√ﬂŒÂ√Î
        @Override
        protected long getSleepTime() {
            return 5000;
        }
        @Override
        protected Event pullEvent() {
            Event event = Event.createDataEvent("/cuige/he");
            event.setField("mess", "hello,world!Plushlet!");
            return event;
        }
    }
}
