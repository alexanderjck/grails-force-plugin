
/**
 * InvalidNewPasswordFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package com.sforce.soap.partner;

public class InvalidNewPasswordFault extends java.lang.Exception{
    
    private com.sforce.soap.partner.fault.InvalidNewPasswordFaultE faultMessage;
    
    public InvalidNewPasswordFault() {
        super("InvalidNewPasswordFault");
    }
           
    public InvalidNewPasswordFault(java.lang.String s) {
       super(s);
    }
    
    public InvalidNewPasswordFault(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(com.sforce.soap.partner.fault.InvalidNewPasswordFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.partner.fault.InvalidNewPasswordFaultE getFaultMessage(){
       return faultMessage;
    }
}
    