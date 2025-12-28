import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String address;
    private List<ResearchAssociate> researchAssociates;

    public Department(String name, String address) {
        this.name = name;
        this.address = address;
        this.researchAssociates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ResearchAssociate> getResearchAssociates() {
        return researchAssociates;
    }


    public void addResearchAssociate(ResearchAssociate researchAssociate) {
        if (researchAssociate != null && !researchAssociates.contains(researchAssociate)) {
            researchAssociates.add(researchAssociate);
            researchAssociate.addInstitute(this);
        }
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}



