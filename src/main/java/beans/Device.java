
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {

    @SerializedName("desiredCapabilities")
    @Expose
    private DesiredCapabilities desiredCapabilities;

    public DesiredCapabilities getDesiredCapabilities() {
        return desiredCapabilities;
    }

    public void setDesiredCapabilities(DesiredCapabilities desiredCapabilities) {
        this.desiredCapabilities = desiredCapabilities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Device.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("desiredCapabilities");
        sb.append('=');
        sb.append(((this.desiredCapabilities == null)?"<null>":this.desiredCapabilities));
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
        result = ((result* 31)+((this.desiredCapabilities == null)? 0 :this.desiredCapabilities.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device) == false) {
            return false;
        }
        Device rhs = ((Device) other);
        return ((this.desiredCapabilities == rhs.desiredCapabilities)||((this.desiredCapabilities!= null)&&this.desiredCapabilities.equals(rhs.desiredCapabilities)));
    }

}
