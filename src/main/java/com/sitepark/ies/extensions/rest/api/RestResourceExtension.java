package com.sitepark.ies.extensions.rest.api;

import java.util.List;

/**
 * Contributes controllers to the REST API of the IES ({@code /api/rest}).
 *
 * <p>The controllers are Spring MVC controllers ({@code @RestController}) with their mappings
 * relative to {@code /api/rest}, e.g. {@code @RequestMapping("/v1/users")} is served at {@code
 * /api/rest/v1/users}. The IES creates them in the context of the extensions, with constructor
 * injection ({@code jakarta.inject.Inject}), and registers their mappings whenever the extensions
 * are loaded; a reload of the extensions replaces them.
 *
 * <p>Every public handler method must declare whether it requires an authentication
 * ({@code @Authenticated} or {@code @Unauthenticated} of the IES security API). The OpenAPI of the
 * REST API is generated from the controllers and their OpenAPI annotations ({@code
 * io.swagger.v3.oas.annotations}).
 */
@SuppressWarnings("PMD.ImplicitFunctionalInterface")
public interface RestResourceExtension {

  /**
   * The packages whose {@code @RestController} classes are controllers of the REST API, including
   * their sub packages.
   */
  List<String> getResourcePackages();

  /** Further {@code @RestController} classes outside of the packages. */
  default List<Class<?>> getResourceClasses() {
    return List.of();
  }
}
