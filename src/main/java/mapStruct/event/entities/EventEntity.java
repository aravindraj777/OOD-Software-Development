package mapStruct.event.entities;

import mapStruct.event.enums.EventType;

import java.time.LocalDateTime;

public class EventEntity {

    private int id;
    private String name;
    private EventType eventType;
    private LocalDateTime eventDate;
    private double ticketPrice;
    private VenueEntity venue;
    private int attendees;

    @Override
    public String toString() {
        return "EventEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eventType=" + eventType +
                ", eventDate=" + eventDate +
                ", ticketPrice=" + ticketPrice +
                ", venue=" + venue +
                ", attendees=" + attendees +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public VenueEntity getVenue() {
        return venue;
    }

    public void setVenue(VenueEntity venue) {
        this.venue = venue;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }


}
