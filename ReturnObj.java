package in.dmart.enterprise.cos.domain.origin.response.addresscustomer;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"addressId", "address", "addressName", "addressType", "alternatePhone", "city",
    "country", "email", "firstName", "isPrimary", "lastName", "middleName", "nickName",
    "personTitle", "phone", "selfAddress", "shippingGeoCode", "state", "status", "taxGeoCode",
    "usersId", "zipCode"})
public class ReturnObj {

  @JsonProperty("addressId")
  private String addressId;
  @JsonProperty("address")
  private String address;
  @JsonProperty("addressName")
  private String addressName;
  @JsonProperty("addressType")
  private String addressType;
  @JsonProperty("alternatePhone")
  private String alternatePhone;
  @JsonProperty("city")
  private String city;
  @JsonProperty("country")
  private String country;
  @JsonProperty("email")
  private String email;
  @JsonProperty("firstName")
  private String firstName;
  @JsonProperty("isPrimary")
  private Integer isPrimary;
  @JsonProperty("lastName")
  private String lastName;
  @JsonProperty("middleName")
  private String middleName;
  @JsonProperty("nickName")
  private String nickName;
  @JsonProperty("personTitle")
  private String personTitle;
  @JsonProperty("phone")
  private String phone;
  @JsonProperty("selfAddress")
  private Integer selfAddress;
  @JsonProperty("shippingGeoCode")
  private String shippingGeoCode;
  @JsonProperty("state")
  private String state;
  @JsonProperty("status")
  private String status;
  @JsonProperty("taxGeoCode")
  private String taxGeoCode;
  @JsonProperty("usersId")
  private String usersId;
  @JsonProperty("zipCode")
  private String zipCode;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("addressId")
  public String getAddressId() {
    return addressId;
  }

  @JsonProperty("addressId")
  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(String address) {
    this.address = address;
  }

  @JsonProperty("addressName")
  public String getAddressName() {
    return addressName;
  }

  @JsonProperty("addressName")
  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  @JsonProperty("addressType")
  public String getAddressType() {
    return addressType;
  }

  @JsonProperty("addressType")
  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  @JsonProperty("alternatePhone")
  public String getAlternatePhone() {
    return alternatePhone;
  }

  @JsonProperty("alternatePhone")
  public void setAlternatePhone(String alternatePhone) {
    this.alternatePhone = alternatePhone;
  }

  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @JsonProperty("isPrimary")
  public Integer getIsPrimary() {
    return isPrimary;
  }

  @JsonProperty("isPrimary")
  public void setIsPrimary(Integer isPrimary) {
    this.isPrimary = isPrimary;
  }

  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  @JsonProperty("middleName")
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @JsonProperty("nickName")
  public String getNickName() {
    return nickName;
  }

  @JsonProperty("nickName")
  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  @JsonProperty("personTitle")
  public String getPersonTitle() {
    return personTitle;
  }

  @JsonProperty("personTitle")
  public void setPersonTitle(String personTitle) {
    this.personTitle = personTitle;
  }

  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  @JsonProperty("phone")
  public void setPhone(String phone) {
    this.phone = phone;
  }

  @JsonProperty("selfAddress")
  public Integer getSelfAddress() {
    return selfAddress;
  }

  @JsonProperty("selfAddress")
  public void setSelfAddress(Integer selfAddress) {
    this.selfAddress = selfAddress;
  }

  @JsonProperty("shippingGeoCode")
  public String getShippingGeoCode() {
    return shippingGeoCode;
  }

  @JsonProperty("shippingGeoCode")
  public void setShippingGeoCode(String shippingGeoCode) {
    this.shippingGeoCode = shippingGeoCode;
  }

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  @JsonProperty("taxGeoCode")
  public String getTaxGeoCode() {
    return taxGeoCode;
  }

  @JsonProperty("taxGeoCode")
  public void setTaxGeoCode(String taxGeoCode) {
    this.taxGeoCode = taxGeoCode;
  }

  @JsonProperty("usersId")
  public String getUsersId() {
    return usersId;
  }

  @JsonProperty("usersId")
  public void setUsersId(String usersId) {
    this.usersId = usersId;
  }

  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  @JsonProperty("zipCode")
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }


}
