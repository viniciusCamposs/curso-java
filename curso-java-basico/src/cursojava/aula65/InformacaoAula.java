package cursojava.aula65;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "http://blog.com";
	
	String site() default "http://site.com";
	
}