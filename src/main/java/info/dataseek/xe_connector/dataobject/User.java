package info.dataseek.xe_connector.dataobject;

import info.dataseek.xe_connector.enums.ActivationStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
public class User {

    @Id
    private String id;

    private String userId;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @Enumerated(EnumType.ORDINAL)
    private ActivationStatusEnum activationStatus = ActivationStatusEnum.INACTIVATED;

    private String contactNumber;

    private Date createTime;

    private Date updateTime;
}
