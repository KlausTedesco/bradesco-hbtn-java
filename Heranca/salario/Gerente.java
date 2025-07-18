//
//public class Gerente extends Empregado{
//
//	public Gerente(double salarioFixo) {
//		super(salarioFixo);
//	}
//
//	@Override
//	public double calcularBonus(Departamento departamento) {
//		// retorna o valor bônus do empregado conforme dados do empregado e do departamento.
//		if(departamento.alcancouMeta()) {
//			double percentualBonus = 0.20;
//			double bonus = getSalarioFixo()*percentualBonus;
//			double percentualBonusExtra = 0.01;
//			double diferencaMeta = departamento.getValorAtingidoMeta()-departamento.getValorMeta();
//			double bonusExtra = diferencaMeta*percentualBonusExtra;
//			return bonus+bonusExtra;
//		}		
//		return 0;
//	}
//}
