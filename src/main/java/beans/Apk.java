
package beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Apk {

    @SerializedName("providers")
    @Expose
    private List<Object> providers = new ArrayList<Object>();
    @SerializedName("services")
    @Expose
    private List<Object> services = new ArrayList<Object>();
    @SerializedName("userLibraries")
    @Expose
    private List<Object> userLibraries = new ArrayList<Object>();
    @SerializedName("activities")
    @Expose
    private List<Activity> activities = new ArrayList<Activity>();
    @SerializedName("launcherActivities")
    @Expose
    private List<String> launcherActivities = new ArrayList<String>();
    @SerializedName("activityAliases")
    @Expose
    private List<Object> activityAliases = new ArrayList<Object>();
    @SerializedName("permissions")
    @Expose
    private List<String> permissions = new ArrayList<String>();
    @SerializedName("packageName")
    @Expose
    private String packageName;
    @SerializedName("buildType")
    @Expose
    private String buildType;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("minSDK")
    @Expose
    private Integer minSDK;
    @SerializedName("targetSDK")
    @Expose
    private Integer targetSDK;

    public List<Object> getProviders() {
        return providers;
    }

    public void setProviders(List<Object> providers) {
        this.providers = providers;
    }

    public List<Object> getServices() {
        return services;
    }

    public void setServices(List<Object> services) {
        this.services = services;
    }

    public List<Object> getUserLibraries() {
        return userLibraries;
    }

    public void setUserLibraries(List<Object> userLibraries) {
        this.userLibraries = userLibraries;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<String> getLauncherActivities() {
        return launcherActivities;
    }

    public void setLauncherActivities(List<String> launcherActivities) {
        this.launcherActivities = launcherActivities;
    }

    public List<Object> getActivityAliases() {
        return activityAliases;
    }

    public void setActivityAliases(List<Object> activityAliases) {
        this.activityAliases = activityAliases;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getMinSDK() {
        return minSDK;
    }

    public void setMinSDK(Integer minSDK) {
        this.minSDK = minSDK;
    }

    public Integer getTargetSDK() {
        return targetSDK;
    }

    public void setTargetSDK(Integer targetSDK) {
        this.targetSDK = targetSDK;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Apk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("providers");
        sb.append('=');
        sb.append(((this.providers == null)?"<null>":this.providers));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("userLibraries");
        sb.append('=');
        sb.append(((this.userLibraries == null)?"<null>":this.userLibraries));
        sb.append(',');
        sb.append("activities");
        sb.append('=');
        sb.append(((this.activities == null)?"<null>":this.activities));
        sb.append(',');
        sb.append("launcherActivities");
        sb.append('=');
        sb.append(((this.launcherActivities == null)?"<null>":this.launcherActivities));
        sb.append(',');
        sb.append("activityAliases");
        sb.append('=');
        sb.append(((this.activityAliases == null)?"<null>":this.activityAliases));
        sb.append(',');
        sb.append("permissions");
        sb.append('=');
        sb.append(((this.permissions == null)?"<null>":this.permissions));
        sb.append(',');
        sb.append("packageName");
        sb.append('=');
        sb.append(((this.packageName == null)?"<null>":this.packageName));
        sb.append(',');
        sb.append("buildType");
        sb.append('=');
        sb.append(((this.buildType == null)?"<null>":this.buildType));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("minSDK");
        sb.append('=');
        sb.append(((this.minSDK == null)?"<null>":this.minSDK));
        sb.append(',');
        sb.append("targetSDK");
        sb.append('=');
        sb.append(((this.targetSDK == null)?"<null>":this.targetSDK));
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
        result = ((result* 31)+((this.targetSDK == null)? 0 :this.targetSDK.hashCode()));
        result = ((result* 31)+((this.services == null)? 0 :this.services.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.userLibraries == null)? 0 :this.userLibraries.hashCode()));
        result = ((result* 31)+((this.minSDK == null)? 0 :this.minSDK.hashCode()));
        result = ((result* 31)+((this.activities == null)? 0 :this.activities.hashCode()));
        result = ((result* 31)+((this.permissions == null)? 0 :this.permissions.hashCode()));
        result = ((result* 31)+((this.buildType == null)? 0 :this.buildType.hashCode()));
        result = ((result* 31)+((this.launcherActivities == null)? 0 :this.launcherActivities.hashCode()));
        result = ((result* 31)+((this.activityAliases == null)? 0 :this.activityAliases.hashCode()));
        result = ((result* 31)+((this.packageName == null)? 0 :this.packageName.hashCode()));
        result = ((result* 31)+((this.providers == null)? 0 :this.providers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Apk) == false) {
            return false;
        }
        Apk rhs = ((Apk) other);
        return (((((((((((((this.targetSDK == rhs.targetSDK)||((this.targetSDK!= null)&&this.targetSDK.equals(rhs.targetSDK)))&&((this.services == rhs.services)||((this.services!= null)&&this.services.equals(rhs.services))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.userLibraries == rhs.userLibraries)||((this.userLibraries!= null)&&this.userLibraries.equals(rhs.userLibraries))))&&((this.minSDK == rhs.minSDK)||((this.minSDK!= null)&&this.minSDK.equals(rhs.minSDK))))&&((this.activities == rhs.activities)||((this.activities!= null)&&this.activities.equals(rhs.activities))))&&((this.permissions == rhs.permissions)||((this.permissions!= null)&&this.permissions.equals(rhs.permissions))))&&((this.buildType == rhs.buildType)||((this.buildType!= null)&&this.buildType.equals(rhs.buildType))))&&((this.launcherActivities == rhs.launcherActivities)||((this.launcherActivities!= null)&&this.launcherActivities.equals(rhs.launcherActivities))))&&((this.activityAliases == rhs.activityAliases)||((this.activityAliases!= null)&&this.activityAliases.equals(rhs.activityAliases))))&&((this.packageName == rhs.packageName)||((this.packageName!= null)&&this.packageName.equals(rhs.packageName))))&&((this.providers == rhs.providers)||((this.providers!= null)&&this.providers.equals(rhs.providers))));
    }

}
