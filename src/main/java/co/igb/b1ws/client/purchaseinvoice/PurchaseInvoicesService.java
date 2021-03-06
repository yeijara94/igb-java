
package co.igb.b1ws.client.purchaseinvoice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PurchaseInvoicesService", targetNamespace = "PurchaseInvoicesService", wsdlLocation = "http://192.168.10.102/B1WS/WebReferences/PurchaseInvoicesService.wsdl")
public class PurchaseInvoicesService
    extends Service
{

    private final static URL PURCHASEINVOICESSERVICE_WSDL_LOCATION;
    private final static WebServiceException PURCHASEINVOICESSERVICE_EXCEPTION;
    private final static QName PURCHASEINVOICESSERVICE_QNAME = new QName("PurchaseInvoicesService", "PurchaseInvoicesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.10.102/B1WS/WebReferences/PurchaseInvoicesService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PURCHASEINVOICESSERVICE_WSDL_LOCATION = url;
        PURCHASEINVOICESSERVICE_EXCEPTION = e;
    }

    public PurchaseInvoicesService() {
        super(__getWsdlLocation(), PURCHASEINVOICESSERVICE_QNAME);
    }

    public PurchaseInvoicesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PURCHASEINVOICESSERVICE_QNAME, features);
    }

    public PurchaseInvoicesService(URL wsdlLocation) {
        super(wsdlLocation, PURCHASEINVOICESSERVICE_QNAME);
    }

    public PurchaseInvoicesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PURCHASEINVOICESSERVICE_QNAME, features);
    }

    public PurchaseInvoicesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PurchaseInvoicesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PurchaseInvoicesServiceSoap
     */
    @WebEndpoint(name = "PurchaseInvoicesServiceSoap")
    public PurchaseInvoicesServiceSoap getPurchaseInvoicesServiceSoap() {
        return super.getPort(new QName("PurchaseInvoicesService", "PurchaseInvoicesServiceSoap"), PurchaseInvoicesServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PurchaseInvoicesServiceSoap
     */
    @WebEndpoint(name = "PurchaseInvoicesServiceSoap")
    public PurchaseInvoicesServiceSoap getPurchaseInvoicesServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("PurchaseInvoicesService", "PurchaseInvoicesServiceSoap"), PurchaseInvoicesServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns PurchaseInvoicesServiceSoap
     */
    @WebEndpoint(name = "PurchaseInvoicesServiceSoap12")
    public PurchaseInvoicesServiceSoap getPurchaseInvoicesServiceSoap12() {
        return super.getPort(new QName("PurchaseInvoicesService", "PurchaseInvoicesServiceSoap12"), PurchaseInvoicesServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PurchaseInvoicesServiceSoap
     */
    @WebEndpoint(name = "PurchaseInvoicesServiceSoap12")
    public PurchaseInvoicesServiceSoap getPurchaseInvoicesServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("PurchaseInvoicesService", "PurchaseInvoicesServiceSoap12"), PurchaseInvoicesServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PURCHASEINVOICESSERVICE_EXCEPTION!= null) {
            throw PURCHASEINVOICESSERVICE_EXCEPTION;
        }
        return PURCHASEINVOICESSERVICE_WSDL_LOCATION;
    }

}
