public class Calculate_wifi {
    private int aj;
    private int ishara;
    private int isuru;
    private int sara;
    private double total_bill;


    public void set_bill(double bill,int ishara,int isuru,int aj,int sara){
        this.ishara = ishara;
        this.isuru = isuru;
        this.aj = aj;
        this.sara = sara;
        this.total_bill = bill;
    }
    public void calculate_bill(){
        double aj = total_bill * aj/100.0;
        double ishara = total_bill * ishara/100.0;
        double isuru = total_bill * isuru/100.0;
        double sara = total_bill * sara/100.0;


    }
}
