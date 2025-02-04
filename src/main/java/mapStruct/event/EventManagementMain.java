package mapStruct.event;

import mapStruct.event.dto.EventDTO;
import mapStruct.event.dto.ParticipantDTO;
import mapStruct.event.entities.EventEntity;
import mapStruct.event.entities.ParticipantEntity;
import mapStruct.event.entities.VenueEntity;
import mapStruct.event.enums.EventType;
import mapStruct.event.enums.RegistrationStatus;
import mapStruct.event.service.EventService;
import mapStruct.event.service.ParticipantService;

import java.time.LocalDateTime;

public class EventManagementMain {

    public static void main(String[] args) {
        // Create Venue Entity
        EventEntity event = getEvent();

        // Create Participant Entity
        ParticipantEntity participant = new ParticipantEntity();
        participant.setId(1);
        participant.setName("John Doe");
        participant.setEmail("john.doe@example.com");
        participant.setRegistrationStatus(RegistrationStatus.REGISTERED);

        // Use Service to get DTO
        EventService eventService = new EventService();
        EventDTO eventDTO = eventService.getEventDetails(event);

        ParticipantService participantService = new ParticipantService();
        ParticipantDTO participantDTO = participantService.getParticipantDetails(participant);

        // Output DTO values
        System.out.println("Event DTO: ");
        System.out.println("Name: " + eventDTO.name);
        System.out.println("Type: " + eventDTO.eventType);
        System.out.println("Date: " + eventDTO.eventDate);
        System.out.println("Price: " + eventDTO.formattedPrice);
        System.out.println("Venue: " + eventDTO.venue.name + " - " + eventDTO.venue.location);
        System.out.println("Attendees: " + eventDTO.attendees);
        System.out.println("Status: " + eventDTO.status);

        System.out.println("\nParticipant DTO: ");
        System.out.println("Name: " + participantDTO.name);
        System.out.println("Email: " + participantDTO.email);
        System.out.println("Status: " + participantDTO.registrationStatus);
    }

    private static EventEntity getEvent() {
        VenueEntity venue = new VenueEntity();
        venue.setId(1);
        venue.setName("Grand Hall");
        venue.setLocation( "New York");

        // Create Event Entity
        EventEntity event = new EventEntity();
        event.setId(101);
        event.setName("Tech Conference");
        event.setEventType(EventType.CONFERENCE);
        event.setEventDate( LocalDateTime.of(2025, 5, 20, 10, 30));
        event.setTicketPrice(199.99);
        event.setVenue(venue);
        event.setAttendees(90);
        return event;
    }
}
