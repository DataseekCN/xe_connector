package info.dataseek.xe_connector.utils;

import info.dataseek.xe_connector.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus("success");
        resultVO.setMessage("user registration successful");
        resultVO.setData(data);
        return resultVO;
    }
}
