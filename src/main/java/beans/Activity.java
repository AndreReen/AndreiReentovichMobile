
package beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Activity {

    @SerializedName("theme")
    @Expose
    private String theme;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("screenOrientation")
    @Expose
    private String screenOrientation;
    @SerializedName("intentFilters")
    @Expose
    private List<IntentFilter> intentFilters = new ArrayList<IntentFilter>();

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getScreenOrientation() {
        return screenOrientation;
    }

    public void setScreenOrientation(String screenOrientation) {
        this.screenOrientation = screenOrientation;
    }

    public List<IntentFilter> getIntentFilters() {
        return intentFilters;
    }

    public void setIntentFilters(List<IntentFilter> intentFilters) {
        this.intentFilters = intentFilters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Activity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("theme");
        sb.append('=');
        sb.append(((this.theme == null)?"<null>":this.theme));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("screenOrientation");
        sb.append('=');
        sb.append(((this.screenOrientation == null)?"<null>":this.screenOrientation));
        sb.append(',');
        sb.append("intentFilters");
        sb.append('=');
        sb.append(((this.intentFilters == null)?"<null>":this.intentFilters));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.intentFilters == null)? 0 :this.intentFilters.hashCode()));
        result = ((result* 31)+((this.theme == null)? 0 :this.theme.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.screenOrientation == null)? 0 :this.screenOrientation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Activity) == false) {
            return false;
        }
        Activity rhs = ((Activity) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.intentFilters == rhs.intentFilters)||((this.intentFilters!= null)&&this.intentFilters.equals(rhs.intentFilters))))&&((this.theme == rhs.theme)||((this.theme!= null)&&this.theme.equals(rhs.theme))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.screenOrientation == rhs.screenOrientation)||((this.screenOrientation!= null)&&this.screenOrientation.equals(rhs.screenOrientation))));
    }

}
