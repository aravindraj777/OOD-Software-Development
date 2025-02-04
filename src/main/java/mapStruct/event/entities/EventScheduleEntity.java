package mapStruct.event.entities;

import java.time.LocalDateTime;

public class EventScheduleEntity {
    private int id;
    private EventEntity event;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EventEntity getEvent() {
        return event;
    }

    public void setEvent(EventEntity event) {
        this.event = event;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "EventScheduleEntity{" +
                "id=" + id +
                ", event=" + event +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
