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

public class AgentBuilder {

	private AgentImpl agentImpl;

	public AgentBuilder() {
		agentImpl = new AgentImpl();
	}

	public AgentBuilder(URI id) {
		this();
		agentImpl.id = id;
	}


	/**
	* This function allows setting a value for title
	* @param _title_ desired value to be set
	* @return Builder object with new value for title
	*/
	final public AgentBuilder _title_(ArrayList<? extends TypedLiteral> _title_) {
		this.agentImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param _description_ desired value to be set
	* @return Builder object with new value for description
	*/
	final public AgentBuilder _description_(ArrayList<? extends TypedLiteral> _description_) {
		this.agentImpl._description = _description_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Agent build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(agentImpl);
		return agentImpl;
	}
}
