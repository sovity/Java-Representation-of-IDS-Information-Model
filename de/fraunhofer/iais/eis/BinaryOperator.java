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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* "BinaryOperator"@en
* "The class of binary operators."@en 
*/
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:BinaryOperator")
public enum BinaryOperator {

	/** 
	* "after"@en
	* "If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2 and the beginning of T1 is different to the ending of T2. Temporal entities can either be a xsd:dateTimeStamp or an ids:TemporalEntity."@en
	*/
	AFTER("https://w3id.org/idsa/code/AFTER", Arrays.asList(new TypedLiteral("after", "en")), Arrays.asList(new TypedLiteral("If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2 and the beginning of T1 is different to the ending of T2. Temporal entities can either be a xsd:dateTimeStamp or an ids:TemporalEntity.", "en"))),

	/** 
	* "before"@en
	* "If a temporal entity T1 is before another temporal entity T2, then the ending of T1 is before the end of T2 and the ending of T1 is different to the beginning of T2. Temporal entities can either be a xsd:dateTimeStamp or an ids:TemporalEntity."@en
	* "Compares an instance of ids:TemporalEntity or a Literal of xsd:dateTimeStamp to an instance of ids:TemporalEntity or a Literal of xsd:dateTimeStamp."@en
	*/
	BEFORE("https://w3id.org/idsa/code/BEFORE", Arrays.asList(new TypedLiteral("before", "en")), Arrays.asList(new TypedLiteral("If a temporal entity T1 is before another temporal entity T2, then the ending of T1 is before the end of T2 and the ending of T1 is different to the beginning of T2. Temporal entities can either be a xsd:dateTimeStamp or an ids:TemporalEntity.", "en"))),

	/** 
	* "contains"@en
	* "If a TemporalEntity (or xsd:dateTimeStamp) T1 contains another ids:TemporalEntity T2, then the beginning of T1 is idsc:AFTER the beginning of T2 and the ending of T1 is idsc:BEFORE the ending of T2. An Instant (or xsd:dateTimeStamp) cannot contain another Instant (or xsd:dateTimeStamp), neihter contains itself."@en
	* "Compares an instance of ids:Instant, ids:Interval or xsd:dateTimeStamp with an instance of ids:Interval. Evaluates to false if compared to a non ids:Interval."@en
	*/
	CONTAINS("https://w3id.org/idsa/code/CONTAINS", Arrays.asList(new TypedLiteral("contains", "en")), Arrays.asList(new TypedLiteral("If a TemporalEntity (or xsd:dateTimeStamp) T1 contains another ids:TemporalEntity T2, then the beginning of T1 is idsc:AFTER the beginning of T2 and the ending of T1 is idsc:BEFORE the ending of T2. An Instant (or xsd:dateTimeStamp) cannot contain another Instant (or xsd:dateTimeStamp), neihter contains itself.", "en"))),

