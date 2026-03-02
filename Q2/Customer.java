package Q2;
import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType = "none";
    private ArrayList<String> validType = new ArrayList<>(Arrays.asList("premium","gold","silver"));

    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMember() {
        member = true;
    }
    public void setMemberType(String type) {
        if(validType.contains(type.toLowerCase()) && member) memberType = type;
    }

    public String getMemberType() {
        return memberType;
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "Member: " + member + '\n' +
                "Member type: " + memberType;
    }
}
