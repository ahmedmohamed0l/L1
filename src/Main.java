import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StaticObj ObjSO = new StaticObj();
        PersonalInfo ObjPI = new PersonalInfo();
        Scanner ObjSc = new Scanner(System.in);

        ObjSO.Hi();
        ObjSO.FN();
        ObjPI.setFN(ObjSc.nextLine());
        ObjSO.SN();
        ObjPI.setSN(ObjSc.nextLine());
        ObjPI.setFullN(ObjPI.getFN().concat(" ").concat(ObjPI.getSN()));
        ObjSO.SexType();
        ObjPI.setSexType(ObjSc.nextLine());
        ObjSO.Age();
        ObjPI.setAge(ObjSc.nextInt());
        ObjSO.AgeCon();
        ObjSO.Tall();
        ObjPI.setTall(ObjSc.nextInt());

        
        ObjSO.ThxMsg();
        ObjSO.FullN(ObjPI.getFullN());
        ObjSO.SexTOut(ObjPI.getSexType());
        ObjSO.AgeOut(ObjPI.getAge());
        ObjSO.TallOut(ObjPI.getTall());
        ObjSO.Bye();

    }
}