package com.tecnicalexercises.tecnicalexercises.functionalinterface;

public class FuncInterfaceExamples {      

    public String fmtString(String str, FuncInterface logic){

        return logic.formatCode(str);
    }
}
