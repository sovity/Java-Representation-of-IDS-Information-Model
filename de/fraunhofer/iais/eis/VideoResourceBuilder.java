package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class VideoResourceBuilder implements Builder<VideoResource> {

    private VideoResourceImpl videoResourceImpl;

    public VideoResourceBuilder() {
        videoResourceImpl = new VideoResourceImpl();
    }

    public VideoResourceBuilder(URI id) {
        this();
        videoResourceImpl.id = id;
    }

    /**
     * This function allows setting a value for _standardLicense
     * 
     * @param _standardLicense_ desired value to be set
     * @return Builder object with new value for _standardLicense
     */
    public VideoResourceBuilder _standardLicense_(URI _standardLicense_) {
        this.videoResourceImpl.setStandardLicense(_standardLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _customLicense
     * 
     * @param _customLicense_ desired value to be set
     * @return Builder object with new value for _customLicense
     */
    public VideoResourceBuilder _customLicense_(URI _customLicense_) {
        this.videoResourceImpl.setCustomLicense(_customLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _resourcePart
     * 
     * @param _resourcePart_ desired value to be set
     * @return Builder object with new value for _resourcePart
     */
    public VideoResourceBuilder _resourcePart_(List<Resource> _resourcePart_) {
        this.videoResourceImpl.setResourcePart(_resourcePart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourcePart
     * 
     * @param _resourcePart_ desired value to be added
     * @return Builder object with new value for _resourcePart
     */
    public VideoResourceBuilder _resourcePart_(Resource _resourcePart_) {
        this.videoResourceImpl.getResourcePart().add(_resourcePart_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be set
     * @return Builder object with new value for _resourceEndpoint
     */
    public VideoResourceBuilder _resourceEndpoint_(List<ConnectorEndpoint> _resourceEndpoint_) {
        this.videoResourceImpl.setResourceEndpoint(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be added
     * @return Builder object with new value for _resourceEndpoint
     */
    public VideoResourceBuilder _resourceEndpoint_(ConnectorEndpoint _resourceEndpoint_) {
        this.videoResourceImpl.getResourceEndpoint().add(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _contractOffer
     * 
     * @param _contractOffer_ desired value to be set
     * @return Builder object with new value for _contractOffer
     */
    public VideoResourceBuilder _contractOffer_(List<ContractOffer> _contractOffer_) {
        this.videoResourceImpl.setContractOffer(_contractOffer_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contractOffer
     * 
     * @param _contractOffer_ desired value to be added
     * @return Builder object with new value for _contractOffer
     */
    public VideoResourceBuilder _contractOffer_(ContractOffer _contractOffer_) {
        this.videoResourceImpl.getContractOffer().add(_contractOffer_);
        return this;
    }

    /**
     * This function allows setting a value for _paymentModality
     * 
     * @param _paymentModality_ desired value to be set
     * @return Builder object with new value for _paymentModality
     */
    public VideoResourceBuilder _paymentModality_(PaymentModality _paymentModality_) {
        this.videoResourceImpl.setPaymentModality(_paymentModality_);
        return this;
    }

    /**
     * This function allows setting a value for _publisher
     * 
     * @param _publisher_ desired value to be set
     * @return Builder object with new value for _publisher
     */
    public VideoResourceBuilder _publisher_(URI _publisher_) {
        this.videoResourceImpl.setPublisher(_publisher_);
        return this;
    }

    /**
     * This function allows setting a value for _sovereign
     * 
     * @param _sovereign_ desired value to be set
     * @return Builder object with new value for _sovereign
     */
    public VideoResourceBuilder _sovereign_(URI _sovereign_) {
        this.videoResourceImpl.setSovereign(_sovereign_);
        return this;
    }

    /**
     * This function allows setting a value for _sample
     * 
     * @param _sample_ desired value to be set
     * @return Builder object with new value for _sample
     */
    public VideoResourceBuilder _sample_(List<Resource> _sample_) {
        this.videoResourceImpl.setSample(_sample_);
        return this;
    }

    /**
     * This function allows adding a value to the List _sample
     * 
     * @param _sample_ desired value to be added
     * @return Builder object with new value for _sample
     */
    public VideoResourceBuilder _sample_(Resource _sample_) {
        this.videoResourceImpl.getSample().add(_sample_);
        return this;
    }

    /**
     * This function allows setting a value for _variant
     * 
     * @param _variant_ desired value to be set
     * @return Builder object with new value for _variant
     */
    public VideoResourceBuilder _variant_(Resource _variant_) {
        this.videoResourceImpl.setVariant(_variant_);
        return this;
    }

    /**
     * This function allows setting a value for _contentType
     * 
     * @param _contentType_ desired value to be set
     * @return Builder object with new value for _contentType
     */
    public VideoResourceBuilder _contentType_(ContentType _contentType_) {
        this.videoResourceImpl.setContentType(_contentType_);
        return this;
    }

    /**
     * This function allows setting a value for _contentPart
     * 
     * @param _contentPart_ desired value to be set
     * @return Builder object with new value for _contentPart
     */
    public VideoResourceBuilder _contentPart_(List<DigitalContent> _contentPart_) {
        this.videoResourceImpl.setContentPart(_contentPart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contentPart
     * 
     * @param _contentPart_ desired value to be added
     * @return Builder object with new value for _contentPart
     */
    public VideoResourceBuilder _contentPart_(DigitalContent _contentPart_) {
        this.videoResourceImpl.getContentPart().add(_contentPart_);
        return this;
    }

    /**
     * This function allows setting a value for _representation
     * 
     * @param _representation_ desired value to be set
     * @return Builder object with new value for _representation
     */
    public VideoResourceBuilder _representation_(List<Representation> _representation_) {
        this.videoResourceImpl.setRepresentation(_representation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _representation
     * 
     * @param _representation_ desired value to be added
     * @return Builder object with new value for _representation
     */
    public VideoResourceBuilder _representation_(Representation _representation_) {
        this.videoResourceImpl.getRepresentation().add(_representation_);
        return this;
    }

    /**
     * This function allows setting a value for _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be set
     * @return Builder object with new value for _defaultRepresentation
     */
    public VideoResourceBuilder _defaultRepresentation_(List<Representation> _defaultRepresentation_) {
        this.videoResourceImpl.setDefaultRepresentation(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be added
     * @return Builder object with new value for _defaultRepresentation
     */
    public VideoResourceBuilder _defaultRepresentation_(Representation _defaultRepresentation_) {
        this.videoResourceImpl.getDefaultRepresentation().add(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows setting a value for _theme
     * 
     * @param _theme_ desired value to be set
     * @return Builder object with new value for _theme
     */
    public VideoResourceBuilder _theme_(List<URI> _theme_) {
        this.videoResourceImpl.setTheme(_theme_);
        return this;
    }

    /**
     * This function allows adding a value to the List _theme
     * 
     * @param _theme_ desired value to be added
     * @return Builder object with new value for _theme
     */
    public VideoResourceBuilder _theme_(URI _theme_) {
        this.videoResourceImpl.getTheme().add(_theme_);
        return this;
    }

    /**
     * This function allows setting a value for _keyword
     * 
     * @param _keyword_ desired value to be set
     * @return Builder object with new value for _keyword
     */
    public VideoResourceBuilder _keyword_(List<TypedLiteral> _keyword_) {
        this.videoResourceImpl.setKeyword(_keyword_);
        return this;
    }

    /**
     * This function allows adding a value to the List _keyword
     * 
     * @param _keyword_ desired value to be added
     * @return Builder object with new value for _keyword
     */
    public VideoResourceBuilder _keyword_(TypedLiteral _keyword_) {
        this.videoResourceImpl.getKeyword().add(_keyword_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be set
     * @return Builder object with new value for _temporalCoverage
     */
    public VideoResourceBuilder _temporalCoverage_(List<TemporalEntity> _temporalCoverage_) {
        this.videoResourceImpl.setTemporalCoverage(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be added
     * @return Builder object with new value for _temporalCoverage
     */
    public VideoResourceBuilder _temporalCoverage_(TemporalEntity _temporalCoverage_) {
        this.videoResourceImpl.getTemporalCoverage().add(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalResolution
     * 
     * @param _temporalResolution_ desired value to be set
     * @return Builder object with new value for _temporalResolution
     */
    public VideoResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
        this.videoResourceImpl.setTemporalResolution(_temporalResolution_);
        return this;
    }

    /**
     * This function allows setting a value for _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be set
     * @return Builder object with new value for _spatialCoverage
     */
    public VideoResourceBuilder _spatialCoverage_(List<Location> _spatialCoverage_) {
        this.videoResourceImpl.setSpatialCoverage(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be added
     * @return Builder object with new value for _spatialCoverage
     */
    public VideoResourceBuilder _spatialCoverage_(Location _spatialCoverage_) {
        this.videoResourceImpl.getSpatialCoverage().add(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _accrualPeriodicity
     * 
     * @param _accrualPeriodicity_ desired value to be set
     * @return Builder object with new value for _accrualPeriodicity
     */
    public VideoResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
        this.videoResourceImpl.setAccrualPeriodicity(_accrualPeriodicity_);
        return this;
    }

    /**
     * This function allows setting a value for _contentStandard
     * 
     * @param _contentStandard_ desired value to be set
     * @return Builder object with new value for _contentStandard
     */
    public VideoResourceBuilder _contentStandard_(URI _contentStandard_) {
        this.videoResourceImpl.setContentStandard(_contentStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public VideoResourceBuilder _language_(List<Language> _language_) {
        this.videoResourceImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows adding a value to the List _language
     * 
     * @param _language_ desired value to be added
     * @return Builder object with new value for _language
     */
    public VideoResourceBuilder _language_(Language _language_) {
        this.videoResourceImpl.getLanguage().add(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public VideoResourceBuilder _created_(XMLGregorianCalendar _created_) {
        this.videoResourceImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public VideoResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.videoResourceImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public VideoResourceBuilder _title_(List<TypedLiteral> _title_) {
        this.videoResourceImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public VideoResourceBuilder _title_(TypedLiteral _title_) {
        this.videoResourceImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public VideoResourceBuilder _description_(List<TypedLiteral> _description_) {
        this.videoResourceImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public VideoResourceBuilder _description_(TypedLiteral _description_) {
        this.videoResourceImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public VideoResourceBuilder _shapesGraph_(URI _shapesGraph_) {
        this.videoResourceImpl.setShapesGraph(_shapesGraph_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public VideoResourceBuilder _version_(String _version_) {
        this.videoResourceImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    @Override
    public VideoResource build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(videoResourceImpl);
        return videoResourceImpl;
    }
}
