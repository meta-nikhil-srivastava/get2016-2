package web;

public class TemperatureConversionProxy implements web.TemperatureConversion {
  private String _endpoint = null;
  private web.TemperatureConversion temperatureConversion = null;
  
  public TemperatureConversionProxy() {
    _initTemperatureConversionProxy();
  }
  
  public TemperatureConversionProxy(String endpoint) {
    _endpoint = endpoint;
    _initTemperatureConversionProxy();
  }
  
  private void _initTemperatureConversionProxy() {
    try {
      temperatureConversion = (new web.TemperatureConversionServiceLocator()).getTemperatureConversion();
      if (temperatureConversion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)temperatureConversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)temperatureConversion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (temperatureConversion != null)
      ((javax.xml.rpc.Stub)temperatureConversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.TemperatureConversion getTemperatureConversion() {
    if (temperatureConversion == null)
      _initTemperatureConversionProxy();
    return temperatureConversion;
  }
  
  public double fahrenheitToCelsius(double fahrenheit) throws java.rmi.RemoteException{
    if (temperatureConversion == null)
      _initTemperatureConversionProxy();
    return temperatureConversion.fahrenheitToCelsius(fahrenheit);
  }
  
  
}