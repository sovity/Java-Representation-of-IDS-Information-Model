package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "Person"@en
* "The class of persons (people)"@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = PersonImpl.class)
})
public interface Person {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	/**
	* This function returns a hash code value for the Person for the benefit of e.g. hash tables.
	* @return a hash code value for the Person
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Person is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "Family name of a Person."@en
	* @return Returns the String for the property _familyName.
	* More information under https://w3id.org/idsa/core/familyName
	*/
	@JsonProperty("ids:familyName")
	public String getFamilyName();

	/**
	* "Given name of a Person."@en
	* @return Returns the String for the property _givenName.
	* More information under https://w3id.org/idsa/core/givenName
	*/
	@JsonProperty("ids:givenName")
	public String getGivenName();

	/**
	* "Phone number of a person."@en
	* @return Returns the List of Strings for the property _phoneNumber.
	* More information under https://w3id.org/idsa/core/phoneNumber
	*/
	@JsonProperty("ids:phoneNumber")
	public List<String> getPhoneNumber();

	/**
	* "Email contact of a person."@en
	* @return Returns the List of Strings for the property _emailAddress.
	* More information under https://w3id.org/idsa/core/emailAddress
	*/
	@JsonProperty("ids:emailAddress")
	public List<String> getEmailAddress();

	/**
	* "Website providing additional information about a person."@en
	* @return Returns the String for the property _homepage.
	* More information under https://w3id.org/idsa/core/homepage
	*/
	@JsonProperty("ids:homepage")
	public String getHomepage();

}
