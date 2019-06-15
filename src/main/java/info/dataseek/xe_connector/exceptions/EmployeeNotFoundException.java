package info.dataseek.xe_connector.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Integer id) {
        super("Could not find employee with id= " + id);
    }
}
