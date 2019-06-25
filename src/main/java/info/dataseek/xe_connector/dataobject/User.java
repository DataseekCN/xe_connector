package info.dataseek.xe_connector.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
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

    private String userName;

    private String email;

    private String password;

    private String contactNumber;

    private Date createTime;

    private Date updateTime;
}
