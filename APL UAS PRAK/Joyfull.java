//Class Joyfull dan diimplementasikan dari IndonesiaReg
public class Joyfull implements IndonesiaReg {
    //Digunakan untuk mencetak tulisan Indonesia sebagai nama Region
    @Override
    public void server() {
        System.out.println("Indonesia");
    }

    //method yang digunakan untuk me-return tulisan Joyfull
    public String toString() {
        return "Joyfull";
    }
}
