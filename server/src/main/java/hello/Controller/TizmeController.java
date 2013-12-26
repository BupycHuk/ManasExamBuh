package hello.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.AddSellerRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Component
@Controller

public class TizmeController {
    @RequestMapping(value = "/tizmeler")
    public @ResponseBody
    Iterable<Tizme> listTizmeler() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addTizme",method = RequestMethod.POST)
    public @ResponseBody
    Tizme addTizme(@RequestBody AddTizmeRequest addTizmeRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Tizme tizme= new Tizme(addTizmeRequest.getName());
        getRepository().save(tizme);
        return tizme;
    }
    @RequestMapping(value = "/delete/{name}")
    public @ResponseBody
    boolean deleteUser(@PathVariable("name") String name) {
        Iterable<Tizme> tizme = getRepository().findBytizmeName(name);
        getRepository().delete(tizme);
        return true;
    }

    public TizmeRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(TizmeRepository.class);
    }
}

