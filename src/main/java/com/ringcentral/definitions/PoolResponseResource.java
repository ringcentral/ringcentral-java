package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PoolResponseResource
{
    //
    public String rendererId;
    public PoolResponseResource rendererId(String rendererId) {
        this.rendererId = rendererId;
        return this;
    }
    //
    public String messageId;
    public PoolResponseResource messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    //
    public String extensionId;
    public PoolResponseResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    //
    public String extensionNumber;
    public PoolResponseResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public String firstName;
    public PoolResponseResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    //
    public String lastName;
    public PoolResponseResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    //
    public String street;
    public PoolResponseResource street(String street) {
        this.street = street;
        return this;
    }
    //
    public String city;
    public PoolResponseResource city(String city) {
        this.city = city;
        return this;
    }
    //
    public String state;
    public PoolResponseResource state(String state) {
        this.state = state;
        return this;
    }
    //
    public String zip;
    public PoolResponseResource zip(String zip) {
        this.zip = zip;
        return this;
    }
    //
    public String country;
    public PoolResponseResource country(String country) {
        this.country = country;
        return this;
    }
    //
    public String countryId;
    public PoolResponseResource countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    //
    public String companyName;
    public PoolResponseResource companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    //
    public String faxNumber;
    public PoolResponseResource faxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }
    //
    public String contactPhone;
    public PoolResponseResource contactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    //
    public String email;
    public PoolResponseResource email(String email) {
        this.email = email;
        return this;
    }
    //
    public String languageCode;
    public PoolResponseResource languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    //
    public String languageId;
    public PoolResponseResource languageId(String languageId) {
        this.languageId = languageId;
        return this;
    }
    //
    public Double footerType;
    public PoolResponseResource footerType(Double footerType) {
        this.footerType = footerType;
        return this;
    }
    //
    public Double coverIndex;
    public PoolResponseResource coverIndex(Double coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }
    //
    public String coverPageText;
    public PoolResponseResource coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }
    //
    public File[] sourceFiles;
    public PoolResponseResource sourceFiles(File[] sourceFiles) {
        this.sourceFiles = sourceFiles;
        return this;
    }
    //
    public String[] messageServers;
    public PoolResponseResource messageServers(String[] messageServers) {
        this.messageServers = messageServers;
        return this;
    }
    //
    public Long touchInterval;
    public PoolResponseResource touchInterval(Long touchInterval) {
        this.touchInterval = touchInterval;
        return this;
    }
}
