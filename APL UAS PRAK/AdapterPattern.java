public class AdapterPattern implements IndonesiaReg {
    ThailandReg thailandReg;

    //method constructor untuk memberikan nilai awal pada AdapterPattern 
    public AdapterPattern(ThailandReg thailandReg) {
        this.thailandReg = thailandReg;
    }

    //mengambil nilai dari inertafe ThailandReg
    @Override
    public void server() {
        thailandReg.Thailand();
    }
}
