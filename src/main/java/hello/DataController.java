package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody JSONData sendData() {
        return new JSONData("this is a commit", 8.0);
    }
}
