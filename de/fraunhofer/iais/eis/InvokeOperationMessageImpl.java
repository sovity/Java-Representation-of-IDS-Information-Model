package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.InvokeOperationMessage
 * 
 * Message requesting the recipient to invoke a specific operation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:InvokeOperationMessage")
public class InvokeOperationMessageImpl implements InvokeOperationMessage {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Invoke Operation Message", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment =
        Arrays.asList(new TypedLiteral("Message requesting the recipient to invoke a specific operation.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:authorizationToken", "authorizationToken"})
    protected Token _authorizationToken;

    @JsonAlias({"ids:contentVersion", "contentVersion"})
    protected String _contentVersion;

    @JsonAlias({"ids:correlationMessage", "correlationMessage"})
    protected URI _correlationMessage;

    @JsonAlias({"ids:issued", "issued"})
    protected XMLGregorianCalendar _issued;

    @JsonAlias({"ids:issuerConnector", "issuerConnector"})
    protected URI _issuerConnector;

    @JsonAlias({"ids:modelVersion", "modelVersion"})
    protected String _modelVersion;

    @JsonAlias({"ids:operationReference", "operationReference"})
    protected URI _operationReference;

    @JsonAlias({"ids:recipientAgent", "recipientAgent"})
    protected List<URI> _recipientAgent = new ArrayList<>();

    @JsonAlias({"ids:recipientConnector", "recipientConnector"})
    protected List<URI> _recipientConnector = new ArrayList<>();

    @JsonAlias({"ids:securityToken", "securityToken"})
    protected DynamicAttributeToken _securityToken;

    @JsonAlias({"ids:senderAgent", "senderAgent"})
    protected URI _senderAgent;

    @JsonAlias({"ids:transferContract", "transferContract"})
    protected URI _transferContract;

    protected InvokeOperationMessageImpl() {
        id = VocabUtil.getInstance().createRandomUrl("invokeOperationMessage");
    }

    @JsonProperty("@id")
    final public URI getId() {
        return id;
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @Override
    public String toString() {
        return this.toRdf();
    }

    public List<TypedLiteral> getLabel() {
        return this.label;
    }

    public List<TypedLiteral> getComment() {
        return this.comment;
    }

    // getter and setter for generic property map
    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        if (this.properties == null)
            return null;
        Iterator<String> iter = this.properties.keySet().iterator();
        Map<String, Object> resultset = new HashMap<String, Object>();
        while (iter.hasNext()) {
            String key = iter.next();
            resultset.put(key, urifyObjects(this.properties.get(key)));
        }
        return resultset;
    }

