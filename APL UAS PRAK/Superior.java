//Class Superior dan diimplementasikan dari IndonesiaReg
public class Superior implements IndonesiaReg {
    //Digunakan untuk mencetak tulisan Indonesia sebagai nama Region
    @Override
    public void server() {
        System.out.println("Indonesia");
    }

    //method yang digunakan untuk me-return tulisan Superior
    public String toString() {
        return "Superior";
    }
}
