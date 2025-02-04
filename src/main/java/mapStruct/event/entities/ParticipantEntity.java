package mapStruct.event.entities;

import mapStruct.event.enums.RegistrationStatus;

public class ParticipantEntity {

    private int id;
    private String name;
    private String email;
    private RegistrationStatus registrationStatus;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    @Override
    public String toString() {
        return "ParticipantEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", registrationStatus=" + registrationStatus +
                '}';
    }
}
