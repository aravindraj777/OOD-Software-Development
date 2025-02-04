package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;

public class Testing {

    public static void main(String[] args) throws JAXBException {

        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Aravind");
        employee.setDestination("Trivandrum");
        employee.setGrade("M1");

        JAXBContext context = JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(employee,System.out);

        File file = new File("employee.xml");
        marshaller.marshal(employee,file);
        System.out.println("Successfully done");

        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(employee,stringWriter);
        String xml = stringWriter.toString();
        System.out.println(xml);
        UnMarshalling.unMarshalling("employee.xml");
    }
}
