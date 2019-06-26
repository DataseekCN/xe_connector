package info.dataseek.xe_connector.dto;

import info.dataseek.xe_connector.enums.ActivationStatusEnum;
import lombok.Data;

@Data
public class UserDTO {

    private String userId;

    private String firstName;

    private String lastName;

    private String email;

    private String contactNumber;

    private ActivationStatusEnum activationStatus;
}
