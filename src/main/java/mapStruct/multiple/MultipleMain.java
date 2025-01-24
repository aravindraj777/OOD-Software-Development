package mapStruct.multiple;

public class MultipleMain {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Arvind");
        user.setAge(24);
        user.setEmail("rajaravind369@gmail.com");

        Address address = new Address();
        address.setCity("Trivandrum");
        address.setStreet("Vallakkadavvu");
        address.setZipCode("695008");

        UserProfileDto userProfileDTO = UserProfileMapper.INSTANCE.mapToUserProfileDTO(user,address);
        System.out.println("Full Name: " + userProfileDTO.getFullName());
        System.out.println("Email Address: " + userProfileDTO.getEmailAddress());
        System.out.println("User Age: " + userProfileDTO.getUserAge());
        System.out.println("Street Address: " + userProfileDTO.getStreetAddress());
        System.out.println("City Name: " + userProfileDTO.getCityName());
    }
}
