package example02;

public class BacklogItem_V1 extends Entity {

    private SprintId sprintId;
    private BacklogItemStatusType status;

    public void setSprintId(SprintId sprintId) {
        this.sprintId = sprintId;
    }

    public void setStatus(BacklogItemStatusType status) {
        this.status = status;
    }
}
