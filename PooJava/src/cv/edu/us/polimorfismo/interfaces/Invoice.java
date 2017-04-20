package cv.edu.us.polimorfismo.interfaces;

//fatura
//classe Invoice que implementa Payable
//fatura dos produtos comprados pela empresa quantidade a pagar
public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    //construtor com quatro argumentos
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.setQuantity(quantity); //armanzena a quantidade
        this.setPricePerItem(pricePerItem); //valida e armanzena o preço por item
    }//fim do construtor Invoice de 4 argumentos.

    //retorna peça
    public String getPartNumber() {
        return partNumber;
    }

    //configura peças
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    //retorna Descrição
    public String getPartDescription() {
        return partDescription;
    }

    //configura Descrição
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    //retorna Quantidade
    public int getQuantity() {
        return quantity;
    }

    //configura Quantidade
    public void setQuantity(int quantity) {
        this.quantity = (quantity < 0) ? 0 : quantity;//a quantidade não pode ser negativa
    }

    //retorna PricePerItem
    public double getPricePerItem() {
        return pricePerItem;
    }

    //configura PricePerItem
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem < 0.0) ? 0.0 : pricePerItem;
    }
    
    @Override
    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s : %d \n%s: $%.2f",
                "Invoice",
                "Part number", this.getPartNumber(), this.getPartDescription(),
                "quantity", this.getQuantity(), "Price per item", this.getPricePerItem());
    }
    
    @Override
    public double getPaymentAmount() {
        return this.getQuantity() * this.getPricePerItem(); //calcula custo total
    }
}
