package mapStruct.multiple;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserProfileMapper {

    UserProfileMapper INSTANCE = Mappers.getMapper(UserProfileMapper.class);

    @Mapping(source = "user.name",target = "fullName")
    @Mapping(source = "user.email",target = "emailAddress")
    @Mapping(source = "user.age", target = "userAge")
    @Mapping(source = "address.street",target = "streetAddress")
    @Mapping(source = "address.city",target = "cityName")
    UserProfileDto mapToUserProfileDTO(User user, Address address);
}
