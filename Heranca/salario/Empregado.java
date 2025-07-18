//
//public class Empregado {
//
//	private double salarioFixo;
//
//	public Empregado(double salarioFixo) {
//		super();
//		this.salarioFixo = salarioFixo;
//	}
//	
//	public double getSalarioFixo() {
//		return salarioFixo;
//	}
//	
//	public double calcularBonus(Departamento departamento) {
//		// retorna o valor bônus do empregado conforme dados do empregado e do departamento.
//		if(departamento.alcancouMeta()) {
//			double percentual = 0.10;
//			return getSalarioFixo()*percentual;
//		}		
//		return 0;
//	}
//	
//	public double calcularSalarioTotal(Departamento departamento) {
//		//retorna o valor do salário fixo do empregado acrescentado de seu bônus.
//		return this.salarioFixo + calcularBonus(departamento);
//	}
//}
