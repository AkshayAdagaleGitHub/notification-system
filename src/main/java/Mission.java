import java.util.*;

public class Mission {
    private String name;
    private String status;
    private Set<Avenger> missionAssignedTo = new HashSet<>();
//    private Details missionDetails;

    public Mission(String name) {
        this.name = name;
        this.status = "Active";
//        this.missionDetails = new Mission(Date.from());
    }

    public Set<Avenger> getMissionAssignedTo() {
        return missionAssignedTo;
    }

    public void setMissionAssignedTo(Set<Avenger> missionAssignedTo) {
        this.missionAssignedTo = missionAssignedTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
