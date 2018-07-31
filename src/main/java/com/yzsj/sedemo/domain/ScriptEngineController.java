package com.yzsj.sedemo.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.script.*;
@RestController
@RequestMapping("api/se")
public class ScriptEngineController {
    @Autowired
    ScriptEngineService seService;
    /*
    * scope: 被调用的对象在表达式中的名称
    * express: 表达式
    * */
    @GetMapping("eval")
    public ScriptEngineResult eval(String express){
        ScriptEngineResult seResult=new ScriptEngineResult();
        try {
            Object data=seService.eval(express);//执行表达式

            seResult.setData(data);
            seResult.setCode(0);
            seResult.setMsg("success");
        }
        catch (ScriptException e){
            e.printStackTrace();

            seResult.setCode(-1);
            seResult.setMsg(e.getMessage());
        }
        return seResult;
    }

}
