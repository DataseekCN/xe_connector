package info.dataseek.xe_connector.enums;

import lombok.Getter;

@Getter
public enum ActivationStatusEnum {

    INACTIVATED(0),
    ACTIVATED(1)
    ;

    private int code;

    ActivationStatusEnum(int code) {
        this.code = code;
    }
}
