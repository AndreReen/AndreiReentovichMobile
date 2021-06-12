
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DesiredCapabilities {

    @SerializedName("platformName")
    @Expose
    private String platformName;
    @SerializedName("platformVersion")
    @Expose
    private String platformVersion;
    @SerializedName("deviceName")
    @Expose
    private String deviceName;
    @SerializedName("udid")
    @Expose
    private String udid;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DesiredCapabilities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("platformName");
        sb.append('=');
        sb.append(((this.platformName == null)?"<null>":this.platformName));
        sb.append(',');
        sb.append("platformVersion");
        sb.append('=');
        sb.append(((this.platformVersion == null)?"<null>":this.platformVersion));
        sb.append(',');
        sb.append("deviceName");
        sb.append('=');
        sb.append(((this.deviceName == null)?"<null>":this.deviceName));
        sb.append(',');
        sb.append("udid");
        sb.append('=');
        sb.append(((this.udid == null)?"<null>":this.udid));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.platformName == null)? 0 :this.platformName.hashCode()));
        result = ((result* 31)+((this.udid == null)? 0 :this.udid.hashCode()));
        result = ((result* 31)+((this.deviceName == null)? 0 :this.deviceName.hashCode()));
        result = ((result* 31)+((this.platformVersion == null)? 0 :this.platformVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DesiredCapabilities) == false) {
            return false;
        }
        DesiredCapabilities rhs = ((DesiredCapabilities) other);
        return (((((this.platformName == rhs.platformName)||((this.platformName!= null)&&this.platformName.equals(rhs.platformName)))&&((this.udid == rhs.udid)||((this.udid!= null)&&this.udid.equals(rhs.udid))))&&((this.deviceName == rhs.deviceName)||((this.deviceName!= null)&&this.deviceName.equals(rhs.deviceName))))&&((this.platformVersion == rhs.platformVersion)||((this.platformVersion!= null)&&this.platformVersion.equals(rhs.platformVersion))));
    }

}
