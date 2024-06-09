public class StaticObjects {

    public void Hi() {
        System.out.println("# Hi LUCiFER x_x #");
    }

    public void Name(String name) {
        System.out.println("Your name: " + name);
    }

    public void Age(int age) {
        System.out.println("Your age is: " + age);
        int allowedege = 18;
        String AS = (age >= allowedege) ? "You can use this app!" : "You can\'nt use this app!";
        System.out.println("Age state: ".concat(AS));
    }

    public void Tall(double tall) {
        String unit = "CM";
        System.out.println("Your tall by cm: " + tall + unit.toLowerCase());
    }

    public void Blud(char blud) {
        System.out.println("Your blud type: " + blud);
    }
}
