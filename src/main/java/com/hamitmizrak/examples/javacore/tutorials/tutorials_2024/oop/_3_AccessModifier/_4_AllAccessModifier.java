package com.hamitmizrak.examples.javacore.tutorials.tutorials_2024.oop._3_AccessModifier;


import com.hamitmizrak.examples.javacore.project.utils.SpecialColor;
import com.hamitmizrak.examples.javacore.  tutorials.tutorials_2024._3_week.Week3_02_Access_1_PublicAccessModifier;


public class _4_AllAccessModifier {

    public static void main(String[] args) {
        Week3_02_Access_1_PublicAccessModifier accessModifier= new Week3_02_Access_1_PublicAccessModifier();
        System.out.println(SpecialColor.BLUE+accessModifier.publicData+SpecialColor.RESET);
        //System.out.println(SpecialColor.YELLOW+accessModifier.defaultData+SpecialColor.RESET);
        //System.out.println(SpecialColor.PURPLE+accessModifier.protectedData+SpecialColor.RESET);
        //System.out.println(SpecialColor.RED+accessModifier.privateData+SpecialColor.RESET);
    }
}
