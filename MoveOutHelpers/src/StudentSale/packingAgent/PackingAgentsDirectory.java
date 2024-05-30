package StudentSale.packingAgent;

import StudentSale.ModificationInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshila
 */
public class PackingAgentsDirectory extends ModificationInfo {

    private List<PackingAgent> packingAgents = new ArrayList<>();

    public PackingAgentsDirectory(List<PackingAgent> packingAgents, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.packingAgents = packingAgents;
    }

    public PackingAgentsDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public PackingAgentsDirectory() {
        super(new Date(), new Date(), "SystemAdmin", "SystemAdmin");
    }
    
    public List<PackingAgent> getPackingAgents() {
        return packingAgents;
    }

    public void setPackingAgents(List<PackingAgent> packingAgents) {
        this.packingAgents = packingAgents;
    }
}