	/** 
	* "covered by"@en
	* "Spatial operator \'covered by\' as defined by the Egenhofer Topological Relations family: An object A is covered_by another object B if both objects share common bounding and interior faces; if A has interior faces which are bounding faces of B; and if none of B\'s interior faces are part of A\'s boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 7)"@en
	*/
	COVERED_BY("https://w3id.org/idsa/code/COVERED_BY", Arrays.asList(new TypedLiteral("covered by", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'covered by' as defined by the Egenhofer Topological Relations family: An object A is covered_by another object B if both objects share common bounding and interior faces; if A has interior faces which are bounding faces of B; and if none of B's interior faces are part of A's boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 7)", "en"))),

	/** 
	* "covers"@en
	* "Spatial operator \'covers\' as defined by the Egenhofer Topological Relations family: An object A covers another object B if both objects share common bounding and interior faces; if B has interior faces which are bounding faces of A; and if none of A\'s interior faces are part of B\'s boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 6)"@en
	*/
	COVERS("https://w3id.org/idsa/code/COVERS", Arrays.asList(new TypedLiteral("covers", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'covers' as defined by the Egenhofer Topological Relations family: An object A covers another object B if both objects share common bounding and interior faces; if B has interior faces which are bounding faces of A; and if none of A's interior faces are part of B's boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 6)", "en"))),

	/** 
	* "defines as"@en
	* "Allows assignments similar to \'var x := {RightOperand}\'."@en
	* "Different to the other ids:BinaryOperator, idsc:DEFINES_AS does *not* compare a feature but tells the interpreter where to *find* one. Therefore, the constraint is not evaluated in the same way as with other operators."@en
	*/
	DEFINES_AS("https://w3id.org/idsa/code/DEFINES_AS", Arrays.asList(new TypedLiteral("defines as", "en")), Arrays.asList(new TypedLiteral("Allows assignments similar to 'var x := {RightOperand}'.", "en"))),

	/** 
	* "disjoint"@en
	* "Spatial operator \'disjoint\' as defined by the Egenhofer Topological Relations family: If all four intersections among all object parts are empty, then the two objects are disjoint. (https://doi.org/10.1007/3-540-51295-0_148 Definition 1)"@en
	*/
	DISJOINT("https://w3id.org/idsa/code/DISJOINT", Arrays.asList(new TypedLiteral("disjoint", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'disjoint' as defined by the Egenhofer Topological Relations family: If all four intersections among all object parts are empty, then the two objects are disjoint. (https://doi.org/10.1007/3-540-51295-0_148 Definition 1)", "en"))),

	/** 
	* "has same duration"@en
	* "If a temporal entity T1 has the same duration as another temporal entity T2, then their length or their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration \'P0Y0M0DT0H0M0S\'^^xsd:duration and therefore have always the same duration."@en
	* "Compares an instance of ids:TemporalEntity with an instance of ids:TemporalEntity."@en
	*/
	DURATION_EQ("https://w3id.org/idsa/code/DURATION_EQ", Arrays.asList(new TypedLiteral("has same duration", "en")), Arrays.asList(new TypedLiteral("If a temporal entity T1 has the same duration as another temporal entity T2, then their length or their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration.", "en"))),

	/** 
	* "during"@en
	* "If a TemporalEntity T1 is during another TemporalEntity T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."@en
	* "Compares an instance of ids:Instant, ids:Interval or xsd:dateTimeStamp with an instance of ids:Interval. Evaluates to false if compared to a non ids:Interval."@en
	*/
	DURING("https://w3id.org/idsa/code/DURING", Arrays.asList(new TypedLiteral("during", "en")), Arrays.asList(new TypedLiteral("If a TemporalEntity T1 is during another TemporalEntity T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2.", "en"))),

	/** 
	* "equals"@en
	* "Arithmetic equals operator (5 = 5)."@en
	*/
	EQ("https://w3id.org/idsa/code/EQ", Arrays.asList(new TypedLiteral("equals", "en")), Arrays.asList(new TypedLiteral("Arithmetic equals operator (5 = 5).", "en"))),

	/** 
	* "equals"@en
	* "Logical equals operator (true = true)."@en
	*/
	EQUALS("https://w3id.org/idsa/code/EQUALS", Arrays.asList(new TypedLiteral("equals", "en")), Arrays.asList(new TypedLiteral("Logical equals operator (true = true).", "en"))),

	/** 
	* "finished by"@en
	* "If an interval T1 is finished by another interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."@en
	* "Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to false if compared to a non ids:Interval or one interval is empty."@en
	*/
	FINISHED_BY("https://w3id.org/idsa/code/FINISHED_BY", Arrays.asList(new TypedLiteral("finished by", "en")), Arrays.asList(new TypedLiteral("If an interval T1 is finished by another interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2.", "en"))),

	/** 
	* "finishes"@en
	* "If an Interval T1 finishes another interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2."@en
	* "Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to false if compared to a non ids:Interval or one interval is empty."@en
	*/
	FINISHES("https://w3id.org/idsa/code/FINISHES", Arrays.asList(new TypedLiteral("finishes", "en")), Arrays.asList(new TypedLiteral("If an Interval T1 finishes another interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2.", "en"))),

	/** 
	* "greater than"@en
	* "Greater-than operator. Can be used for numeric (5 idsc:GT 2) comparisons."@en
	*/
	GT("https://w3id.org/idsa/code/GT", Arrays.asList(new TypedLiteral("greater than", "en")), Arrays.asList(new TypedLiteral("Greater-than operator. Can be used for numeric (5 idsc:GT 2) comparisons.", "en"))),

	/** 
	* "greater than or equals"@en
	* "Greater-than-or-equals operator. Can be used for numeric (5 idsc:GTEQ 2) comparisons."@en
	*/
	GTEQ("https://w3id.org/idsa/code/GTEQ", Arrays.asList(new TypedLiteral("greater than or equals", "en")), Arrays.asList(new TypedLiteral("Greater-than-or-equals operator. Can be used for numeric (5 idsc:GTEQ 2) comparisons.", "en"))),

	/** 
	* "has Member"@en
	* "If a user has a specific membership required for accessing a resource. A membership includes always a role and a related organisation (see also org:). Should be used together with a RightOperand pointing to an accessible endpoint providing this information."@en
	*/
	HAS_MEMBERSHIP("https://w3id.org/idsa/code/HAS_MEMBERSHIP", Arrays.asList(new TypedLiteral("has Member", "en")), Arrays.asList(new TypedLiteral("If a user has a specific membership required for accessing a resource. A membership includes always a role and a related organisation (see also org:). Should be used together with a RightOperand pointing to an accessible endpoint providing this information.", "en"))),

	/** 
	* "has site"@en
	* "If a user needs to be located at a certain site required for accessing a resource. A \'HAS_SITE\' relation includes always a membership (role and related organisation) corresponding to the site. Should be used together with a RightOperand pointing to an accessible endpoint providing this information."@en
	*/
	HAS_SITE("https://w3id.org/idsa/code/HAS_SITE", Arrays.asList(new TypedLiteral("has site", "en")), Arrays.asList(new TypedLiteral("If a user needs to be located at a certain site required for accessing a resource. A 'HAS_SITE' relation includes always a membership (role and related organisation) corresponding to the site. Should be used together with a RightOperand pointing to an accessible endpoint providing this information.", "en"))),

	/** 
	* "has state"@en
	* "Operator examining if the target resource has a certain state at the moment, for instance is anonymized (idsc:ANONYMIZED)."@en
	*/
	HAS_STATE("https://w3id.org/idsa/code/HAS_STATE", Arrays.asList(new TypedLiteral("has state", "en")), Arrays.asList(new TypedLiteral("Operator examining if the target resource has a certain state at the moment, for instance is anonymized (idsc:ANONYMIZED).", "en"))),

	/** 
	* "in"@en
	* "Element-of operator. Allowed RightOperands are RDF collections(\'(A B C)\')."@en
	*/
	IN("https://w3id.org/idsa/code/IN", Arrays.asList(new TypedLiteral("in", "en")), Arrays.asList(new TypedLiteral("Element-of operator. Allowed RightOperands are RDF collections('(A B C)').", "en"))),

	/** 
	* "inside"@en
	* "Spatial operator \'inside\' as defined by the Egenhofer Topological Relations family: An object A is inside of another object B if (1) A and B share interior, but not bounding faces, (2) if A has bounding faces which are interior faces of B, and (3) none of B\'s bounding faces coincides with any of A\'s interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 4)"@en
	* "In addition, a point is inside a polygom iff the point is in the polygom\'s interior (the point itself has no interior)."@en
	*/
	INSIDE("https://w3id.org/idsa/code/INSIDE", Arrays.asList(new TypedLiteral("inside", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'inside' as defined by the Egenhofer Topological Relations family: An object A is inside of another object B if (1) A and B share interior, but not bounding faces, (2) if A has bounding faces which are interior faces of B, and (3) none of B's bounding faces coincides with any of A's interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 4)", "en"))),

	/** 
	* "inside network"@en
	* "Is satisfied if a system is inside a specified target network or network range."@en
	*/
	INSIDE_NETWORK("https://w3id.org/idsa/code/INSIDE_NETWORK", Arrays.asList(new TypedLiteral("inside network", "en")), Arrays.asList(new TypedLiteral("Is satisfied if a system is inside a specified target network or network range.", "en"))),

	/** 
	* "longer"@en
	* "If a temporal entity T1 is longer than another temporal entity T2, then the length or duration of T1 is bigger. Instants and xsd:dateTimeStamp Literals have always the duration \'P0Y0M0DT0H0M0S\'^^xsd:duration and therefore have always the same duration."@en
	* "Compares an instance of ids:TemporalEntity with an instance of xsd:duration."@en
	*/
	LONGER("https://w3id.org/idsa/code/LONGER", Arrays.asList(new TypedLiteral("longer", "en")), Arrays.asList(new TypedLiteral("If a temporal entity T1 is longer than another temporal entity T2, then the length or duration of T1 is bigger. Instants and xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration.", "en"))),

	/** 
	* "longer or equals"@en
	* "If temporal entity T1 is longer or equals than another temporal entity T2, then the length or duration of T1 is bigger or their length or their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration \'P0Y0M0DT0H0M0S\'^^xsd:duration and therefore have always the same duration."@en
	* "Compares an instance of ids:TemporalEntity with an instance of xsd:duration."@en
	*/
	LONGER_EQ("https://w3id.org/idsa/code/LONGER_EQ", Arrays.asList(new TypedLiteral("longer or equals", "en")), Arrays.asList(new TypedLiteral("If temporal entity T1 is longer or equals than another temporal entity T2, then the length or duration of T1 is bigger or their length or their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration.", "en"))),

	/** 
	* "Lithuanian"@en
	* "less than"@en
	* "Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons."@en
	* "Do not confuse with idsc:LT (which is a language)."@en
	*/
	LT("https://w3id.org/idsa/code/LT", Arrays.asList(new TypedLiteral("Lithuanian", "en"), new TypedLiteral("less than", "en")), Arrays.asList(new TypedLiteral("Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons.", "en"))),

	/** 
	* "less than or equals"@en
	* "Less-than-or-equals operator. Can be used for numeric (2 idsc:LTEQ 5) comparisons."@en
	*/
	LTEQ("https://w3id.org/idsa/code/LTEQ", Arrays.asList(new TypedLiteral("less than or equals", "en")), Arrays.asList(new TypedLiteral("Less-than-or-equals operator. Can be used for numeric (2 idsc:LTEQ 5) comparisons.", "en"))),

	/** 
	* "matches"@en
	* "Regex operator for strings. Evaluates to true iff the regex pattern of the RightOperand matches the LeftOperand."@en
	*/
	MATCHES("https://w3id.org/idsa/code/MATCHES", Arrays.asList(new TypedLiteral("matches", "en")), Arrays.asList(new TypedLiteral("Regex operator for strings. Evaluates to true iff the regex pattern of the RightOperand matches the LeftOperand.", "en"))),

	/** 
	* "meets"@en
	* "If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 meets another TemporalEntity (or xsd:dateTimeStamp Literal) T2, then the end of T1 is coincident with the beginning of T2."@en
	* "Compares an instance of TemporalEntity or xsd:dateTimeStamp Literal to another instance of TemporalEntity or xsd:dateTimeStamp Literal. Evaluates to true if T1 or T2 are Instants (or xsd:dateTimeStamp Literal) and the condition in the comment holds."@en
	*/
	MEETS("https://w3id.org/idsa/code/MEETS", Arrays.asList(new TypedLiteral("meets", "en")), Arrays.asList(new TypedLiteral("If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 meets another TemporalEntity (or xsd:dateTimeStamp Literal) T2, then the end of T1 is coincident with the beginning of T2.", "en"))),

	/** 
	* "memberOf"@en
	* "If a user is part of a certain organisation required for accessing a resource. Should be used together with a RightOperand pointing to an accessible endpoint providing this information."@en
	*/
	MEMBER_OF("https://w3id.org/idsa/code/MEMBER_OF", Arrays.asList(new TypedLiteral("memberOf", "en")), Arrays.asList(new TypedLiteral("If a user is part of a certain organisation required for accessing a resource. Should be used together with a RightOperand pointing to an accessible endpoint providing this information.", "en"))),

	/** 
	* "met by"@en
	* "If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 is met by another TemporalEntity or (xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the end of T2."@en
	* "Compares an instance of TemporalEntity (or xsd:dateTimeStamp Literal) to another instance of TemporalEntity (or xsd:dateTimeStamp Literal). Evaluates to true if T1 or T2 are Instants (or xsd:dateTimeStamp Literal) and the condition in the comment holds."@en
	*/
	MET_BY("https://w3id.org/idsa/code/MET_BY", Arrays.asList(new TypedLiteral("met by", "en")), Arrays.asList(new TypedLiteral("If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 is met by another TemporalEntity or (xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the end of T2.", "en"))),

	/** 
	* "not equals"@en
	* "Logical difference operator (false != true)."@en
	*/
	NOT("https://w3id.org/idsa/code/NOT", Arrays.asList(new TypedLiteral("not equals", "en")), Arrays.asList(new TypedLiteral("Logical difference operator (false != true).", "en"))),

	/** 
	* "overlapped by"@en
	* "If a interval T1 is overlapped another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2."@en
	* "Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to false if compared to a non ids:Interval or one interval is empty."@en
	*/
	OVERLAPPED_BY("https://w3id.org/idsa/code/OVERLAPPED_BY", Arrays.asList(new TypedLiteral("overlapped by", "en")), Arrays.asList(new TypedLiteral("If a interval T1 is overlapped another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2.", "en"))),

	/** 
	* "overlaps"@en
	* "If an ids:Interval T1 overlapps another ids:Interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2."@en
	* "Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to false if compared to a non ids:Interval or one interval is empty."@en
	*/
	OVERLAPS("https://w3id.org/idsa/code/OVERLAPS", Arrays.asList(new TypedLiteral("overlaps", "en")), Arrays.asList(new TypedLiteral("If an ids:Interval T1 overlapps another ids:Interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2.", "en"))),

	/** 
	* "is same as"@en
	* "Logical equals operator comparing two RDF URIs. Is true if at least one owl:sameAs relation exists."@en
	* "A owl:sameAs A is always true."@en
	*/
	SAME_AS("https://w3id.org/idsa/code/SAME_AS", Arrays.asList(new TypedLiteral("is same as", "en")), Arrays.asList(new TypedLiteral("Logical equals operator comparing two RDF URIs. Is true if at least one owl:sameAs relation exists.", "en"))),

	/** 
	* "shorter"@en
	* "If a temporal entity T1 is shorter than another temporal entity T2, then the length or duration of T1 is shorter. Instants and xsd:dateTimeStamp Literals have always the duration \'P0Y0M0DT0H0M0S\'^^xsd:duration and therefore have always the same duration."@en
	* "Compares an instance of ids:TemporalEntity with an instance of xsd:duration."@en
	*/
	SHORTER("https://w3id.org/idsa/code/SHORTER", Arrays.asList(new TypedLiteral("shorter", "en")), Arrays.asList(new TypedLiteral("If a temporal entity T1 is shorter than another temporal entity T2, then the length or duration of T1 is shorter. Instants and xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration.", "en"))),

	/** 
	* "shorter or equals"@en
	* "If a temporal entity T1 is shorter or equals than another temporal entity T2, then the length or duration of T1 is shorter or their length or their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration \'P0Y0M0DT0H0M0S\'^^xsd:duration and therefore have always the same duration."@en
	* "Compares an instance of ids:TemporalEntity with an instance of xsd:duration."@en
	*/
	SHORTER_EQ("https://w3id.org/idsa/code/SHORTER_EQ", Arrays.asList(new TypedLiteral("shorter or equals", "en")), Arrays.asList(new TypedLiteral("If a temporal entity T1 is shorter or equals than another temporal entity T2, then the length or duration of T1 is shorter or their length or their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration.", "en"))),

	/** 
	* "contains"@en
	* "Spatial operator \'contains\' as defined by the Egenhofer Topological Relations family: An object A contains another object B if A and B share interior but no bounding faces; if B has bounding faces which are interior faces of , and none of A\'s bounding faces coincides with any of B\'s interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 5)"@en
	* "In addition, a polygom contains a point iff the point is in the polygom\'s interior (the point itself has no interior)."@en
	*/
	SPATIAL_CONTAINS("https://w3id.org/idsa/code/SPATIAL_CONTAINS", Arrays.asList(new TypedLiteral("contains", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'contains' as defined by the Egenhofer Topological Relations family: An object A contains another object B if A and B share interior but no bounding faces; if B has bounding faces which are interior faces of , and none of A's bounding faces coincides with any of B's interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 5)", "en"))),

	/** 
	* "equals"@en
	* "Spatial operator \'equals\' as defined by the Egenhofer Topological Relations family: Two objects are equal if both intersections of bounding and interior faces are not empty while the two boundary-interior intersections are empty. (https://doi.org/10.1007/3-540-51295-0_148 Definition 3)"@en
	* "In addition, two spatial points are equal iff both coordinates are equal (points have no interior)."@en
	*/
	SPATIAL_EQUALS("https://w3id.org/idsa/code/SPATIAL_EQUALS", Arrays.asList(new TypedLiteral("equals", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'equals' as defined by the Egenhofer Topological Relations family: Two objects are equal if both intersections of bounding and interior faces are not empty while the two boundary-interior intersections are empty. (https://doi.org/10.1007/3-540-51295-0_148 Definition 3)", "en"))),

	/** 
	* "meet"@en
	* "Spatial operator \'meet\' as defined by the Egenhofer Topological Relations family: If the intersection among the bounding faces is not empty, whereas all other 3 intersections are empty, then the two objects meet. (https://doi.org/10.1007/3-540-51295-0_148 Definition 2)"@en
	*/
	SPATIAL_MEET("https://w3id.org/idsa/code/SPATIAL_MEET", Arrays.asList(new TypedLiteral("meet", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'meet' as defined by the Egenhofer Topological Relations family: If the intersection among the bounding faces is not empty, whereas all other 3 intersections are empty, then the two objects meet. (https://doi.org/10.1007/3-540-51295-0_148 Definition 2)", "en"))),

	/** 
	* "overlap"@en
	* "Spatial operator \'overlap\' as defined by the Egenhofer Topological Relations family: Two objects overlap if they have common interior faces and the bounding faces have common parts with the opposite interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 8)"@en
	*/
	SPATIAL_OVERLAP("https://w3id.org/idsa/code/SPATIAL_OVERLAP", Arrays.asList(new TypedLiteral("overlap", "en")), Arrays.asList(new TypedLiteral("Spatial operator 'overlap' as defined by the Egenhofer Topological Relations family: Two objects overlap if they have common interior faces and the bounding faces have common parts with the opposite interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 8)", "en"))),

	/** 
	* "started by"@en
	* "If a TemporalEntity T1 is started by another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."@en
	* "Compares an instance of TemporalEntity (or xsd:dateTimeStamp Literal) to instance of ids:Interval. Evaluates to false if T1 is an Instant (or xsd:dateTimeStamp Literal) as the end of T1 can then not be idsc:AFTER the end of T2."@en
	*/
	STARTED_BY("https://w3id.org/idsa/code/STARTED_BY", Arrays.asList(new TypedLiteral("started by", "en")), Arrays.asList(new TypedLiteral("If a TemporalEntity T1 is started by another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2.", "en"))),

	/** 
	* "starts"@en
	* "If an interval T1 starts with a TemporalEntity T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2."@en
	* "Compares an instance of ids:Interval to another instance of TemporalEntity (or xsd:dateTimeStamp Literal). Evaluates to false if T2 is not an ids:Interval as then the end of T1 can never be idsc:BEFORE the end of T2"@en
	*/
	STARTS("https://w3id.org/idsa/code/STARTS", Arrays.asList(new TypedLiteral("starts", "en")), Arrays.asList(new TypedLiteral("If an interval T1 starts with a TemporalEntity T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2.", "en"))),

	/** 
	* "string contains"@en
	* "Contains operator for strings. Evaluates to true iff the LeftOperand contains the complete RightOperand."@en
	*/
	STRING_CONTAINS("https://w3id.org/idsa/code/STRING_CONTAINS", Arrays.asList(new TypedLiteral("string contains", "en")), Arrays.asList(new TypedLiteral("Contains operator for strings. Evaluates to true iff the LeftOperand contains the complete RightOperand.", "en"))),

	/** 
	* "string equals"@en
	* "Equals operator for strings. Evaluates to true iff all characters and their sequence is the same."@en
	*/
	STRING_EQ("https://w3id.org/idsa/code/STRING_EQ", Arrays.asList(new TypedLiteral("string equals", "en")), Arrays.asList(new TypedLiteral("Equals operator for strings. Evaluates to true iff all characters and their sequence is the same.", "en"))),

	/** 
	* "string is contained in"@en
	* "Contained in operator for strings. Evaluates to true iff the LeftOperand is contained completely by the RightOperand."@en
	*/
	STRING_IS_CONTAINED("https://w3id.org/idsa/code/STRING_IS_CONTAINED", Arrays.asList(new TypedLiteral("string is contained in", "en")), Arrays.asList(new TypedLiteral("Contained in operator for strings. Evaluates to true iff the LeftOperand is contained completely by the RightOperand.", "en"))),

	/** 
	* "disjoint"@en
	* "If a TemporalEntity (or xsd:dateTimeStamp) T1 is disjoint with another ids:TemporalEntity (or xsd:dateTimeStamp) T2, then T1 is idsc:BEFORE or idsc:AFTER to T2."@en
	* "Compares an instance of ids:TemporalEntity or xsd:dateTimeStamp Literal to an instance of ids:TemporalEntity or xsd:dateTimeStamp Literal."@en
	*/
	TEMPORAL_DISJOINT("https://w3id.org/idsa/code/TEMPORAL_DISJOINT", Arrays.asList(new TypedLiteral("disjoint", "en")), Arrays.asList(new TypedLiteral("If a TemporalEntity (or xsd:dateTimeStamp) T1 is disjoint with another ids:TemporalEntity (or xsd:dateTimeStamp) T2, then T1 is idsc:BEFORE or idsc:AFTER to T2.", "en"))),

	/** 
	* "interval equals"@en
	* "If a TemporalEntity (or xsd:dateTimeStamp Literal) T1 is equals another TemporalEntity (or xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2. The beginning and ending is the same for instances of ids:Instant (or xsd:dateTimeStamp Literal)."@en
	* "Compares an instance of TemporalEntity or xsd:dateTimeStamp Literal to another TemporalEntity or xsd:dateTimeStamp. Evaluates to false if a DurationEntity is involved."@en
	*/
	TEMPORAL_EQUALS("https://w3id.org/idsa/code/TEMPORAL_EQUALS", Arrays.asList(new TypedLiteral("interval equals", "en")), Arrays.asList(new TypedLiteral("If a TemporalEntity (or xsd:dateTimeStamp Literal) T1 is equals another TemporalEntity (or xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2. The beginning and ending is the same for instances of ids:Instant (or xsd:dateTimeStamp Literal).", "en")));

	private static final Map<String,BinaryOperator> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private List<TypedLiteral> label;
	private List<TypedLiteral> comment;


	BinaryOperator(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}
	//TODO dummy method for generic properties, should be deleted in future versions
	public Map<String,Object> getProperties() {
		return null ;
	}
	public void setProperty(String property, Object value) {
		//do nothing
	}
	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	@JsonIgnore
	final public List<TypedLiteral> getLabel() {
		return label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	@JsonIgnore
	final public List<TypedLiteral> getComment() {
		return comment;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	@JsonProperty("@id")
	final public URI getSerializedId() {
		return id;
	}
	

	@JsonCreator
	public static BinaryOperator deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}


}
