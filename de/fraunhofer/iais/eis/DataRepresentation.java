package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Physical representation of (structured) data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DataRepresentationImpl.class)
})
public interface DataRepresentation extends ModelClass, Representation {

    // standard methods

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Indicates the data type of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataType
     *
     * @return Returns the URI for the property _dataType.
     */
    @JsonProperty("ids:dataType")
    URI getDataType();

    /**
     * Indicates the data type of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataType
     *
     * @param _dataType_ desired value for the property _dataType.
     */
    void setDataType(URI _dataType_);

    /**
     * Indicates the data type schema of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataTypeSchema
     *
     * @return Returns the Resource for the property _dataTypeSchema.
     */
    @JsonProperty("ids:dataTypeSchema")
    Resource getDataTypeSchema();

    /**
     * Indicates the data type schema of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataTypeSchema
     *
     * @param _dataTypeSchema_ desired value for the property _dataTypeSchema.
     */
    void setDataTypeSchema(Resource _dataTypeSchema_);

}
