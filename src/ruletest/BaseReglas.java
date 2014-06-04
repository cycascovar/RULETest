/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletest;

import Rule.*;

/**
 *
 * 
 */
public class BaseReglas {
//    declaracion del tipo de reglas

    BooleanRuleBase br = new BooleanRuleBase("test");
//    declaracion de cariable de reglas
    RuleVariable TipoCel;
    RuleVariable PrecioCel;
    RuleVariable Motivo;
    String tipoCel;

    public void BaseReglas() {
    }

    public String getTipoCel(String precioCel, String motivo) {
        staterBR();
        PrecioCel.setValue(precioCel);
        Motivo.setValue(motivo);
        br.forwardChain();
        tipoCel = TipoCel.getValue();
        return tipoCel;
    }
    
   
    public void staterBR() {
//        instancias de variables de regla
        TipoCel = new RuleVariable(br, "TipoCel");
        PrecioCel = new RuleVariable(br, "PrecioCel");
        Motivo = new RuleVariable(br, "Motivo");
        


//        definicion de operadores logicos (condicionales)
        Condition igual = new Condition("=");
        Condition diferente = new Condition("!=");
        Condition menor = new Condition("<");
        Condition mayor = new Condition(">");

//        creacion de reglas de validacion (Base de Reglas)     
        // HUAWEI: U8185
        Rule Huawei1 = new Rule(br, "HUAWEI",
                        new Clause[]{new Clause(PrecioCel, igual, "900"), //p
                        new Clause(Motivo, igual, "intermedio")},     //p
                        new Clause(TipoCel, igual, "HUAWEI U8185")); //c
        
        Rule Huawei2 = new Rule(br, "HUAWEI",
                        new Clause[]{new Clause(PrecioCel, mayor, "700"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "HUAWEI U8185"));        
        
        Rule Huawei3 = new Rule(br, "HUAWEI",
                        new Clause[]{new Clause(PrecioCel, menor, "1000"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "HUAWEI U8185"));        
        
        // AZUMI: CHIC WF BLANCO
        Rule AZ1 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, mayor, "100"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "AZUMI CHIC WF"));        
        
        Rule AZ1_1 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, igual, "100"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "AZUMI CHIC WF"));        
        
        Rule AZ2 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, menor, "400"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "AZUMI CHIC EF"));
        
        Rule AZ2_2 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, igual, "400"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "AZUMI CHIC EF"));        
        
        Rule AZ3 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, igual, "300"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "AZUMI CHIC EF"));        
        
        // HTC: ONE X Blanco
        Rule HTC1 = new Rule(br, "HTC",
                        new Clause[]{new Clause(PrecioCel, igual, "4500"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "ONE X Blanco"));                
        
        Rule HTC2 = new Rule(br, "HTC",
                        new Clause[]{new Clause(PrecioCel, mayor, "4000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "ONE X Blanco"));                        
        
        Rule HTC3 = new Rule(br, "HTC",
                        new Clause[]{new Clause(PrecioCel, menor, "5000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "ONE X Blanco"));        
        
        // MOTOROLA XT890
        Rule MOTO1 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, menor, "6000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT890 RAZRI NEGRO"));        
        
        Rule MOTO2 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, igual, "5300"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT890 RAZRI NEGRO"));
        
        Rule MOTO3 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, mayor, "5000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT890 RAZRI NEGRO"));          
        // XT1032 MOTO G NEGRO 16 GB
        Rule MOTO4 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, mayor, "3000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));        
        
        Rule MOTO5 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, igual, "3500"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));
        
        Rule MOTO6 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, menor, "4000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));                          
        
// MOTO X XT1058 NEGRO      
        Rule MOTO7 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, mayor, "7000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));        
        
        Rule MOTO8 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, igual, "8999"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));
        
        Rule MOTO9 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, menor, "9000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));                                  
    }
}
