/*
 * generated by Xtext 2.9.1
 */
package org.casualintellect.ui.tests;

import com.google.inject.Injector;
import org.casualintellect.editor1.ui.internal.Editor1Activator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class CasualIntellectUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Editor1Activator.getInstance().getInjector("org.casualintellect.CasualIntellect");
	}

}
