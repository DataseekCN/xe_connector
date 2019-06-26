package info.dataseek.xe_connector.vo;

import lombok.Data;

@Data
public class ResultVO<T> {

    private String status;

    private String message;

    private T data;
}
