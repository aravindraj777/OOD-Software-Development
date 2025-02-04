package mapStruct.event.service;

import mapStruct.event.dto.ParticipantDTO;
import mapStruct.event.entities.ParticipantEntity;
import mapStruct.event.mapper.ParticipantMapper;

/**
 * Service class responsible for handling participant-related operations.
 */
public class ParticipantService {

    /**
     * Uses MapStructs generated mapper instance to convert ParticipantEntity to ParticipantDTO.
     *
     * @param participant The entity to be mapped to ParticipantDTO.
     * @return The mapped ParticipantDTO with transformed data.
     */
    public ParticipantDTO getParticipantDetails(ParticipantEntity participant){
        return ParticipantMapper.INSTANCE.participantToParticipantDto(participant);
    }
}
