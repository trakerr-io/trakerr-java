/**
 * Trakerr API
 * Get your application events and errors to Trakerr via the *Trakerr API*.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.trakerr.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomStringData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-19T10:48:29.731-08:00")
public class CustomStringData   {
  @SerializedName("customData1")
  private String customData1 = null;

  @SerializedName("customData2")
  private String customData2 = null;

  @SerializedName("customData3")
  private String customData3 = null;

  @SerializedName("customData4")
  private String customData4 = null;

  @SerializedName("customData5")
  private String customData5 = null;

  @SerializedName("customData6")
  private String customData6 = null;

  @SerializedName("customData7")
  private String customData7 = null;

  @SerializedName("customData8")
  private String customData8 = null;

  @SerializedName("customData9")
  private String customData9 = null;

  @SerializedName("customData10")
  private String customData10 = null;

  public CustomStringData customData1(String customData1) {
    this.customData1 = customData1;
    return this;
  }

   /**
   * Get customData1
   * @return customData1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData1() {
    return customData1;
  }

  public void setCustomData1(String customData1) {
    this.customData1 = customData1;
  }

  public CustomStringData customData2(String customData2) {
    this.customData2 = customData2;
    return this;
  }

   /**
   * Get customData2
   * @return customData2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData2() {
    return customData2;
  }

  public void setCustomData2(String customData2) {
    this.customData2 = customData2;
  }

  public CustomStringData customData3(String customData3) {
    this.customData3 = customData3;
    return this;
  }

   /**
   * Get customData3
   * @return customData3
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData3() {
    return customData3;
  }

  public void setCustomData3(String customData3) {
    this.customData3 = customData3;
  }

  public CustomStringData customData4(String customData4) {
    this.customData4 = customData4;
    return this;
  }

   /**
   * Get customData4
   * @return customData4
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData4() {
    return customData4;
  }

  public void setCustomData4(String customData4) {
    this.customData4 = customData4;
  }

  public CustomStringData customData5(String customData5) {
    this.customData5 = customData5;
    return this;
  }

   /**
   * Get customData5
   * @return customData5
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData5() {
    return customData5;
  }

  public void setCustomData5(String customData5) {
    this.customData5 = customData5;
  }

  public CustomStringData customData6(String customData6) {
    this.customData6 = customData6;
    return this;
  }

   /**
   * Get customData6
   * @return customData6
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData6() {
    return customData6;
  }

  public void setCustomData6(String customData6) {
    this.customData6 = customData6;
  }

  public CustomStringData customData7(String customData7) {
    this.customData7 = customData7;
    return this;
  }

   /**
   * Get customData7
   * @return customData7
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData7() {
    return customData7;
  }

  public void setCustomData7(String customData7) {
    this.customData7 = customData7;
  }

  public CustomStringData customData8(String customData8) {
    this.customData8 = customData8;
    return this;
  }

   /**
   * Get customData8
   * @return customData8
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData8() {
    return customData8;
  }

  public void setCustomData8(String customData8) {
    this.customData8 = customData8;
  }

  public CustomStringData customData9(String customData9) {
    this.customData9 = customData9;
    return this;
  }

   /**
   * Get customData9
   * @return customData9
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData9() {
    return customData9;
  }

  public void setCustomData9(String customData9) {
    this.customData9 = customData9;
  }

  public CustomStringData customData10(String customData10) {
    this.customData10 = customData10;
    return this;
  }

   /**
   * Get customData10
   * @return customData10
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData10() {
    return customData10;
  }

  public void setCustomData10(String customData10) {
    this.customData10 = customData10;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomStringData customStringData = (CustomStringData) o;
    return Objects.equals(this.customData1, customStringData.customData1) &&
        Objects.equals(this.customData2, customStringData.customData2) &&
        Objects.equals(this.customData3, customStringData.customData3) &&
        Objects.equals(this.customData4, customStringData.customData4) &&
        Objects.equals(this.customData5, customStringData.customData5) &&
        Objects.equals(this.customData6, customStringData.customData6) &&
        Objects.equals(this.customData7, customStringData.customData7) &&
        Objects.equals(this.customData8, customStringData.customData8) &&
        Objects.equals(this.customData9, customStringData.customData9) &&
        Objects.equals(this.customData10, customStringData.customData10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customData1, customData2, customData3, customData4, customData5, customData6, customData7, customData8, customData9, customData10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomStringData {\n");
    
    sb.append("    customData1: ").append(toIndentedString(customData1)).append("\n");
    sb.append("    customData2: ").append(toIndentedString(customData2)).append("\n");
    sb.append("    customData3: ").append(toIndentedString(customData3)).append("\n");
    sb.append("    customData4: ").append(toIndentedString(customData4)).append("\n");
    sb.append("    customData5: ").append(toIndentedString(customData5)).append("\n");
    sb.append("    customData6: ").append(toIndentedString(customData6)).append("\n");
    sb.append("    customData7: ").append(toIndentedString(customData7)).append("\n");
    sb.append("    customData8: ").append(toIndentedString(customData8)).append("\n");
    sb.append("    customData9: ").append(toIndentedString(customData9)).append("\n");
    sb.append("    customData10: ").append(toIndentedString(customData10)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

