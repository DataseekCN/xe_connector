package info.dataseek.xe_connector.controller;

import info.dataseek.xe_connector.dataobject.User;
import info.dataseek.xe_connector.dto.UserDTO;
import info.dataseek.xe_connector.service.IUserService;
import info.dataseek.xe_connector.utils.ResultVOUtil;
import info.dataseek.xe_connector.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "UserController")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private StringEncryptor stringEncryptor;

    @ApiOperation(value = "sign up")
    @PostMapping("/signup")
    public ResultVO<UserDTO> signUp(@RequestBody User user) {
        //TODO: need input validation?
        user.setPassword(stringEncryptor.encrypt(user.getPassword()));
        User result = userService.save(user);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(result, userDTO);

        return ResultVOUtil.success(userDTO);
    }

}
