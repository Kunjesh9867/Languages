public class HouseRunner {
    public static void main(String[] args) {

        System.out.println(); // To add white space

        //Initiate First House Object
        House H1 = new House(555,"Kunjesh Ramani",12.5f);
        System.out.printf("Integer: %d" + "  String: %s"+"  Float: %f",H1.getInteger(),H1.getString(),H1.getFloat());

        System.out.println(); // To add white space
        System.out.println(); // To add white space

        //Initiate Second House Object
        House H2 = new House(145.5f,500,"Johnny Depp");
        System.out.printf("Float: %f"+"  Integer: %d"+"  String: %s",H2.getFloat(),H2.getInteger(),H2.getString());


        //Initiate Third House Object
        System.out.println(); // To add white space
        System.out.println(); // To add white space

        House H3 = new House(1000,5.5f,"Dwayne Johnson");
        System.out.printf("Integer: %d"+"  Float: %f"+"  String: %s",H3.getInteger(),H3.getFloat(),H3.getString());

        System.out.println(); // To add white space
        System.out.println(); // To add white space
    }



}
