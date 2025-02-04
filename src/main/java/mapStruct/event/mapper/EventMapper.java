package mapStruct.event.mapper;

import mapStruct.event.dto.EventDTO;
import mapStruct.event.entities.EventEntity;
import mapStruct.event.enums.EventType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EventMapper {

    //Singleton instance of EventMapper to use over the entire application.
    EventMapper INSTANCE  = Mappers.getMapper(EventMapper.class);


    /**
     * Maps an EventEntity object to an EventDTO object with various mapping types.
     */
    @Mapping(source = "eventType",target = "eventType",qualifiedByName = "mapEventType") // Custom mapping
    @Mapping(source = "eventDate",target = "eventDate",dateFormat = "dd-MM-yyyy HH:mm") // DateFormat(Datatype Conversion)
    @Mapping(source = "ticketPrice", target = "formattedPrice",numberFormat = "$#.00") // NumberFormat(Datatype Conversion)
    @Mapping(expression = "java(event.getAttendees() > 100 ? \"Large Event\" : \"Small Event\")" , target = "status") // mapping using expression
    @Mapping(constant = "500",target = "attendees") //Constant mapping
    @Mapping(target = "name", defaultExpression = "java(event.getName() == null ? \"Unnamed Event\" : event.getName())") //expression
    EventDTO eventToEventDto(EventEntity event);


//    Custom mapping method to map the event type
    @Named(value = "mapEventType")
    static String mapEventType(EventType eventType){
        return eventType.name();
    }

}
