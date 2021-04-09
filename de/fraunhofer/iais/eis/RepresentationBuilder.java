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

public class RepresentationBuilder {

	private RepresentationImpl representationImpl;

	public RepresentationBuilder() {
		representationImpl = new RepresentationImpl();
	}

	public RepresentationBuilder(URI id) {
		this();
		representationImpl.id = id;
	}

	/**
	* This function allows setting a value for instance
	* @param _instance_ desired value to be set
	* @return Builder object with new value for instance
	*/
	final public RepresentationBuilder _instance_(ArrayList<? extends RepresentationInstance> _instance_) {
		this.representationImpl._instance = _instance_;
		return this;
	}


	/**
	* This function allows setting a value for mediaType
	* @param _mediaType_ desired value to be set
	* @return Builder object with new value for mediaType
	*/
	final public RepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.representationImpl._mediaType = _mediaType_;
		return this;
	}


	/**
	* This function allows setting a value for representationStandard
	* @param _representationStandard_ desired value to be set
	* @return Builder object with new value for representationStandard
	*/
	final public RepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.representationImpl._representationStandard = _representationStandard_;
		return this;
	}


	/**
	* This function allows setting a value for language
	* @param _language_ desired value to be set
	* @return Builder object with new value for language
	*/
	final public RepresentationBuilder _language_(Language _language_) {
		this.representationImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for created
	* @param _created_ desired value to be set
	* @return Builder object with new value for created
	*/
	final public RepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.representationImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for modified
	*/
	final public RepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.representationImpl._modified = _modified_;
		return this;
	}




	/**
	* This function allows setting a value for shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for shapesGraph
	*/
	final public RepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.representationImpl._shapesGraph = _shapesGraph_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Representation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(representationImpl);
		return representationImpl;
	}
}
