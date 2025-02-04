package mapStruct.event.dto;

public class ParticipantDTO {
    public int id;
    public String name;
    public String email;
    public String registrationStatus;

    @Override
    public String toString() {
        return "ParticipantDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", registrationStatus='" + registrationStatus + '\'' +
                '}';
    }
}
