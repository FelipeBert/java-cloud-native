package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotifierService {

    private Map<EventEnum, List<EventListener>> listener = new HashMap<>(){
        {
            put(EventEnum.CLEAR_SPACE, new ArrayList<>());
        }
    };

    public void subscribe(final EventEnum event, final EventListener eventListener){
        var selectedListeners = listener.get(event);
        selectedListeners.add(eventListener);
    }

    public void notify(final EventEnum eventType){
        listener.get(eventType).forEach(l -> l.update(eventType));
    }
}
