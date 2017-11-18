
package org.example;

import org.springframework.context.support.GenericApplicationContext;

class SpringApplication {

	// @Nullable is annotated with @Nonnull(when = When.MAYBE), where
	// When.MAYBE is an enum constant defined in javax.annotation.meta.When.
	//
	// Compilation of this method results in the following compiler warning.
	//
	// warning: unknown enum constant When.MAYBE
	//  reason: class file for javax.annotation.meta.When not found
	//
	@org.springframework.lang.Nullable
	Integer getNumber() {
		return null;
	}

	// Compilation of this method results in ZERO compiler warnings since
	// ApplicationContext#getId() is not directly annotated with an
	// annotation that references a type not present in the classpath.
	// Note, however, that ApplicationContext#getId() is in fact
	// annotated with @org.springframework.lang.Nullable which is
	// meta-annotated with @Nonnull(when = When.MAYBE).
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// getId() is annotated with @org.springframework.lang.Nullable
		new GenericApplicationContext().getId();
	}

}
