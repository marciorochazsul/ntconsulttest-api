package testcasesapi;


import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import runListener.RunListenerTest;





@RunWith(RunListenerTest.class)
public class CenariosExcecao {
	
	
   
	public CenariosExcecao() {
		baseURI = "https://jsonplaceholder.typicode.com/posts";
	}
	
	@Test
	public void deveRetornarErroAoCriarPostSemUmCampo() {
		
		String myJson = "{\"userId\": \"1234\",\"title\": \"Post Teste\",\"body\": \"Teste Ntconsult\"}";
		
	given()
	   .header("Content-Type","application/json")
  	   .body(myJson)
  	 .when()
  	   .post("/")
  	.then()
  	   .statusCode(422);
  	 
	}
	
	@Test
	public void buscaPorPostInexistente() {		
		
	given()
	   .header("Content-Type","application/json")
  	   .param("id", "101")
  	 .when()
  	   .get("/")
  	.then()
  	   .statusCode(422);
	}
	
	
	
	
}