package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnMarshalling {

    public static void unMarshalling(String filePath){
        try {
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Employee employee = (Employee) unmarshaller.unmarshal(file);
            System.out.println(employee.getEmployeeName()+" "+employee.getEmployeeId());
        } catch (JAXBException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
