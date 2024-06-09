import java.util.Scanner;

public class PersonalInfo {
    Scanner ObjSc = new Scanner(System.in);

//---------------------------(Privet)---------------------------

    private String FN, SN, FullN, SexType;
    private int Age, Tall;

    /*Old Data:-
    private String FN = "";
    private String SN = ;
    private String FullN = FN.concat(SN);
    private int Age = 18;
    private double Tall = 1.82;
    private char Blood = 'A';*/

//---------------------------(Getter)---------------------------

    public String getFN() {
        return FN;
    }

    public String getSN() {
        return SN;
    }

    public String getFullN() {
        return FullN;
    }

    public String getSexType() {
        return this.SexType;
    }

    public int getAge() {
        return this.Age;
    }

    public int getTall() {
        return Tall;
    }

//---------------------------(Setter)---------------------------

    public void setFN(String newFN) {
        this.FN = newFN;
    }

    public void setSN(String newSN) {
        this.SN = newSN;
    }

    public void setFullN(String newFullN) {
        this.FullN = newFullN;
    }

    public void setSexType(String newSexType) {
        this.SexType = newSexType;
        do {
            if (newSexType.equalsIgnoreCase("f")) {
                this.SexType = "Female";
            } else if (newSexType.equalsIgnoreCase("m")) {
                this.SexType = "Male";
            } else {
                System.out.println("Wrong Answer !!, Please enter 'F' or 'M'");
                newSexType = ObjSc.nextLine();
            }
        } while (!newSexType.equalsIgnoreCase("f") && newSexType.equalsIgnoreCase("m"));

    }

    public void setAge(int newAge) {
        this.Age = newAge;
    }

    public void setTall(int tall) {
        this.Tall = tall;
    }


}