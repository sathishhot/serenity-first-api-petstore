package starter.petstore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenFetchingAlreadyAvailablePet {
	
		Long newPetID = null;
		PetApiActions petApi;

		@Test
		public void fetchAlreadyAvailablePet() {
			newPetID = petApi.givenKittyIsAvailableInPetStore();
			petApi.whenIAskForAPetwithId(newPetID);
			petApi.thenISeeKittyAsResult();
		}
}
