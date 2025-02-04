package mapStruct.event.mapper;

import mapStruct.event.dto.ParticipantDTO;
import mapStruct.event.entities.ParticipantEntity;
import mapStruct.event.enums.RegistrationStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParticipantMapper {

     //Singleton instance of ParticipantMapper to use over the entire application.
    ParticipantMapper INSTANCE  = Mappers.getMapper(ParticipantMapper.class);


    /**
     * Maps a ParticipantEntity object to a ParticipantDTO object.
     * The 'registrationStatus' field is mapped using a custom method to convert the enum to a string.
     *
     * @param participant The ParticipantEntity object to be mapped.
     * @return A ParticipantDTO object containing the mapped data.
     */
    @Mapping(source = "registrationStatus",target = "registrationStatus",qualifiedByName = "mapRegistrationStatus")
    ParticipantDTO participantToParticipantDto(ParticipantEntity participant);



    /**
     * Custom method to map the RegistrationStatus enum to its string representation.
     * This method is used for mapping the 'registrationStatus' field in ParticipantEntity to the
     * 'registrationStatus' field in ParticipantDTO.
     *
     * @param registrationStatus The RegistrationStatus enum to be converted.
     * @return A string representation of the RegistrationStatus enum.
     */
    @Named("mapRegistrationStatus")
    static String mapRegistrationStatus(RegistrationStatus registrationStatus){
        return registrationStatus.name();
    }
}
