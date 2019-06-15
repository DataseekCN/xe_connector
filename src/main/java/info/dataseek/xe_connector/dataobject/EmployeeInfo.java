package info.dataseek.xe_connector.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
@DynamicInsert
public class EmployeeInfo {

    public EmployeeInfo() {
    }

    public EmployeeInfo(String employeeName, Integer gender, String role, String location) {
        this.employeeName = employeeName;
        this.gender = gender;
        this.role = role;
        this.location = location;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    private String employeeName;

    /** 员工性别， 默认为1-男*/
    private Integer gender;

    private String role;

    private String location;

    private Date createTime;

    private Date updateTime;
}
