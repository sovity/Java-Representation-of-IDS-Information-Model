package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Defines an area of interest as a set of connected points.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BoundingPolygonImpl.class)
})
public interface BoundingPolygon extends ModelClass, Geometry {

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
     * Refers to a GeoPoint that is member of a BoundingPolygon.
     *
     * More information under https://w3id.org/idsa/core/geoPoint
     *
     * @return Returns the List of GeoPoints for the property _geoPoint.
     */
    @NotEmpty
    @JsonProperty("ids:geoPoint")
    List<GeoPoint> getGeoPoint();

    /**
     * Refers to a GeoPoint that is member of a BoundingPolygon.
     *
     * More information under https://w3id.org/idsa/core/geoPoint
     *
     * @param _geoPoint_ desired value for the property _geoPoint.
     */
    void setGeoPoint(List<GeoPoint> _geoPoint_);

}