    public Object urifyObjects(Object value) {
        if (value instanceof String && value.toString().startsWith("http")) {
            try {
                value = new URI(value.toString());
            } catch (Exception e) {
                /* do nothing */ }
        } else if (value instanceof ArrayList) {
            ArrayList<Object> result_array = new ArrayList<Object>();
            ((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
            return result_array;
        } else if (value instanceof Map) {
            Map<String, Object> result_map = new HashMap<String, Object>();
            ((Map) value).forEach((k, v) -> result_map.put(k.toString(), urifyObjects(v)));
            return result_map;
        }
        return value;
    }

    @JsonAnySetter
    public void setProperty(String property, Object value) {
        if (this.properties == null)
            this.properties = new HashMap<String, Object>();
        if (property.startsWith("@")) {
            return;
        } ;
        this.properties.put(property, value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._operationReference,
            this._modelVersion,
            this._issued,
            this._correlationMessage,
            this._issuerConnector,
            this._recipientConnector,
            this._senderAgent,
            this._recipientAgent,
            this._securityToken,
            this._authorizationToken,
            this._transferContract,
            this._contentVersion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            InvokeOperationMessageImpl other = (InvokeOperationMessageImpl) obj;
            return Objects.equals(this._operationReference, other._operationReference) &&
                Objects.equals(this._modelVersion, other._modelVersion) &&
                Objects.equals(this._issued, other._issued) &&
                Objects.equals(this._correlationMessage, other._correlationMessage) &&
                Objects.equals(this._issuerConnector, other._issuerConnector) &&
                Objects.equals(this._recipientConnector, other._recipientConnector) &&
                Objects.equals(this._senderAgent, other._senderAgent) &&
                Objects.equals(this._recipientAgent, other._recipientAgent) &&
                Objects.equals(this._securityToken, other._securityToken) &&
                Objects.equals(this._authorizationToken, other._authorizationToken) &&
                Objects.equals(this._transferContract, other._transferContract) &&
                Objects.equals(this._contentVersion, other._contentVersion);
        }
    }

    @Override
    public InvokeOperationMessage deepCopy() {
        InvokeOperationMessageBuilder builder = new InvokeOperationMessageBuilder();
        if (this._operationReference != null) {
            builder._operationReference_(URI.create(this._operationReference.toString()));
        }
        builder._modelVersion_(this._modelVersion);
        if (this._issued != null) {
            builder._issued_((XMLGregorianCalendar) this._issued.clone());
        }
        if (this._correlationMessage != null) {
            builder._correlationMessage_(URI.create(this._correlationMessage.toString()));
        }
        if (this._issuerConnector != null) {
            builder._issuerConnector_(URI.create(this._issuerConnector.toString()));
        }
        for (URI item : this._recipientConnector) {
            if (item != null) {
                builder._recipientConnector_(URI.create(item.toString()));
            }
        }
        if (this._senderAgent != null) {
            builder._senderAgent_(URI.create(this._senderAgent.toString()));
        }
        for (URI item : this._recipientAgent) {
            if (item != null) {
                builder._recipientAgent_(URI.create(item.toString()));
            }
        }
        if (this._securityToken != null) {
            builder._securityToken_(this._securityToken.deepCopy());
        }
        if (this._authorizationToken != null) {
            builder._authorizationToken_(this._authorizationToken.deepCopy());
        }
        if (this._transferContract != null) {
            builder._transferContract_(URI.create(this._transferContract.toString()));
        }
        builder._contentVersion_(this._contentVersion);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public URI getOperationReference() {
        return _operationReference;
    }

    @Override
    public void setOperationReference(URI _operationReference_) {
        this._operationReference = _operationReference_;
    }

    @Override
    public String getModelVersion() {
        return _modelVersion;
    }

    @Override
    public void setModelVersion(String _modelVersion_) {
        this._modelVersion = _modelVersion_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getIssued() {
        return _issued;
    }

    @Override
    public void setIssued(XMLGregorianCalendar _issued_) {
        this._issued = _issued_;
    }

    @Override
    public URI getCorrelationMessage() {
        return _correlationMessage;
    }

    @Override
    public void setCorrelationMessage(URI _correlationMessage_) {
        this._correlationMessage = _correlationMessage_;
    }

    @Override
    public URI getIssuerConnector() {
        return _issuerConnector;
    }

    @Override
    public void setIssuerConnector(URI _issuerConnector_) {
        this._issuerConnector = _issuerConnector_;
    }

    @Override
    public List<URI> getRecipientConnector() {
        return _recipientConnector;
    }

    @Override
    public void setRecipientConnector(List<URI> _recipientConnector_) {
        this._recipientConnector = _recipientConnector_;
    }

    @Override
    public URI getSenderAgent() {
        return _senderAgent;
    }

    @Override
    public void setSenderAgent(URI _senderAgent_) {
        this._senderAgent = _senderAgent_;
    }

    @Override
    public List<URI> getRecipientAgent() {
        return _recipientAgent;
    }

    @Override
    public void setRecipientAgent(List<URI> _recipientAgent_) {
        this._recipientAgent = _recipientAgent_;
    }

    @Override
    public DynamicAttributeToken getSecurityToken() {
        return _securityToken;
    }

    @Override
    public void setSecurityToken(DynamicAttributeToken _securityToken_) {
        this._securityToken = _securityToken_;
    }

    @Override
    public Token getAuthorizationToken() {
        return _authorizationToken;
    }

    @Override
    public void setAuthorizationToken(Token _authorizationToken_) {
        this._authorizationToken = _authorizationToken_;
    }

    @Override
    public URI getTransferContract() {
        return _transferContract;
    }

    @Override
    public void setTransferContract(URI _transferContract_) {
        this._transferContract = _transferContract_;
    }

    @Override
    public String getContentVersion() {
        return _contentVersion;
    }

    @Override
    public void setContentVersion(String _contentVersion_) {
        this._contentVersion = _contentVersion_;
    }
}
