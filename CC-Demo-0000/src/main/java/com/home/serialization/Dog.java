package com.home.serialization;

import java.io.Serializable;

public class Dog implements Serializable {

	private static final long serialVersionUID = 1L;

	int i = 10; // save value form of serializable form.
	
	transient int j = 20; // changed value and put default value of int i.e. 0.
	
	transient static int k = 30; // No use because static directly belong to class not for object.
	
	final transient int l = 40;  // No change in value because due to final keyword value changed at compile time.

}
