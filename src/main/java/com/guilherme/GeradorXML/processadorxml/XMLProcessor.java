package com.guilherme.GeradorXML.processadorxml;


import java.lang.reflect.Field;

public class XMLProcessor {

    public static String generateXMLBody(Object o) throws Exception{
        StringBuilder str = new StringBuilder();

        str.append("<"+o.getClass().getSimpleName()+">\n");

        Field[] atributos = o.getClass().getDeclaredFields();

        for (Field atr: atributos){
            if (!atr.canAccess(o)){
                atr.setAccessible(true);
            }
            switch(atr.getType().getName()){
                case "int":
                case "double":
                case "float":
                case "java.lang.String":
                str.append("<"+atr.getName()+">" + atr.get(o) + "</"+atr.getName()+">\n");
                break;
                default: // se ele é um obejeto -> ai eu uso a definiçao recursiva do processador xml
                    str.append(generateXMLBody(atr.get(o)));
                    break;
            }
        }
        str.append("</"+o.getClass().getSimpleName()+">");
        str.append("</xml>");

        return str.toString();
    }

    public static String generateXML(Object o) throws Exception{
        return "<xml version=\"1.0\">\n"+generateXMLBody(o)+"\n</xml>";
    }
}
