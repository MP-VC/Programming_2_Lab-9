package Q2;
import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    String name;
    boolean member = false;
    String memberType = "none";
    ArrayList<String> validType = new ArrayList<>(Arrays.asList("premium","gold","silver"));

    public Customer(String name) {
        this.name = name;
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
