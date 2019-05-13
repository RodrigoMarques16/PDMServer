package pt.up.fc.dcc.pdm.core;

import com.google.inject.AbstractModule;

public class RESTModule extends AbstractModule {
	@Override
	public void configure() {
		bind(MovieServer.class).to(MovieServerImpl.class).asEagerSingleton();
	}
}
