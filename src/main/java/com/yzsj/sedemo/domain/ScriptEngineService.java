package com.yzsj.sedemo.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@Service
@Slf4j
public class ScriptEngineService {

    //表达式中全局方法名
    private static final String SELF_NAME="$se";
    //获取ScriptEngineManager
    private static ScriptEngineManager GetEngineManager(){
        return new ScriptEngineManager();
    }
    //获取ScriptEngine
    private ScriptEngine GetScriptEngine(){
        ScriptEngine engine= GetEngineManager().getEngineByName("js");// given a name.
        engine.put(SELF_NAME,this);
        return engine;
    }
    //执行表达式
    public Object eval(String express) throws ScriptException {
        return this.GetScriptEngine().eval(express);
    }
    public long minus(long a, long b){
        return  a-b;
    }
    public long add(long a,long b){
        return  a+b;
    }
    public long max(long a,long b){
        return  a>b?a:b;
    }
    public double minus(double a, double b){
        return  a-b;
    }
    public double add(double a,double b){
        return  a+b;
    }
    public double max(double a,double b){
        return  a>b?a:b;
    }
}
