
package org.example;

class JUnitJupiterTests {

	// @Test is annotated with @API(status = STABLE, since = "5.0"), where
	// STABLE is an enum constant defined in org.apiguardian.api.API.Status.
	//
	// Compilation of this method results in the following compiler warning.
	//
	// warning: unknown enum constant Status.STABLE
	//  reason: class file for org.apiguardian.api.API$Status not found
	//
	@org.junit.jupiter.api.Test
	void test() {
	}

}
