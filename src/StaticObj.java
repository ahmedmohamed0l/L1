public class StaticObj {

    PersonalInfo ObjPI = new PersonalInfo();

    public void Hi() {
        System.out.println("# Hi LUCiFER x_x #");
    }

    public void FN() {
        System.out.println("Whats your first name ?");
    }

    public void SN() {
        System.out.println("Whats your second name ?");
    }

    public void FullN(String fullN) {
        System.out.println("Your name is " + fullN);
    }

    public void SexType() {
        System.out.println("Ok now whats your sex type ? (F\\Female, M\\Male) :D");
    }

    public void SexTOut(String SexType) {
        System.out.println("And you are " + SexType);
    }

    public void Age() {
        System.out.println("What about your age ? >_>");
    }

    public void AgeCon() {
        final int AllowedAge = 18;
        /*if (ObjPI.getAge() >= AllowedAge) {
            System.out.println("Oh nice! You can use this app.. Have fun <3");
        } else {
            System.out.println("I'm so sorry but you can'nt use this app. TOT");
        }*/
        String AS = ((ObjPI.getAge()) >= AllowedAge) ? "Oh nice! You can 2use this app.. Have fun <3" : "I'm so sorry but you can'nt use this app. TOT";
        System.out.println(AS);
    }

    public void AgeOut(int age) {
        System.out.println("And you are " + age + " years old ");
        int AllowedAge = 18;
        /*if (ObjPI.getAge() >= AllowedAge) {
            System.out.println("Oh nice! You can use this app.. Have fun <3");
        } else {
            System.out.println("I'm so sorry but you can'nt use this app. TOT");
        }*/
        String AS = (ObjPI.getAge() >= AllowedAge) ? "You can use this app.. Have fun <3" : "You can'nt use this app. TOT";
        System.out.println(AS);
    }

    public void Tall() {
        System.out.println("Finally whats your height ? \"By CM\"<_<");
    }

    public void TallOut(int tall) {
        String unit = "CM";
        System.out.println("Finally your height is " + tall + unit.toLowerCase());
    }

    public void ThxMsg() {
        System.out.println("Thank you for giving me this information and your patience with me <3");

    }

    public void Bye() {
        System.out.println("Goodbye it was a pleasure to meet you and have a nice day, See you later!");
        System.out.println("Powered by Ahmed_0l XD");
    }
}