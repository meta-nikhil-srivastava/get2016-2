/**
 * TemperatureConversionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web;

public interface TemperatureConversionService extends javax.xml.rpc.Service {
    public java.lang.String getTemperatureConversionAddress();

    public web.TemperatureConversion getTemperatureConversion() throws javax.xml.rpc.ServiceException;

    public web.TemperatureConversion getTemperatureConversion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
