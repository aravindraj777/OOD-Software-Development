package mapStruct.event.dto;

public class VenueDTO {

    public int id;
    public String name;
    public String location;

    @Override
    public String toString() {
        return "VenueDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
