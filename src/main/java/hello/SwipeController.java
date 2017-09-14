//package hello;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/swipe")
//public class SwipeController {
//
//    @Autowired
//    public CountModel model;
//
//    @RequestMapping(method = RequestMethod.GET, params = {"update"})
//    public String sendUpdateMessage(@RequestParam(value="update") String update) {return model.sendSuccessString();}
//}
