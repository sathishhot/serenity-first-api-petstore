package starter.petstore;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import net.serenitybdd.core.steps.UIInteractions;
import static net.serenitybdd.rest.SerenityRest.*;
import org.hamcrest.Matchers;


public class PetApiActions extends UIInteractions {

	@Given("Kitty is available in the petstore")
	public Long givenKittyIsAvailableInPetStore() {
		Pet pet = new Pet("kitty","available");
		
		Long newId = given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/pet")
				.body(pet,ObjectMapperType.GSON)
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON).post().getBody().as(Pet.class,ObjectMapperType.GSON).getId()
				;
		return newId;		
				
	}
	
	@When("I ask for a pet using Kitty's ID:{0}")
	public void whenIAskForAPetwithId(Long id) {
		when().get("/"+id);
	}
	
	@Then("I get Kitty as result")
	public void thenISeeKittyAsResult() {	
		then().body("name", Matchers.equalTo("kitty"));
	}
}