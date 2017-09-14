package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/array")
public class ArrayController {

    @Autowired
    public TextData textData;

    public String[] dataArray = textData.getData();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String[] sendDataArray() {
        return dataArray;
    }
}
