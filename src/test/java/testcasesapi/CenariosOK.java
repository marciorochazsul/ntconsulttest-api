package testcasesapi;


import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import executavel.RunSuiteTest;





@RunWith(RunSuiteTest.class)
public class CenariosOK {
	
	
   
	public CenariosOK() {
		baseURI = "https://jsonplaceholder.typicode.com/posts";
	}
	
	@Test
	public void criaNovoPostComSucesso() {
		
		String myJson = "{\"userId\": \"1234\",\"id\": \"222\",\"title\": \"Post Teste\",\"body\": \"Teste Ntconsult\"}";
		
	given()
	   .header("Content-Type","application/json")
  	   .body(myJson)
  	 .when()
  	   .post("/")
  	.then()
  	   .statusCode(201)
  	   .body("id",is("222"));
	}
	
	@Test
	public void buscaPostPeloIdComSucesso() {		
		
	given()
	   .header("Content-Type","application/json")
  	   .param("id", "1")
  	 .when()
  	   .get("/")
  	.then()
  	   .statusCode(200)
  	   .body("id",hasItems(1));
	}
	
	@Test
	public void editandoPostComSucesso() {		
		
		String myJson = "{\"userId\": \"10\",\"id\": \"1\",\"title\": \"Editando dados\",\"body\": \"Teste Ntconsult\"}";
		
	given()
	   .header("Content-Type","application/json")
  	   .body(myJson)
  	 .when()
  	   .put("https://jsonplaceholder.typicode.com/posts/1")
  	.then()
  	   .statusCode(200)
  	   .and()
  	   .body("title",equalTo("Editando dados"));
	}

	
	
	
}