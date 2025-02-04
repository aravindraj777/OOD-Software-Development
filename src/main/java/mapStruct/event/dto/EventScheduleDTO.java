package mapStruct.event.dto;

public class EventScheduleDTO {
    public int id;
    public EventDTO event;
    public String startTime;
    public String endTime;

    @Override
    public String toString() {
        return "EventScheduleDTO{" +
                "id=" + id +
                ", event=" + event +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
