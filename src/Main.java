import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ObjSc = new Scanner(System.in);
        PersonalInfo ObjPI = new PersonalInfo();
        StaticObj ObjSO = new StaticObj();
        StaticObj.Name Name = new StaticObj.Name();
        StaticObj.Type Type = new StaticObj.Type();
        StaticObj.Age Age = new StaticObj.Age();
        StaticObj.Tall Tall = new StaticObj.Tall();

        //=========================(INPUTS)=========================
        ObjSO.Hi();
        //---Name---
        Name.FN();
        ObjPI.setFN(ObjSc.nextLine());
        Name.SN();
        ObjPI.setSN(ObjSc.nextLine());
        ObjPI.setFullN(ObjPI.getFN().concat(" ").concat(ObjPI.getSN()));
        //---Type---
        Type.SexType();
        ObjPI.setSexType(ObjSc.nextLine());
        //---Age---
        Age.AgeQ();
        ObjPI.setAge(ObjSc.nextInt());
        Age.AgeCon();
        //---Tall---
        Tall.TallQ();
        ObjPI.setTall(ObjSc.nextInt());

        //=========================(OUTPUTS)=========================
        ObjSO.ThxMsg();
        Name.FullN(ObjPI.getFullN());
        Type.SexTOut(ObjPI.getSexType());
        Age.AgeOut(ObjPI.getAge());
        Tall.TallOut(ObjPI.getTall());
        ObjSO.Bye();

    }
}