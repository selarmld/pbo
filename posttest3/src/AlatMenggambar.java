public class AlatMenggambar extends Stationery {
    private String drawingTools;

    public AlatMenggambar(String jenis, String jumlah, String harga, String drawingTools) {
        super(jenis, jumlah, harga);
        this.drawingTools = drawingTools;
    }

    public String getDrawingTools() {
        return drawingTools;
    }

    public void setDrawingTools(String drawingTools) {
        this.drawingTools = drawingTools;
    }

    @Override
    public void display() {
        System.out.printf("Jenis: %s, Jumlah: %s, Harga: %s, Alat Menggambar: %s%n", getJenis(), getJumlah(), getHarga(), drawingTools);
    }
}
