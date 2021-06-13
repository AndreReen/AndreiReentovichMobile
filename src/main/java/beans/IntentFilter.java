
package beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IntentFilter {

    @SerializedName("actions")
    @Expose
    private List<Action> actions = new ArrayList<Action>();
    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<Category>();

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IntentFilter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actions");
        sb.append('=');
        sb.append(((this.actions == null)?"<null>":this.actions));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
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
        result = ((result* 31)+((this.actions == null)? 0 :this.actions.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntentFilter) == false) {
            return false;
        }
        IntentFilter rhs = ((IntentFilter) other);
        return (((this.actions == rhs.actions)||((this.actions!= null)&&this.actions.equals(rhs.actions)))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))));
    }

}
