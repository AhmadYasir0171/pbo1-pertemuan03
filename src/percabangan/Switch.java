package percabangan;

public class Switch {
    public static void main(String[] args) {
        int jalanJalan=3;
        switch (jalanJalan){
            case 1:
                System.out.println("manusia lapas");
                break;
            case 2:
                System.out.println("Iwak lapas");
                break;
            case 3:
                System.out.println("Buaya lapas");
                break;
            case 4:
                System.out.println("bebek lapas");
                break;
            default:
                System.out.println("iya iya iya...");
                break;
        }
    }
}