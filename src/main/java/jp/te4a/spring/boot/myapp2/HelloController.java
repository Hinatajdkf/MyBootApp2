package jp.te4a.spring.boot.myapp2;

/**
 * Hello world!
 *
 */
@RestController
public class helloController 
{
    @RequestMapping("/taro")
    public String index(){
        return "Sato desu!";
    }
}
