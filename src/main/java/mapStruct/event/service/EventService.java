package mapStruct.event.service;

import mapStruct.event.dto.EventDTO;
import mapStruct.event.entities.EventEntity;
import mapStruct.event.mapper.EventMapper;

/**
 * Service class responsible for handling event-related operations.
 */
public class EventService {


    /**
     * Uses MapStructs generated mapper instance to convert EventEntity to EventDTO
     * @param eventEntity The entity to be passed for mapping to EventDTO
     * @return The mapped EventDTO with transformed data.
     */

    public EventDTO getEventDetails(EventEntity eventEntity){
        return EventMapper.INSTANCE.eventToEventDto(eventEntity);
    }
}
