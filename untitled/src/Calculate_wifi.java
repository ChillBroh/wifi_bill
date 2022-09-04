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
        double aj_total = total_bill * aj/100.0;
        double ishara_total = total_bill * ishara/100.0;
        double isuru_total = total_bill * isuru/100.0;
        double sara_total = total_bill * sara/100.0;
        System.out.println("***********************************");
        System.out.println("Ishara's contribution : " + ishara_total);
        System.out.println("Isuru's contribution : " + isuru_total);
        System.out.println("AJ's contribution : " + aj_total);
        System.out.println("Sara's contribution : " + sara_total);
        System.out.println("***********************************");
    }
}
