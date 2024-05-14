package jp.te4a.spring.boot.myapp2;

@RestController
public class App2
{
    @RequestMapping("/taro")
    public String index() {
        return "Taro desu!";
    }
}

