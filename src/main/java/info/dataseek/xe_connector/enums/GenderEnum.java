package info.dataseek.xe_connector.enums;

import lombok.Getter;

@Getter
public enum GenderEnum {
    FEMALE(0, "女"),
    MALE(1,"男"),
    ;

    private Integer code;
    private String note;

    GenderEnum(Integer code, String note) {
        this.code = code;
        this.note = note;
    }
}
