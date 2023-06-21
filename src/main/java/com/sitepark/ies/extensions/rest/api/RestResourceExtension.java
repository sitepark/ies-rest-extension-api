package com.sitepark.ies.extensions.rest.api;

import java.util.List;

public interface RestResourceExtension {

	List<String> getResourcePackages();

	List<Class<?>> getResourceClasses();

}
