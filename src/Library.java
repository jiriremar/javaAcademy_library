import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryName;
    private List<Section> sectionList;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.sectionList = new ArrayList<>();
    }

    public void addSection(Section section) {
        this.sectionList.add(section);
    }

    public void infoLibrary(){
        System.out.println(" ");
        System.out.println("                 === Library === \n                " + libraryName.toUpperCase());
        for (Section section : sectionList) {
            section.infoSection();
        }
    }
}
