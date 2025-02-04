package mapStruct.event.dto;

public class EventDTO {

    public int id;
    public String name;
    public String eventType;
    public String eventDate;
    public String formattedPrice;
    public VenueDTO venue;
    public int attendees;
    public String status;

    @Override
    public String toString() {
        return "EventDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eventType='" + eventType + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", formattedPrice='" + formattedPrice + '\'' +
                ", venue=" + venue +
                ", attendees=" + attendees +
                ", status='" + status + '\'' +
                '}';
    }
}
