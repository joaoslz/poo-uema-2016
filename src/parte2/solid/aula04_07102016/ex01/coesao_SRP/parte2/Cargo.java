package parte2.solid.aula04_07102016.ex01.coesao_SRP.parte2;

public enum Cargo {
    DESENVOLVEDOR ( new RegraDeDezOuVintePorcento() ),
    DBA ( new RegraDeQuinzeOuVinteCincoPorcento() ) ,
    TESTER ( new RegraDeQuinzeOuVinteCincoPorcento() );
    
    
    private RegraDeCalculo regra;
    
    Cargo( RegraDeCalculo regra) {
    	this.regra = regra;
    }
    
    
    public RegraDeCalculo getRegra() {
		return regra;
	}
  
}

