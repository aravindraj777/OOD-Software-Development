package mapStruct.field;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FieldTestCase {

    @Test
    public void accessLevelTest() throws Exception{
        PersonDBObj personDBObj = new PersonDBObj();
        personDBObj.id = 1L;
        personDBObj.firstName = "Aravind";
        personDBObj.lastName  = "raj";
        personDBObj.dob = new Date(50, 0 , 1);

        IPersonMapper personMapper = Mappers.getMapper(IPersonMapper.class);
        PersonDto dto = personMapper.toPersonDto(personDBObj);

        assertNotNull(dto);
        assertEquals(personDBObj.id,dto.personId);
        assertEquals(personDBObj.firstName,dto.firstName);
        System.out.println("test correct");
        assertEquals(personDBObj.lastName,dto.lastName);
//        assertEquals(personDBObj.dob,dto.);
    }
}
