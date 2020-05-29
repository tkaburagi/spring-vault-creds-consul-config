package run.kabuctl.vaultcredsfs.Controller;

import org.springframework.web.bind.annotation.*;
import run.kabuctl.vaultcredsfs.Entity.User;
import run.kabuctl.vaultcredsfs.MysqlCreds;
import run.kabuctl.vaultcredsfs.Repository.UserJpaRepository;

import java.util.*;

@RestController
public class DemoController {

    private User u = new User();
    private final UserJpaRepository userJpaRepository;

    public DemoController(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @GetMapping("/hi")
    public String hi() throws Exception {
        MysqlCreds mysqlCreds = new MysqlCreds();
        return mysqlCreds.getCreds()[0] + " : " + mysqlCreds.getCreds()[1];
    }

    @GetMapping(value = "/api/v1/get-all-users")
    public Object getAllUsers() {
        return userJpaRepository.findAll();
    }
}