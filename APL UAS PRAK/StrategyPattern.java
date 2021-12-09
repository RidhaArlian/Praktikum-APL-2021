public class StrategyPattern {
    private IndonesiaReg indonesiaReg;

    //Method Set
    public void setIndonesiaReg(IndonesiaReg indonesiaReg) {
        this.indonesiaReg = indonesiaReg;
    }

    public IndonesiaReg getIndonesiaReg() {
        return this.indonesiaReg;
    }

    public void server() {
        indonesiaReg.server();
    }
}
