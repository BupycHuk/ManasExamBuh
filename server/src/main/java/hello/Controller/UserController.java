package hello.Controller;

import hello.Config;
import hello.Model.Repository.UserRepository;
import hello.Model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class UserController {
    @RequestMapping(value = "/users")
    public @ResponseBody
    Iterable<User> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public @ResponseBody
    User addUser(@RequestBody hello.Model.RequestDto.AddUserRequest addUserRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        User user= new User(addUserRequest.getName(),addUserRequest.getEmail(),addUserRequest.getPassword(),addUserRequest.create_time());
        getRepository().save(user);
        return user;
    }

    @RequestMapping(value = "/delete/{name}")
    public @ResponseBody
    boolean deleteUser(@PathVariable("name") String name) {
        Iterable<User> user = getRepository().findByName(name);
        getRepository().delete(user);
        return true;
    }

    public UserRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(UserRepository.class);
    }


}

