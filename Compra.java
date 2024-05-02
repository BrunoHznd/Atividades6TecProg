package Dependencia;

public class Compra {

	 private double valorTotal;
	    private Cupom cupom;

	    public Compra(double valorTotal) {
	        this.valorTotal = valorTotal;
	    }

	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(double valorTotal) {
	        this.valorTotal = valorTotal;
	    }

	    public Cupom getCupom() {
	        return cupom;
	    }

	    public void setCupom(Cupom cupom) {
	        this.cupom = cupom;
	    }

	    public double aplicarDesconto() {
	        if (cupom != null) {
	            return valorTotal * (1 - cupom.getDesconto());
	        } else {
	            return valorTotal;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Compra" + " valor da compra = " + valorTotal + " cupom = " + cupom + " desconto = " + aplicarDesconto();
	    }
	}
	

