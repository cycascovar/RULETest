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
//________________________
        /*ECONOMICOS*/
                
        // AZUMI: CHIC WF BLANCO. Precio: 300
        Rule AZ1 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, mayor, "100"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "CHIC WF"));        
        
        Rule AZ1_1 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, igual, "100"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "CHIC WF"));        
        
        Rule AZ2 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, menor, "400"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "CHIC WF"));
        
        Rule AZ3 = new Rule(br, "AZUMI",
                        new Clause[]{new Clause(PrecioCel, igual, "300"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "CHIC WF"));        
        // NOKIA 106 ($300)  
        
        Rule NOK3 = new Rule(br, "NOKIA",
                        new Clause[]{new Clause(PrecioCel, igual, "300"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "106"));     
        
        // Lanix W31 ($300)
        Rule LAN1 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, menor, "400"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "W31"));
        
        Rule LAN2 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, igual, "300"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "W31"));        
        
        Rule LAN3 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, mayor, "200"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "W31"));        
        
//NYX NOA: 300
         Rule NYX1 = new Rule(br, "NYX",
                        new Clause[]{new Clause(PrecioCel, menor, "400"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "W31"));
//lanix lx3
         
         Rule LAN4 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, mayor, "400"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "LX3"));   
         Rule LAN5 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, igual, "500"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "LX3"));          
         Rule LAN6 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, menor, "600"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "LX3"));      
//alcatel OT803 {$700}      
         Rule ALC1 = new Rule(br, "ALCATEL",
                        new Clause[]{new Clause(PrecioCel, mayor, "600"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "OT-803"));   
         Rule ALC2 = new Rule(br, "ALCATEL",
                        new Clause[]{new Clause(PrecioCel, igual, "700"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "OT-803"));          
         Rule ALC3 = new Rule(br, "ALCATEL",
                        new Clause[]{new Clause(PrecioCel, menor, "800"),
                        new Clause(Motivo, igual, "basico")}, 
                        new Clause(TipoCel, igual, "OT-803"));
         
         Rule ALC4 = new Rule(br, "ALCATEL",
                        new Clause[]{new Clause(PrecioCel, mayor, "600"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "OT-803"));   
         Rule ALC5 = new Rule(br, "ALCATEL",
                        new Clause[]{new Clause(PrecioCel, igual, "700"),
                        new Clause(Motivo, igual, "intemedio")}, 
                        new Clause(TipoCel, igual, "OT-803"));          
         Rule ALC6 = new Rule(br, "ALCATEL",
                        new Clause[]{new Clause(PrecioCel, menor, "800"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "OT-803"));         
         
//________________________        
         // MEDIO-ECONOMICO
         // HUAWEI: U8185  {}
        Rule Huawei1 = new Rule(br, "HUAWEI",
                        new Clause[]{new Clause(PrecioCel, igual, "900"), //p
                        new Clause(Motivo, igual, "intermedio")},     //p
                        new Clause(TipoCel, igual, "U8185")); //c
        
        Rule Huawei2 = new Rule(br, "HUAWEI",
                        new Clause[]{new Clause(PrecioCel, mayor, "700"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "U8185"));        
        
        Rule Huawei3 = new Rule(br, "HUAWEI",
                        new Clause[]{new Clause(PrecioCel, menor, "1100"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "U8185")); 
        
// S100,    LANIX: 1000
        Rule LAN7 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, igual, "1000"), //p
                        new Clause(Motivo, igual, "intermedio")},     //p
                        new Clause(TipoCel, igual, "HUAWEI U8185")); //c
        
        Rule LAN8 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, mayor, "850"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "HUAWEI U8185"));        
        
        Rule LAN9 = new Rule(br, "LANIX",
                        new Clause[]{new Clause(PrecioCel, menor, "1100"),
                        new Clause(Motivo, igual, "intermedio")}, 
                        new Clause(TipoCel, igual, "HUAWEI U8185"));         

/*Equipos mas caros de 2000
 */        
        //HTC PH06130: 2200
        Rule HTC01 = new Rule(br, "HTC",
                        new Clause[]{new Clause(PrecioCel, igual, "2200"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "PH06130"));                
        
        Rule HTC02 = new Rule(br, "HTC",
                        new Clause[]{new Clause(PrecioCel, mayor, "2000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "PH06130"));                        
        
        Rule HTC03 = new Rule(br, "HTC",
                        new Clause[]{new Clause(PrecioCel, menor, "2500"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "PH06130"));  
        
        Rule HTC04 = new Rule(br, "HTC",
                        new Clause[]{new Clause(PrecioCel, menor, "3000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "PH06130"));   
        
        //NOKIA 710 LUMIA: 3100
        Rule NOK05 = new Rule(br, "NOKIA",
                        new Clause[]{new Clause(PrecioCel, igual, "3100"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "710 LUMIA"));                
        
        Rule NOK06 = new Rule(br, "NOKIA",
                        new Clause[]{new Clause(PrecioCel, mayor, "2800"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "710 LUMIA"));                        
        
        Rule NOK07 = new Rule(br, "NOKIA",
                        new Clause[]{new Clause(PrecioCel, menor, "3200"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "710 LUMIA"));  
        
// XT1032 MOTO G: 3500   
        Rule MOTO01 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, igual, "3100"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "710 LUMIA"));                
        
        Rule MOTO02 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, mayor, "2800"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "710 LUMIA"));                        
        
        Rule MOTO03 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, menor, "3200"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "710 LUMIA"));
        
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
                        new Clause[]{new Clause(PrecioCel, menor, "7000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "ONE X Blanco"));                         
        
        // XT890 RAZRI: 5300  
        Rule MOTO7 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, mayor, "4800"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT890 RAZRI"));        
        
        Rule MOTO8 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, igual, "5300"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT890 RAZRI"));
        
        Rule MOTO9 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, menor, "5700"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT890 RAZRI"));      
        // MOTO X XT1058: 8999     
        Rule MOTO10 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, mayor, "7600"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "MOTO X XT1058"));        
        
        Rule MOTO11 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, igual, "8999"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));
        
        Rule MOTO12 = new Rule(br, "MOTOROLA",
                        new Clause[]{new Clause(PrecioCel, menor, "10000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));
        // IPHONE 4S 64GB: 15,000
        Rule APP1 = new Rule(br, "APPLE",
                        new Clause[]{new Clause(PrecioCel, mayor, "7600"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "MOTO X XT1058"));        
        
        Rule APP2 = new Rule(br, "APPLE",
                        new Clause[]{new Clause(PrecioCel, mayor, "10000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));
        
        Rule APP3 = new Rule(br, "APPLE",
                        new Clause[]{new Clause(PrecioCel, menor, "20000"),
                        new Clause(Motivo, igual, "superior")}, 
                        new Clause(TipoCel, igual, "XT1032 MOTO G NEGRO 16 GB"));        
    }
}
