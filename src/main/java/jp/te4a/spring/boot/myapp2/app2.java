package jp.te4a.spring.boot.myapp2;

@RestController
public class app2 {

    @RequestMapping("/taro")
    public String index(){
        return "Sato desu!";
    }
}
