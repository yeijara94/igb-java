
package co.igb.b1ws.client.invoice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InvoicesServiceSoap", targetNamespace = "InvoicesService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InvoicesServiceSoap {


    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.GetByParamsResponse
     */
    @WebMethod(operationName = "GetByParams", action = "InvoicesService/GetByParams")
    @WebResult(name = "GetByParamsResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetByParamsResponse getByParams(
        @WebParam(name = "GetByParams", targetNamespace = "InvoicesService", partName = "parameters")
        GetByParams parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.AddResponse
     */
    @WebMethod(operationName = "Add", action = "InvoicesService/Add")
    @WebResult(name = "AddResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public AddResponse add(
        @WebParam(name = "Add", targetNamespace = "InvoicesService", partName = "parameters")
        Add parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.UpdateResponse
     */
    @WebMethod(operationName = "Update", action = "InvoicesService/Update")
    @WebResult(name = "UpdateResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateResponse update(
        @WebParam(name = "Update", targetNamespace = "InvoicesService", partName = "parameters")
        Update parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.RemoveResponse
     */
    @WebMethod(operationName = "Remove", action = "InvoicesService/Remove")
    @WebResult(name = "RemoveResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public RemoveResponse remove(
        @WebParam(name = "Remove", targetNamespace = "InvoicesService", partName = "parameters")
        Remove parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.CloseResponse
     */
    @WebMethod(operationName = "Close", action = "InvoicesService/Close")
    @WebResult(name = "CloseResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CloseResponse close(
        @WebParam(name = "Close", targetNamespace = "InvoicesService", partName = "parameters")
        Close parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.CancelResponse
     */
    @WebMethod(operationName = "Cancel", action = "InvoicesService/Cancel")
    @WebResult(name = "CancelResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CancelResponse cancel(
        @WebParam(name = "Cancel", targetNamespace = "InvoicesService", partName = "parameters")
        Cancel parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.ReopenResponse
     */
    @WebMethod(operationName = "Reopen", action = "InvoicesService/Reopen")
    @WebResult(name = "ReopenResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public ReopenResponse reopen(
        @WebParam(name = "Reopen", targetNamespace = "InvoicesService", partName = "parameters")
        Reopen parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.SaveDraftToDocumentResponse
     */
    @WebMethod(operationName = "SaveDraftToDocument", action = "InvoicesService/SaveDraftToDocument")
    @WebResult(name = "SaveDraftToDocumentResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public SaveDraftToDocumentResponse saveDraftToDocument(
        @WebParam(name = "SaveDraftToDocument", targetNamespace = "InvoicesService", partName = "parameters")
        SaveDraftToDocument parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.GetApprovalTemplatesResponse
     */
    @WebMethod(operationName = "GetApprovalTemplates", action = "InvoicesService/GetApprovalTemplates")
    @WebResult(name = "GetApprovalTemplatesResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetApprovalTemplatesResponse getApprovalTemplates(
        @WebParam(name = "GetApprovalTemplates", targetNamespace = "InvoicesService", partName = "parameters")
        GetApprovalTemplates parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.UpdateFromXMLResponse
     */
    @WebMethod(operationName = "UpdateFromXML", action = "InvoicesService/UpdateFromXML")
    @WebResult(name = "UpdateFromXMLResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateFromXMLResponse updateFromXML(
        @WebParam(name = "UpdateFromXML", targetNamespace = "InvoicesService", partName = "parameters")
        UpdateFromXML parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.PreviewResponse
     */
    @WebMethod(operationName = "Preview", action = "InvoicesService/Preview")
    @WebResult(name = "PreviewResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public PreviewResponse preview(
        @WebParam(name = "Preview", targetNamespace = "InvoicesService", partName = "parameters")
        Preview parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.igb.b1ws.client.invoice.CreateCancellationDocumentResponse
     */
    @WebMethod(operationName = "CreateCancellationDocument", action = "InvoicesService/CreateCancellationDocument")
    @WebResult(name = "CreateCancellationDocumentResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CreateCancellationDocumentResponse createCancellationDocument(
        @WebParam(name = "CreateCancellationDocument", targetNamespace = "InvoicesService", partName = "parameters")
        CreateCancellationDocument parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

}
